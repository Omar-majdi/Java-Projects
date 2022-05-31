package com.omar;

import java.util.Scanner;

public class PrintMain {

    public static int printMainMassage() {
        System.out.println("Please Chose the Time format of your age");
        System.out.println("1- Year");
        System.out.println("2- Month");
        System.out.println("3- Week");
        System.out.println("4- Day");
        System.out.println("5- Hour");
        System.out.println("6- Minute");
        System.out.println("7- Second");
        System.out.println("8- All");
        int choice = new Scanner(System.in).nextInt();
        return choice;
    }
}
