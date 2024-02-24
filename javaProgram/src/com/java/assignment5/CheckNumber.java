package com.java.assignment5;

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        if (number > 0) {
            System.out.println("The number entered is positive.");
        } else if (number < 0) {
            System.out.println("The number entered is negative.");
        } else {
            System.out.println("The number entered is zero.");
        }

        scanner.close();
    }
}
