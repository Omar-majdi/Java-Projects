package com.omar;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
//This code was written in (11/1/2021)

    public static void main (String[]args) {
        int choice = PrintMain.printMainMassage();
        Scanner scanner = new Scanner(System.in);

        boolean wantToTryAgain = true;

        long result = 0;
        while (wantToTryAgain) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
            LocalDateTime BirthDate = LocalDateTime.parse(Console.enterBirthDate(), formatter);
            LocalDateTime now = LocalDateTime.now();
            System.out.println("Current Time: " + now);
            System.out.println("Birth date: " + BirthDate);

            if (choice == 1)
                result = SingleCalculate.getYears(now, BirthDate);

            else if (choice == 2)
                result = SingleCalculate.getMonth(now, BirthDate);

            else if (choice == 3)
                result = SingleCalculate.getWeek(now, BirthDate);

            else if (choice == 4)
                result = SingleCalculate.getDays(now, BirthDate);

            else if (choice == 5)
                result = SingleCalculate.getHour(now, BirthDate);

            else if (choice == 6)
                result = SingleCalculate.getMinute(now, BirthDate);

            else if (choice == 7)
                result = SingleCalculate.getSecond(now, BirthDate);

            else if (choice == 8)
                Calculate.calculateAll(now, BirthDate);

            if (choice != 8)
                System.out.println("result=" + "(" + result + ")");


            System.out.println("Do you need more time? (yes/no)");
            String yesOrNo = scanner.next();
            if ("no".toLowerCase().equals(yesOrNo)) wantToTryAgain = false;

        }

    }
}
