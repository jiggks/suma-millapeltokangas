package observer;

import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Milla
 */

public class ClockTimer extends Observable implements Runnable {
    
    private int hour;
    private int minute;
    private int second;
    
    public ClockTimer() {
        hour = 0;
        minute = 0;
        second = 0;
    }
    
    public ClockTimer(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    public int getHour() {
        return hour;
    }
    
    public int getMinute() {
        return minute;
    }
    
    public int getSecond() {
        return second;
    }
    
    public void tick() {
        setChanged();
        notifyObservers();
        if (second == 59) {
            second = 0;
            if (minute == 59) {
                minute = 0;
                hour++;
            } else {
                minute++;
            }
        } else {
            second++;
        }
        clearChanged();
    }

    public void run() {
        int i = 0;
        while (i < 100) {
            tick();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ClockTimer.class.getName()).log(Level.SEVERE, null, ex);
            }
            i++;
        }
    }
}
