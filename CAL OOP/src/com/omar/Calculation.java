package com.omar;

import java.util.Scanner;

public class Calculation {
    private static int first;
    private static int second;
    public static void calculate() {
        Scanner scanner = new Scanner(System.in);


        boolean isLooping = true;
        while (isLooping) {
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();


            switch (choice) {
                case 1 -> {
                    System.out.println("Enter the first number");
                    first = scanner.nextInt();
                    System.out.println("Enter the second number");
                    second = scanner.nextInt();
                    System.out.println("The sum of " + first + " and " + second + " is: " + (first + second));
                }
                case 2 -> {
                    System.out.println("Enter the first number");
                    first = scanner.nextInt();
                    System.out.println("Enter the second number");
                    second = scanner.nextInt();
                    System.out.println("The sub of " + first + " and " + second + " is: " + (first - second));
                }
                case 3 -> {
                    System.out.println("Enter the first number");
                    first = scanner.nextInt();
                    System.out.println("Enter the second number");
                    second = scanner.nextInt();
                    System.out.println("The mul of " + first + " and " + second + " is: " + (first * second));
                }
                case 4 -> {
                    System.out.println("Enter the first number");
                    first = scanner.nextInt();
                    System.out.println("Enter the second number");
                    second = scanner.nextInt();
                    System.out.println("The div of " + first + " by " + second + " is: " + (first / second));
                }
                case 5 -> {
                    System.out.println("Enter the first number");
                    first = scanner.nextInt();
                    System.out.println("Enter the second number");
                    second = scanner.nextInt();
                    System.out.println("The power of " + first + " to the " + second + " is: " + (Math.pow(first, second)));
                }
                case 6 -> {
                    System.out.println("Enter the number");
                    first = scanner.nextInt();
                    System.out.println("The Abs of " + first + " is: " + (Math.abs(first)));
                }
                case 7 -> {
                    System.out.println("Enter the width");
                    first = scanner.nextInt();
                    System.out.println("Enter the height");
                    second = scanner.nextInt();
                    System.out.println("The Area of " + first + " and " + second + " is: " + (first * second));
                }
                case 8 -> {
                    System.out.println("Enter the first number");
                    first = scanner.nextInt();
                    System.out.println("Enter the second number");
                    second = scanner.nextInt();
                    System.out.println("The Min of " + first + " and " + second + " is: " + (Math.min(first, second)));
                }
                case 9 -> {
                    System.out.println("Enter the first number");
                    first = scanner.nextInt();
                    System.out.println("Enter the second number");
                    second = scanner.nextInt();
                    System.out.println("The Max of " + first + " and " + second + " is: " + (Math.max(first, second)));
                }
                case 10 -> {
                    System.out.println("Enter the number");
                    first = scanner.nextInt();
                    System.out.println("The Sqrt of " + first + " is: " + (Math.sqrt(first)));
                }
                case 11 -> {
                    System.out.println("Enter the  number");
                    first = scanner.nextInt();
                    System.out.println("The cos of " + first + " is: " + (Math.cos(first)));
                }
                case 12 -> {
                    System.out.println("Enter the  number");
                    first = scanner.nextInt();
                    System.out.println("The tan of " + first + " is: " + (Math.tan(first)));
                }
                default -> System.out.println("Invalid choice");
            }
            System.out.println("Do you need more time? (yes/no)");
            String yesOrNo = scanner.next();
            if ("no".toLowerCase().equals(yesOrNo)) isLooping = false;
        }
    }
}
