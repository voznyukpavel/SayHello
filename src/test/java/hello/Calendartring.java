/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import java.util.Calendar;

/**
 *
 * @author Павел
 */
public class Calendartring {

    private final String daytime;
    private final Calendar calendar;

    Calendartring(String daytime,Calendar calendar){
         this.calendar = calendar;
          this.daytime = daytime;
    }
  
    public Calendar getCalendar() {
        return calendar;
    }

    public String getDaytime() {
        return daytime;
    }
}
