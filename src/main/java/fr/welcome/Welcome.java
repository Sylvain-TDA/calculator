package fr.welcome;

import java.time.*;
import java.util.Calendar;
import java.util.Date;


public class Welcome {

    public String getMessage() {
        String message = "";
        LocalDateTime ldt = LocalDateTime.now();
        //LocalDate fullDate = ldt.toLocalDate();

        LocalTime time = getTime();
        int dayOfTheWeek = getDayOfWeek();

        LocalTime morningStart = LocalTime.of(9,0);
        LocalTime morningEnd = LocalTime.of(13,0);
        LocalTime afternoonEnd =  LocalTime.of(18,0);

        if (time.isAfter(morningStart) && time.isBefore(morningEnd)) {
            return "Bonjour";
        } else if (time.isAfter(morningEnd) && time.isBefore(afternoonEnd)) {
            return "Bon après-midi";
        } else if (time.isAfter(afternoonEnd) && dayOfTheWeek != 5) {
            return "Bonsoir";
        } else {
            return "Bon week-end";
        }
    }

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
