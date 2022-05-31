package com.omar;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
public class Main {
//This code was written in (11/1/2021)

    public static void main(String[] args) {
        int choice = printMainMassage();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        LocalDateTime BirthDate = LocalDateTime.parse(enterBirthDate(), formatter);
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current Time: " + now);
        System.out.println("Birth date: " + BirthDate);
        long result = 0;
        if (choice == 1) {
            result = getYears(now, BirthDate);
        } else if (choice == 2) {
            result = getMonth(now, BirthDate);
        } else if (choice == 3) {
            result = getWeek(now, BirthDate);
        } else if (choice == 4) {
            result = getDays(now, BirthDate);
        } else if (choice == 5) {
            result = getHour(now, BirthDate);
        } else if (choice == 6) {
            result = getMinute(now, BirthDate);
        } else if (choice == 7) {
            result = getSecond(now, BirthDate);
        } else if (choice == 8) {
            calculateAll(now, BirthDate);
        }
        if (choice != 8)
            System.out.println("result=" + "(" + result + ")");
    }




    public static void calculateAll(LocalDateTime now, LocalDateTime BirthDate){
        long Years = getYears(now, BirthDate);
        System.out.println("Years: " + Years);

        long Month = getMonth(now, BirthDate);
        System.out.println("Month: " + Month);

        long Week = getWeek(now, BirthDate);
        System.out.println("Week: " + Week);

        long Days = getDays(now, BirthDate);
        System.out.println("Days: " + Days);

        long Hour = getHour(now, BirthDate);
        System.out.println("Hour: " + Hour);

        long Minute = getMinute(now, BirthDate);
        System.out.println("Minute: " + Minute);

        long Second = getSecond(now, BirthDate);
        System.out.println("Second: " + Second);

    }
    private static String enterBirthDate () {
        System.out.print(" Enter Your Birth Date(YYYYmmdd):");
        int BirthYear = new Scanner(System.in).nextInt();
        return BirthYear + "000000";
    }

    public static int printMainMassage(){
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

    public static long getYears (LocalDateTime dt1, LocalDateTime dt2){
        long Years = ChronoUnit.YEARS.between(dt2, dt1);
        return Years;
    }

    public static long getMonth (LocalDateTime dt1, LocalDateTime dt2){
        long Month= ChronoUnit.MONTHS.between(dt2, dt1);
        return Month;
    }
    public static long getWeek (LocalDateTime dt1, LocalDateTime dt2){
        long Week = ChronoUnit.WEEKS.between(dt2, dt1);
        return Week;
    }
    public static long getDays (LocalDateTime dt1, LocalDateTime dt2){
        long Days = ChronoUnit.DAYS.between(dt2, dt1);
        return Days;            }

    public static long getHour (LocalDateTime dt1, LocalDateTime dt2){
        long Hour = ChronoUnit.HOURS.between(dt2, dt1);
        return Hour;
    }
    public static long getMinute (LocalDateTime dt1, LocalDateTime dt2){
        long Minute = ChronoUnit.MINUTES.between(dt2, dt1);
        return Minute;
    }
    public static long getSecond (LocalDateTime dt1, LocalDateTime dt2){
        long Second = ChronoUnit.SECONDS.between(dt2, dt1);
        return Second;
    }

}
