package com.company;

import java.util.WeakHashMap;

class Main {
    /* AŞAĞIDA WEAKHASHMAP YÖNTEMLERİNDEN ELEMAN EKLEME ÖRNEĞİ YAPTIM*/

    public static void main(String[] args) {
        // Creating WeakHashMap of even numbers
        WeakHashMap<String, Integer> evenNumbers = new WeakHashMap<>();

        String two = new String("Two");
        Integer twoValue = 2;

        // Using put()
        evenNumbers.put(two, twoValue);

        String four = new String("Four");
        Integer fourValue = 4;

        // Using putIfAbsent()
        evenNumbers.putIfAbsent(four, fourValue);
        System.out.println("Çift sayıların WeakHashMap'i " + evenNumbers);

        //Creating WeakHashMap of numbers
        WeakHashMap<String, Integer> numbers = new WeakHashMap<>();

        String one = new String("One");
        Integer oneValue = 1;
        numbers.put(one, oneValue);

        // Using putAll()
        numbers.putAll(evenNumbers);
        System.out.println("Sayıların WeakHashMap'i: " + numbers);
    }
}