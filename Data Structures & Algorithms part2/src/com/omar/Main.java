package com.omar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int in = scanner.nextInt();
        if (in % 2 == 0)
            System.out.println("this number is odd");
        else
            System.out.println("this number is even");
    }
}
