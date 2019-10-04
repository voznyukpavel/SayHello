/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import org.apache.log4j.Logger;
import java.util.Calendar;
import junit.framework.TestCase;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Павел
 */
public class HelloTest extends TestCase {

    private static final Logger logger = Logger.getLogger(HelloTest.class);
    private final List<Calendartring> testWhatTimeIsItData = new ArrayList<Calendartring>();
    Calendartring calendartring;

    public HelloTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        Calendar calendar[] = new Calendar[6];
        for (int i = 0; i < calendar.length; i++) {
            calendar[i] = Calendar.getInstance();
        }

        calendar[0].set(Calendar.HOUR, 8);
        calendar[0].set(Calendar.AM_PM, 1);
        calendartring = new Calendartring("evening", calendar[0]);
        testWhatTimeIsItData.add(calendartring);

        calendar[1].set(Calendar.HOUR, 4);
        calendar[1].set(Calendar.AM_PM, 0);
        calendartring = new Calendartring("night", calendar[1]);
        testWhatTimeIsItData.add(calendartring);

        calendar[2].set(Calendar.HOUR, 8);
        calendar[2].set(Calendar.AM_PM, 0);
        calendartring = new Calendartring("morning", calendar[2]);
        testWhatTimeIsItData.add(calendartring);

        calendar[3].set(Calendar.HOUR, 11);
        calendar[3].set(Calendar.AM_PM, 0);
        calendartring = new Calendartring("day", calendar[3]);
        testWhatTimeIsItData.add(calendartring);

        calendar[4].set(Calendar.HOUR, 12);
        calendar[4].set(Calendar.AM_PM, 1);
        calendartring = new Calendartring("night", calendar[4]);
        testWhatTimeIsItData.add(calendartring);
        
        calendar[5].set(Calendar.HOUR, 11);
        calendar[5].set(Calendar.AM_PM, 1);
        calendartring = new Calendartring("night", calendar[5]);
        testWhatTimeIsItData.add(calendartring);
    }
        @Override
        protected void tearDown() throws Exception {
            super.tearDown();
        }
        /**
         * Test of main method, of class Hello.
         */
    public void testMain() {
        logger.info("test main");
        String[] args = null;
        Hello.main(args);

    }

    /**
     * Test of whatTimeIsIt method, of class Hello.
     */
    public void testWhatTimeIsIt() {
        logger.info("test testWhatTimeIsIt");
        for (Calendartring expected : testWhatTimeIsItData) {
            final String daytime = expected.getDaytime();
            Calendar calendar = expected.getCalendar();         
            final String actual = Hello.whatTimeIsIt(calendar);           
            if (daytime.equals(actual)) {
                logger.info("OK expected " + daytime + " " + "actual " + actual+" hour "+calendar.get(Calendar.HOUR)+" AM_PM "+calendar.get(Calendar.AM_PM));
            } else {
                logger.info("FAIL expected " + daytime + " " + "actual " + actual+" hour "+calendar.get(Calendar.HOUR)+" AM_PM "+calendar.get(Calendar.AM_PM));
            }
            assertEquals(daytime, actual);
        }

    }

    /**
     * Test of sayHello method, of class Hello.
     */
    public void testSayHello() {
        logger.info("test testSayHello");
        //     String st = "";
        //   Hello.sayHello(st);
        // TODO review the generated test code and remove the default call to fail.
        //      fail("The test case is a prototype.");
    }

}
