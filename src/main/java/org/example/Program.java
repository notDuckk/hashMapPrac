package org.example;

import java.util.HashMap;

public class Program {

    private HashMap<String, String> hashMap;

    public Program() {
        this.hashMap = new HashMap<>();
    }

    public static void printKeys(HashMap<String,String> hashMap) {
        for (String key : hashMap.keySet()) {
            System.out.println(key);
        }
    }

    public static void printKeysWhere(HashMap<String,String> hashMap, String text) {
        for (String key : hashMap.keySet()) {
            if (key.contains(text)) {
                System.out.println(key);
            }
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String,String> hashMap, String text) {
        for (String value : hashMap.keySet()) {
            if (value.contains(text)) {
                System.out.println(hashMap.get(value));
            }
        }

    }
}
