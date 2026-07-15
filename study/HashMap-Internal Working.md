# Java HashMap Internal Working (Java 21+) - Architect's Guide

> A complete architect-level guide to **HashMap internals**, covering hashing, bucket indexing, collision handling, treeification, resizing, performance tuning, and interview questions based on the latest OpenJDK implementation (Java 21+). :contentReference[oaicite:0]{index=0}

---

# Table of Contents

1. Introduction
2. Why HashMap?
3. Internal Architecture
4. HashMap Hierarchy
5. Internal Data Structures
6. Step-by-Step `put()`
7. Step-by-Step `get()`
8. Collision Handling
9. Treeification (Java 8+)
10. Resize & Rehash
11. Hash Function
12. Load Factor
13. Capacity
14. Time Complexity
15. `equals()` & `hashCode()` Contract
16. Fail-Fast Iterator
17. Common Production Mistakes
18. Architect's Decision Guide
19. Interview Questions
20. Summary

---

# 1. What is HashMap?

`HashMap` is a **hash table based implementation of the Map interface**.

It stores data as

```
Key → Value
```

Example

```java
Map<Integer, String> employees = new HashMap<>();

employees.put(101, "John");
employees.put(102, "Alice");
employees.put(103, "Bob");
```

---

# Why HashMap?

HashMap is designed for

- Fast lookup
- Fast insertion
- Fast deletion

Average complexity

```
O(1)
```

making it one of the most widely used collections in Java.

Typical use cases

- Caching
- Session storage
- Lookup tables
- Configuration
- Indexing
- API response mapping

---

# HashMap Hierarchy

```text
                    Object
                       │
                 AbstractMap
                       │
                    HashMap
                       │
                 LinkedHashMap
```

Implements

```text
Map
Cloneable
Serializable
```

---

# Internal Architecture

HashMap is **not** just a hash table.

It combines several data structures.

```text
                 HashMap

                    │

            Bucket Array (Node[])

                    │

      ┌─────────────┼─────────────┐

      │             │             │

   Bucket0      Bucket1      Bucket2

      │             │

      │         Node → Node → Node

      │

   TreeNode (if many collisions)
```

Internally it consists of

- Bucket Array
- Linked Nodes
- Red-Black Tree (when needed)

---

# Internal Node Structure

Each bucket stores a Node.

Conceptually:

```java
class Node<K,V> {

    final int hash;

    final K key;

    V value;

    Node<K,V> next;
}
```

Each node stores

- hash
- key
- value
- next node

When collisions occur,

multiple nodes are linked together.

---

# Default Configuration (Java 21)

| Property | Value |
|----------|------:|
| Default Capacity | 16 |
| Default Load Factor | 0.75 |
| Maximum Capacity | 2³⁰ |
| Treeify Threshold | 8 |
| Untreeify Threshold | 6 |
| Minimum Capacity for Treeification | 64 |

These constants have remained stable since Java 8 and continue in current OpenJDK releases. :contentReference[oaicite:1]{index=1}

---

# Internal Bucket Array

Initially

```text
Index

0

1

2

3

4

5

...

15
```

Capacity = 16

Initially every bucket is

```
null
```

---

# How put() Works

Suppose

```java
map.put("John",100);
```

---

## Step 1

Calculate

```java
hashCode()
```

Example

```
23014567
```

---

## Step 2

Hash Spreading

Modern HashMap spreads high bits into lower bits before computing the bucket index.

Conceptually

```java
hash = h ^ (h >>> 16);
```

This improves bucket distribution because bucket indexing uses the lower bits. :contentReference[oaicite:2]{index=2}

---

## Step 3

Calculate Bucket Index

```
index = hash & (capacity - 1)
```

If

```
capacity = 16
```

then

```
capacity - 1 = 15
```

```
hash & 15
```

Suppose

```
Index = 5
```

Store in bucket

```
Bucket[5]
```

---

# Bucket Before Insert

```text
Bucket[5]

null
```

After insertion

```text
Bucket[5]

John → 100
```

---

# Collision

Suppose another key

```
Alice
```

also maps to bucket

```
5
```

Now

```text
Bucket[5]

John

↓

Alice
```

Both entries remain because HashMap stores them as separate nodes.

---

# Collision Resolution

HashMap uses **separate chaining**.

```text
Bucket

↓

Node

↓

Node

↓

Node
```

Each bucket can contain

- no node
- one node
- multiple nodes
- a tree of nodes

---

# Java 7 vs Java 8+

## Before Java 8

```text
Bucket

↓

Linked List
```

Worst case

```
O(n)
```

---

## Java 8+

If a bucket becomes heavily populated

```text
Bucket

↓

Red Black Tree
```

Worst case

```
O(log n)
```

This protects against poor hash distributions and deliberate collision attacks. :contentReference[oaicite:3]{index=3}

---

# Treeification

Treeification happens only when

```
Bucket size >= 8
```

AND

```
Table Capacity >= 64
```

Otherwise

HashMap prefers resizing over creating a tree.

This avoids creating expensive tree nodes for small tables.

---

# Untreeification

If entries later decrease

```
Tree size <= 6
```

the tree converts back into a linked list.

---

# How get() Works

Suppose

```java
map.get("John");
```

---

### Step 1

Compute

```
hashCode()
```

---

### Step 2

Spread hash

---

### Step 3

Find bucket

---

### Step 4

Traverse bucket

If

```
hash matches
```

then

```
equals()
```

is called

to confirm the key.

Important:

HashMap first compares **hash**, then **equals()**.

---

# equals() and hashCode()

Correct implementation is mandatory.

Rule

