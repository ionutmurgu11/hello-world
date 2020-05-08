package com.ionutmurgu;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();

        if (languages.containsKey("Java")){
            System.out.println("Java allready exists");
        }else{
            languages.put("Java","a compiled high level OOP etc.");
            System.out.println("Java added succesfully");
        }

        languages.put("Lisp","Shitty language");
        languages.put("Python","an interpreted, object-oriented, high-level programming language with dynamic semantics");
        System.out.println(languages.put("Algol","an algorithmic language"));
        System.out.println(languages.put("BASIC","Begginers all purpouse language"));

        if(languages.containsKey("Java")){
            System.out.println("Java is allready in the map");
        }else {
            languages.put("Java","this course is about Java");
        }

        System.out.println("================================================================");

        //languages.remove("Lisp");
        if(languages.remove("Algol","an algorithmic language")){
            System.out.println("Algol removed");
        }else {
            System.out.println("Algol not removed, key/family not found");
        }

        if(languages.replace("Lisp","Shitty language","functional language full of imperative features")){
            System.out.println("Lisp replaced");
        }else{
            System.out.println("Lisp not replaced");
        }
        System.out.println(languages.replace("Scala","this will not be added"));

        for (String key : languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }
    }
}
