package com.omar;

import java.util.Scanner;

public class Console {
    public static String enterBirthDate() {
        System.out.print(" Enter Your Birth Date(YYYYmmdd):");
        int BirthYear = new Scanner(System.in).nextInt();
        return BirthYear + "000000";
    }
}
