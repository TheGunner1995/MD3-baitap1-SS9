import org.junit.jupiter.api.Test;
import rikkei.academy.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestNextDay {
    @Test
    public void testNextDay1m1y2018(){
        int day = 1;
        int month =1;
        int year = 2018;
        String expected = 2 + "/" +  1 + "/" + 2018;
        String result = Calculator.NextDayCalculator(day,month,year);
        assertEquals(expected,result);
    }
    @Test
    public void testNextDay31m1y2018(){
        int day = 31;
        int month =1;
        int year = 2018;
        String expected = 1 + "/" +  2 + "/" + 2018;
        String result = Calculator.NextDayCalculator(day,month,year);
        assertEquals(expected,result);
    }
    @Test
    public void testNextDay30m4y2018(){
        int day = 30;
        int month =4;
        int year = 2018;
        String expected = 1 + "/" +  5 + "/" + 2018;
        String result = Calculator.NextDayCalculator(day,month,year);
        assertEquals(expected,result);
    }
    @Test
    public void testNextDay28m2y2018(){
        int day = 28;
        int month =2;
        int year = 2018;
        String expected = 1 + "/" +  3 + "/" + 2018;
        String result = Calculator.NextDayCalculator(day,month,year);
        assertEquals(expected,result);
    }
    @Test
    public void testNextDay29m2y2020(){
        int day = 29;
        int month =2;
        int year = 2020;
        String expected = 1 + "/" +  3 + "/" + 2020;
        String result = Calculator.NextDayCalculator(day,month,year);
        assertEquals(expected,result);
    }
    @Test
    public void testNextDay31m12y2018(){
        int day = 31;
        int month =12;
        int year = 2018;
        String expected = 1 + "/" +  1 + "/" + 2019;
        String result = Calculator.NextDayCalculator(day,month,year);
        assertEquals(expected,result);
    }
}
