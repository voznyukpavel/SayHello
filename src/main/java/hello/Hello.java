/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import java.util.Calendar;
import java.util.Locale;
import java.util.ResourceBundle;

public class Hello {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        String hello = whatTimeIsIt(calendar);
        sayHello(hello);
    }

    static String whatTimeIsIt(Calendar calendar) {
        int ampm = calendar.get(Calendar.AM_PM);
        int hour = calendar.get(Calendar.HOUR);
        if (hour < 6 && ampm == 0) {
            return ("night");
        } else if (hour < 9 && ampm == 0) {
            return ("morning");
        } else if (hour <= 12 && ampm == 0 || hour < 7 && ampm == 1) {
            return ("day");
        } else if (hour < 11 && ampm == 1) {
            return ("evening");
        } else {
            return ("night");
        }
    }

    private static void sayHello(String st) {
        Locale current = new Locale(Locale.getDefault().getLanguage(), Locale.getDefault().getCountry());
        ResourceBundle rb = ResourceBundle.getBundle("text", current);
        st = rb.getString(st);
        System.out.println(st);
    }
}
