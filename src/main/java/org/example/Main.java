package org.example;

import java.util.HashMap;

import static org.example.Program.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> nickNames = new HashMap<>();

        nickNames.put("matthew's", "matt");
        nickNames.put("micheal's", "mix");
        nickNames.put("arthur's", "artie");

        System.out.println(nickNames.get("matthew's"));

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("f.e", "for example");
        hashMap.put("etc.", "and so on");
        hashMap.put("i.e","more precisely");

        printKeys(hashMap);
        System.out.println("---");
        printKeysWhere(hashMap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashMap,".e");



//        HashMap<String, Book> bookmap = new HashMap<>();
//        bookmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
//        bookmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));
//
//        printValues(bookmap);
//        System.out.println("---");
//        printValueIfNameContains(bookmap, "prejud");
    }


}