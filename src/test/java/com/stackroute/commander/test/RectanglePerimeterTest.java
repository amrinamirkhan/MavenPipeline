package com.stackroute.commander.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.stackroute.RectanglePerimeter;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class RectanglePerimeterTest
{
    private static RectanglePerimeter rectanglePerimeter;
    @BeforeAll
    public static void setup(){
        rectanglePerimeter = new RectanglePerimeter();
    }
    @AfterAll
    public static void tearDown(){
        rectanglePerimeter = null;
    }
    @Test
    public void givenTwoIntegersThenReturnDoubleResult()
    {
       assertEquals(16,rectanglePerimeter.perimeterCalculator(6,2),"Check the logic and datatype of the method");
    }

    @Test
    public void givenTwoFloatsThenReturnDoubleResult()
    {
        assertEquals(29.6,rectanglePerimeter.perimeterCalculator(4.9,9.9),"Check the logic and datatype of the method");
    }

    @Test
    public void givenTwoDoublesThenReturnDoubleResult()
    {
        assertEquals(2577.1346652,rectanglePerimeter.perimeterCalculator(356.4555556,932.111777),"Check the logic and datatype of the method");
    }
}
