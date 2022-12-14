package org.example;

public class Main {
    public static void main(String[] args) {
        Info info = new Info("Kamil", "1.0.0", "2022");
        System.out.println(info.toJson());
    }
}