If

```java
a.equals(b)
```

is true

then

```java
a.hashCode() == b.hashCode()
```

must also be true.

Violating this contract causes incorrect retrieval behavior.

---

# Resize

Default capacity

```
16
```

Load factor

```
0.75
```

Threshold

```
16 × 0.75 = 12
```

After inserting the 13th element,

HashMap resizes.

```
16

↓

32
```

Threshold becomes

```
32 × 0.75 = 24
```

---

# Rehash

During resize

every bucket is redistributed into the new array.

Modern implementations avoid recomputing the entire hash code; nodes are redistributed efficiently based on the new capacity. :contentReference[oaicite:4]{index=4}

---

# Why Capacity is Power of Two?

Possible capacities

```
16

32

64

128

256
```

Never

```
30

90

150
```

Reason

Fast index computation

```
hash & (capacity - 1)
```

instead of

```
hash % capacity
```

Bitwise operations are faster than modulo.

---

# Internal Flow

```text
put()

   │

hashCode()

   │

hash()

   │

Bucket Index

   │

Bucket Empty?

   │

Yes ─────────────► Insert

   │

No

   │

Collision

   │

Linked List

   │

Length >= 8 ?

   │

No ─────────────► Continue

   │

Yes

   │

Capacity >=64 ?

   │

No ─────────────► Resize

   │

Yes

   │

Treeify
```

---

# Time Complexity

| Operation | Average | Worst Case |
|------------|:------:|:----------:|
| put | O(1) | O(log n)* |
| get | O(1) | O(log n)* |
| remove | O(1) | O(log n)* |
| containsKey | O(1) | O(log n)* |

\* In modern Java after treeification. Without treeification (or before Java 8), heavily-collided buckets could degrade to O(n).

---

# Why HashMap is Not Thread-Safe?

HashMap performs

- resize
- insert
- remove

without synchronization.

Multiple threads can corrupt internal state.

For concurrent access use

```java
ConcurrentHashMap
```

instead.

---

# Fail-Fast Iterator

```java
Iterator<String> itr = map.keySet().iterator();
```

If another thread (or the same thread outside the iterator) modifies the map structurally,

```
ConcurrentModificationException
```

may occur.

This is a **best-effort** debugging mechanism and should not be relied upon for program correctness. :contentReference[oaicite:5]{index=5}

---

# Common Production Mistakes

## Bad hashCode()

```java
public int hashCode() {

    return 1;
}
```

Every key goes into the same bucket.

Performance collapses.

---

## Mutable Keys

```java
Employee e = new Employee(1);

map.put(e,"John");

e.setId(2);
```

The key's hash changes.

The entry becomes effectively unreachable.

Prefer immutable keys.

---

## Very Low Initial Capacity

Repeated resizing

↓

Memory allocations

↓

CPU overhead

If approximate size is known,

pre-size the map.

Example

```java
new HashMap<>(1000);
```

---

## Incorrect equals()

Always override

```
equals()
```

and

```
hashCode()
```

together.

---

# Architect's Best Practices

✅ Prefer immutable keys.

✅ Implement `equals()` and `hashCode()` correctly.

✅ Pre-size large maps to reduce resizing.

✅ Never rely on iteration order.

If order matters,

use

```
LinkedHashMap
```

If sorted order matters,

use

```
TreeMap
```

For concurrent access,

use

```
ConcurrentHashMap
```

---

# Interview Questions

## Why is HashMap O(1)?

Because hashing allows direct bucket access on average.

---

## Why can collisions happen?

Different keys can produce the same bucket index.

---

## Why is treeification introduced?

To improve worst-case performance from

```
O(n)

↓

O(log n)
```

---

## Why must capacity be a power of two?

To enable efficient index calculation using

```
hash & (capacity - 1)
```

---

## Why does HashMap call equals() after hash comparison?

Hash values are not guaranteed to be unique.

`equals()` confirms whether the keys are actually equal.

---

## Why isn't HashMap thread-safe?

Concurrent structural modifications can corrupt its internal state.

---

# Quick Revision

| Topic | Key Point |
|--------|-----------|
| Data Structure | Bucket Array + Linked List + Red-Black Tree |
| Default Capacity | 16 |
| Load Factor | 0.75 |
| Resize | Threshold = Capacity × Load Factor |
| Collision Handling | Separate Chaining |
| Treeify Threshold | 8 |
| Untreeify Threshold | 6 |
| Minimum Capacity for Treeification | 64 |
| Bucket Index | `hash & (capacity - 1)` |
| Thread Safe | No |
| Null Support | One null key, multiple null values |
| Iteration Order | Not guaranteed |
| Average Complexity | O(1) |
| Worst Case | O(log n) (tree bins) |

---

# Architect's Takeaway

`HashMap` is one of the most optimized and heavily used data structures in the JDK. Its performance comes from the combination of **hashing**, **bucket arrays**, **separate chaining**, **dynamic resizing**, and **Red-Black tree bins** introduced in Java 8.

When designing enterprise systems:

- Use **HashMap** for fast in-memory lookups.
- Size the map appropriately when the expected number of entries is known.
- Ensure keys are **immutable** and correctly implement `equals()`/`hashCode()`.
- Do **not** use `HashMap` for concurrent writes—choose `ConcurrentHashMap` instead.
- Remember that iteration order is unspecified; choose `LinkedHashMap` or `TreeMap` if ordering is part of the requirement.

> **Golden Rule:** A `HashMap` is only as good as the quality of your key's `hashCode()` and `equals()` implementations. Well-distributed hashes and immutable keys are fundamental to maintaining its expected O(1) performance.