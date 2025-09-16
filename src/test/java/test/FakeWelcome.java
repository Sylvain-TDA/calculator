package test;

import fr.welcome.GiveTimeAndDate;
import fr.welcome.IDate;

import java.time.LocalDateTime;
import java.time.LocalTime;


public class FakeWelcome implements IDate {

    private final LocalTime localTime;
    private final int dayOfWeek;

   public FakeWelcome(LocalTime localTime, int dayOfWeek) {
        this.localTime = localTime;
        this.dayOfWeek = dayOfWeek;
   }

    @Override
    public LocalTime getTime() {
        return localTime;
    }

    @Override
    public int getDayOfWeek() {
        return dayOfWeek;
    }
}
