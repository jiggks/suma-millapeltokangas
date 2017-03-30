package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Milla
 */

public class DigitalClock implements Observer {
    
    private ClockTimer timer;
    
    public DigitalClock(ClockTimer timer) {
        this.timer = timer;
        this.timer.addObserver(this);
    }

    public void update(Observable o, Object arg) {
        if (o == timer) {
            draw();   
        }
    }
    
    private void draw() {
        int hour = timer.getHour();
        int minute = timer.getMinute();
        int second = timer.getSecond();
        String sHour = "" + hour;
        String sMinute = "" + minute;
        String sSecond = "" + second;
        if (hour < 10) {
            sHour = "0" + hour;
        } if (minute < 10) {
            sMinute = "0" + minute;
        } if (second < 10) {
            sSecond = "0" + second;
        }
        System.out.println("Kello on " + sHour + ":" + sMinute + ":" + sSecond);
    }

}
