/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reminder;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author ALINE
 */
public class Reminder {

    Timer timer;

    public Reminder(int seconds) {
        timer = new Timer();
        timer.schedule(new RemindTask(),seconds*1000);
	}

    class RemindTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("Time's up!");
            timer.cancel(); //Terminate the timer thread
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
