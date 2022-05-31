package com.omar;

import java.time.LocalDateTime;

public class Calculate {
    public static void calculateAll(LocalDateTime now, LocalDateTime BirthDate) {
        long Years = SingleCalculate.getYears(now, BirthDate);
        System.out.println("Years: " + Years);

        long Month = SingleCalculate.getMonth(now, BirthDate);
        System.out.println("Month: " + Month);

        long Week = SingleCalculate.getWeek(now, BirthDate);
        System.out.println("Week: " + Week);

        long Days = SingleCalculate.getDays(now, BirthDate);
        System.out.println("Days: " + Days);

        long Hour = SingleCalculate.getHour(now, BirthDate);
        System.out.println("Hour: " + Hour);

        long Minute = SingleCalculate.getMinute(now, BirthDate);
        System.out.println("Minute: " + Minute);

        long Second = SingleCalculate.getSecond(now, BirthDate);
        System.out.println("Second: " + Second);

    }
}
