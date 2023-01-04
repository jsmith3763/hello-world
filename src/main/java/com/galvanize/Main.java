package com.galvanize;

public class Main {
    public static void main(String[] args) {
        // NEW: Get the greeting from a system environment variable
        String greeting = System.getenv("GREETING");
        // Variable for the name, defaulted to "World"
        String name = "World";
        // Check to see if an argument was provided
        if (args.length > 0)
            // If it has, the place that value in the name variable
            name = args[0];
        // MODIFIED: add the variable `greeting` instead of the literal "Hello
        System.out.println(greeting+" "+name+"!");
    }
}