package observer;

/**
 * @author Milla
 */

public class Main {
    public static void main(String[] args) {
        ClockTimer timer = new ClockTimer(10, 58, 58);
        DigitalClock clock = new DigitalClock(timer);
        
        Thread t = new Thread(timer);
        t.start();
    }
}
