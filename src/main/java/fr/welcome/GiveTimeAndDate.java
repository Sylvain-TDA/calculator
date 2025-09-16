package fr.welcome;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class GiveTimeAndDate implements IDate {

    public int getDayOfWeek() {
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal.get(Calendar.DAY_OF_WEEK);
    }

    public LocalTime getTime() {
        LocalDateTime ldt = LocalDateTime.now();

        return ldt.toLocalTime();
    }
}
