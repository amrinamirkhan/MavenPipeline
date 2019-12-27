package com.stackroute.commander.test;

import com.stackroute.RectanglePerimeter;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectanglePerimeterMainTest {
    private static ByteArrayOutputStream outStream;
    private static RectanglePerimeter rectanglePerimeter;
    @BeforeAll
    public static void setup(){
        rectanglePerimeter = new RectanglePerimeter();
        outStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outStream));
    }

    @AfterAll
    public static void tearDown(){
        outStream = null;
        rectanglePerimeter = null;
    }

    @Test
    public void givenTwoIntegersThenReturnDoubleResult() {
        System.setIn(new ByteArrayInputStream("23 55".getBytes()));
        rectanglePerimeter.getValues();
        assertEquals("156.0",outStream.toString().trim().replaceAll(".*\n",""),"Check the logic and datatype of the scanner input");
    }
    @Test
    public void givenTwoFloatsThenReturnDoubleResult()
    {
        System.setIn(new ByteArrayInputStream("2.5 4.32".getBytes()));
        rectanglePerimeter.getValues();
        assertEquals("13.64",outStream.toString().trim().replaceAll(".*\n",""),"Check the logic and datatype of the scanner input");    }

    @Test
    public void givenTwoDoublesThenReturnDoubleResult()
    {
        System.setIn(new ByteArrayInputStream("1000.45454 256.22222".getBytes()));
        rectanglePerimeter.getValues();
        assertEquals("2513.3535199999997",outStream.toString().trim().replaceAll(".*\n",""),"Check the logic and datatype of the scanner input");    }
}
