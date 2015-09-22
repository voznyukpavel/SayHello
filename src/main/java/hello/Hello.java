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
        if (calendar.get(Calendar.HOUR) < 6 && calendar.get(Calendar.AM_PM) == 0) {
            return ("night");
        } else if (calendar.get(Calendar.HOUR) < 9 && calendar.get(Calendar.AM_PM) == 0) {
            return ("morning");
        } else if (calendar.get(Calendar.HOUR) < 7 && calendar.get(Calendar.AM_PM) == 1
                || calendar.get(Calendar.HOUR) <= 12 && calendar.get(Calendar.AM_PM) == 0) {
            return ("day");
        } else if (calendar.get(Calendar.HOUR) < 11 && calendar.get(Calendar.AM_PM) == 1) {
            return ("evening");
        } else {
            return ("night");
        }
    }

    static void sayHello(String st) {
        Locale current = new Locale(Locale.getDefault().getLanguage(), Locale.getDefault().getCountry());
        ResourceBundle rb
                = ResourceBundle.getBundle("text", current);
        st = rb.getString(st);
        System.out.println(st);
    }
}
