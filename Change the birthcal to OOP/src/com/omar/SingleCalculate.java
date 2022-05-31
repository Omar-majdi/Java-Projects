package com.omar;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class SingleCalculate {
    public static long getYears(LocalDateTime dt1, LocalDateTime dt2) {
        long Years = ChronoUnit.YEARS.between(dt2, dt1);
        return Years;
    }

    public static long getMonth(LocalDateTime dt1, LocalDateTime dt2) {
        long Month = ChronoUnit.MONTHS.between(dt2, dt1);
        return Month;
    }

    public static long getWeek(LocalDateTime dt1, LocalDateTime dt2) {
        long Week = ChronoUnit.WEEKS.between(dt2, dt1);
        return Week;
    }

    public static long getDays(LocalDateTime dt1, LocalDateTime dt2) {
        long Days = ChronoUnit.DAYS.between(dt2, dt1);
        return Days;
    }

    public static long getHour(LocalDateTime dt1, LocalDateTime dt2) {
        long Hour = ChronoUnit.HOURS.between(dt2, dt1);
        return Hour;
    }

    public static long getMinute(LocalDateTime dt1, LocalDateTime dt2) {
        long Minute = ChronoUnit.MINUTES.between(dt2, dt1);
        return Minute;
    }

    public static long getSecond(LocalDateTime dt1, LocalDateTime dt2) {
        long Second = ChronoUnit.SECONDS.between(dt2, dt1);
        return Second;
    }
}
