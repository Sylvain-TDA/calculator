package fr.welcome;

import java.time.*;


public class Welcome {

    private final IDate iDate;

    public Welcome() {
        this(new GiveTimeAndDate());
    }

    public Welcome(IDate iDate) {
        this.iDate = iDate;
    }

    public String getMessage() {

        LocalTime time = iDate.getTime();
        //time = time.plus(Duration.ofHours(9)); //---> afternnon

        int dayOfTheWeek = iDate.getDayOfWeek();
        //dayOfTheWeek  = dayOfTheWeek+2; //----> weekend

        LocalTime morningStart = LocalTime.of(9, 0);
        LocalTime morningEnd = LocalTime.of(13, 0);
        LocalTime afternoonEnd = LocalTime.of(18, 0);

        boolean dayOfWeek = (dayOfTheWeek == 2 || dayOfTheWeek == 3 || dayOfTheWeek == 4 || dayOfTheWeek == 5 || dayOfTheWeek == 6);
        boolean dayOfWeekEnd = (dayOfTheWeek == 7 || dayOfTheWeek == 1);

        if (time.isAfter(morningStart) && time.isBefore(morningEnd) && dayOfWeek) {
            return "Bonjour";
        } else if (time.isAfter(morningEnd) && time.isBefore(afternoonEnd) && dayOfWeek) {
            return "Bon après-midi";
        } else if (dayOfWeekEnd || (dayOfTheWeek == 6 && time.isAfter(afternoonEnd)) || (dayOfTheWeek == 2 && time.isBefore(morningStart))) {
            return "Bon week-end";
        } else if (time.isAfter(afternoonEnd) || time.isBefore(morningStart) && dayOfWeek && dayOfTheWeek != 6) {
            return "Bonsoir";
        } else {
            return "Out of bound";
        }
    }
}
