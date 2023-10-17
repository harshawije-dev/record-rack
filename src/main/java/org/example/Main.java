package org.example;

import org.example.enums.Status;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Status status = Status.INSTOCK;
        System.out.print(status.getValue());
    }
}