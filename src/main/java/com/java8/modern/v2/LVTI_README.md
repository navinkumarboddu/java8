# Local Variable Type Inference (LVTI)

Local Variable Type Inference (LVTI) is a feature introduced in **Java 10** that allows developers to declare local variables using the `var` keyword, letting the compiler infer the type based on the initializer.

## 🔍 Basic Example

```java
// Traditional declaration
String message = "Hello, World!";

// With LVTI
var message = "Hello, World!"; // inferred as String
```

## 📚 Examples with Generics

```java
var map = new HashMap<String, List<Integer>>(); // inferred as HashMap<String, List<Integer>>
var entrySet = map.entrySet(); // inferred as Set<Map.Entry<String, List<Integer>>>
```

## 🔄 Example with Streams

```java
var numbers = List.of(1, 2, 3, 4, 5);
var evenNumbers = numbers.stream()
                         .filter(n -> n % 2 == 0)
                         .collect(Collectors.toList()); // inferred as List<Integer>

for (var num : evenNumbers) {
    System.out.println(num);
}
```

## ⚠️ Edge Cases

```java
var nothing = null; // ❌ Compilation error: Cannot infer type

var lambda = (String s) -> s.length(); // ❌ Compilation error (prior to Java 11)

var list = new ArrayList<>();
list.add("Hello");
list.add(123); // ✅ But not recommended: inferred type is ArrayList<Object>
```

## ✅ Best Practices

- Use `var` when the type is **clear** from the context.
- Avoid `var` if it **reduces code readability**.
- LVTI can only be used for **local variables**, including:
  - Local variables in methods/blocks
  - Enhanced `for` loop variables
  - Try-with-resources variables

## ❌ Limitations

- Cannot be used for:
  - Method parameters
  - Constructor parameters
  - Method return types
  - Fields or class-level variables

---

> 📝 LVTI helps reduce verbosity, especially when working with complex generics or streams. However, always prioritize **code clarity** over brevity.
