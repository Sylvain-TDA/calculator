package test;

import fr.welcome.Welcome;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

public class WelcomeTest {

    @Test
    @DisplayName("Monday morning at 10AM")
    public void MorningTest() {
        FakeWelcome fakeWelcome = new FakeWelcome(LocalTime.of(10,0), 2);
        Welcome target = new Welcome(fakeWelcome);
        String message = target.getMessage();
        Assertions.assertEquals("Bonjour", message);
    }

    @Test
    @DisplayName("Monday afternoon at 2PM")
    public void AfternoonTest() {
        FakeWelcome fakeWelcome = new FakeWelcome(LocalTime.of(14,0), 2);
        Welcome target = new Welcome(fakeWelcome);
        String message = target.getMessage();
        Assertions.assertEquals("Bon après-midi", message);
    }

    @Test
    @DisplayName("Monday evening at 7PM")
    public void EveningTest() {
        FakeWelcome fakeWelcome = new FakeWelcome(LocalTime.of(19,0), 2);
        Welcome target = new Welcome(fakeWelcome);
        String message = target.getMessage();
        Assertions.assertEquals("Bonsoir", message);
    }

    @Test
    @DisplayName("Saturday morning at 10AM")
    public void WeekEndTest() {
        FakeWelcome fakeWelcome = new FakeWelcome(LocalTime.of(10,0), 7);
        Welcome target = new Welcome(fakeWelcome);
        String message = target.getMessage();
        Assertions.assertEquals("Bon week-end", message);
    }

    @Test
    @DisplayName("Sunday morning at 10AM")
    public void sundayTest() {
        FakeWelcome fakeWelcome = new FakeWelcome(LocalTime.of(10,0), 1);
        Welcome target = new Welcome(fakeWelcome);
        String message = target.getMessage();
        Assertions.assertEquals("Bon week-end", message);
    }

    @Test
    @DisplayName("Monday morning before 9AM")
    public void mondayMorningTest() {
        FakeWelcome fakeWelcome = new FakeWelcome(LocalTime.of(8,59), 2);
        Welcome target = new Welcome(fakeWelcome);
        String message = target.getMessage();
        Assertions.assertEquals("Bon week-end", message);
    }

    @Test
    @DisplayName("Tuesday morning at 1AM")
    public void tuesdayMorningTest() {
        FakeWelcome fakeWelcome = new FakeWelcome(LocalTime.of(1,48), 3);
        Welcome target = new Welcome(fakeWelcome);
        String message = target.getMessage();
        Assertions.assertEquals("Bonsoir", message);
    }

    @Test
    @DisplayName("Wednesday morning before 9AM")
    public void wednesdayBeforeMorningTest() {
        FakeWelcome fakeWelcome = new FakeWelcome(LocalTime.of(8,59), 4);
        Welcome target = new Welcome(fakeWelcome);
        String message = target.getMessage();
        Assertions.assertEquals("Bonsoir", message);
    }

    @Test
    @DisplayName("Friday evening at 8PM")
    public void fridayWeekEndTest() {
        FakeWelcome fakeWelcome = new FakeWelcome(LocalTime.of(19,59), 6);
        Welcome target = new Welcome(fakeWelcome);
        String message = target.getMessage();
        Assertions.assertEquals("Bon week-end", message);
    }

    @Test
    @DisplayName("Friday afternoon at 4PM")
    public void fridayAfternoonTest() {
        FakeWelcome fakeWelcome = new FakeWelcome(LocalTime.of(15,59), 6);
        Welcome target = new Welcome(fakeWelcome);
        String message = target.getMessage();
        Assertions.assertEquals("Bon après-midi", message);
    }
}
