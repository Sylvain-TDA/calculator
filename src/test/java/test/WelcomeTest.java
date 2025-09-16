package test;

import fr.welcome.Welcome;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

public class WelcomeTest {

    @Test
    public void MorningTest() {
        FakeWelcome fakeWelcome = new FakeWelcome(LocalTime.of(10,0), 2);
        Welcome target = new Welcome(fakeWelcome);
        String message = target.getMessage();
        Assertions.assertEquals("Bonjour", message);
    }

    @Test
    public void AfternoonTest() {
        FakeWelcome fakeWelcome = new FakeWelcome(LocalTime.of(14,0), 2);
        Welcome target = new Welcome(fakeWelcome);
        String message = target.getMessage();
        Assertions.assertEquals("Bon après-midi", message);
    }

    @Test
    public void EveningTest() {
        FakeWelcome fakeWelcome = new FakeWelcome(LocalTime.of(19,0), 2);
        Welcome target = new Welcome(fakeWelcome);
        String message = target.getMessage();
        Assertions.assertEquals("Bonsoir", message);
    }

    @Test
    public void WeekEndTest() {
        FakeWelcome fakeWelcome = new FakeWelcome(LocalTime.of(10,0), 7);
        Welcome target = new Welcome(fakeWelcome);
        String message = target.getMessage();
        Assertions.assertEquals("Bon week-end", message);
    }
}
