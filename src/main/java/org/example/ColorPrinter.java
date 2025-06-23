package org.example;

public class ColorPrinter {
    private final String RED = "\u001B[31m";
    private final String RESET = "\u001B[0m";

    public void printlnRed(String message) {
//        System.out.println(RED + "Poopy Butt" + RESET);
    }

    public void println(String message) {
        System.out.println(message);
    }

}

