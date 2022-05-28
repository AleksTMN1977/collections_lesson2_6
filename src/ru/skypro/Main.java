package ru.skypro;


import java.util.*;

public class Main {
    private static final List<Integer> NUMS = List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7, 12, 12);

    private static final List<String> PRODUCT = List.of("мясо", "масло", "мясо", "молоко", "хлеб", "хлеб", "яйца", "творог", "масло");

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        for (Integer num : NUMS) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

    public static void task2() {
        List<Integer> nums = new ArrayList<>(NUMS);
        Collections.sort(nums);
        int prevNum = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num % 2 == 0 && num != prevNum) {
                System.out.println(num);
                prevNum = num;
            }
        }
    }

    public static void task3() {
        HashSet<String> product = new HashSet<>(PRODUCT);
        System.out.println(product);
    }

    public static void task4() {
        Set<String> product = new HashSet<>(PRODUCT);
        System.out.println(PRODUCT.size() - product.size());
    }
}

