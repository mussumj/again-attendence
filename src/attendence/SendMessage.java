/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendence;



import attendence.YourTask;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;


public class SendMessage  {
   
    public static void main(String args[]){
  Calendar today = Calendar.getInstance();
        System.out.println(today.getTime());
today.set(Calendar.HOUR_OF_DAY, 15);
today.set(Calendar.MINUTE, 10);
today.set(Calendar.SECOND, 0);


// every night at 2am you run your task
Timer timer = new Timer();
//timer.schedule(new YourTask(), today.getTime(), TimeUnit.MILLISECONDS.convert(1, TimeUnit.DAYS)); 
//timer.schedule(new YourTask(), today.getTime(), TimeUnit.MILLISECONDS.convert(1, TimeUnit.DAYS)); 
timer.schedule(new YourTask(),today.getTime());
    }

}

