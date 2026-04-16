package com.java8.practice.bitwise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SingleAppearingNumber {

    public static void main(String[] args) {
        int[] arr = {2,3,4,1,2,1,3,6,4};

        Map<Integer, Long> frequency =
                Arrays.stream(arr)
                        .boxed()
                        .collect(Collectors.groupingBy(
                                n -> n,
                                Collectors.counting()
                        ));

        System.out.println(frequency);

        frequency.entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);

        int singleAppearingNumber = findSingleAppearingNumber(arr);
        System.out.println(singleAppearingNumber);
    }

    static int findSingleAppearingNumber(int[] arr) {
        int uniqueNumber = 0;
        for (int i: arr) {
            uniqueNumber ^= i;
        }
        return uniqueNumber;
    }
}
