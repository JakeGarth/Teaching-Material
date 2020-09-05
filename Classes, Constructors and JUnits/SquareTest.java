package com.company;

import static org.junit.Assert.*;
        import org.junit.Test;

import java.util.Arrays;

public class SquareTest {

    /**
     * Tests for area correctness
     **/
    @Test
    public void areaTest1() {
        //int[] arr = {1, 2, 3};
        int[] arr  = null;
        Square square = new Square(4, 2, arr);
        int[] actual = square.getArr();
        int[] expected = null;
        boolean test = Arrays.toString(actual).equals(Arrays.toString(expected));

        System.out.println(Arrays.toString(actual));
        System.out.println(Arrays.toString(expected));

        assertEquals(true, test);
    }
}
/*
    @Test
    public void areaTest2() {

        Square square = new Square(10, 20);
        double actual = square.getArea();
        double expected = 200.0;

        assertEquals(expected, actual, 0.01);
    }


    @Test
    public void areaTestNegative1() {

        Square square = new Square(-10, 20);
        double actual = square.getArea();
        double expected = 200.0;

        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void areaTestNegative2() {

        Square square = new Square(-8, -2);
        double actual = square.getArea();
        double expected = 16;

        assertEquals(expected, actual, 0.01);
    }

}
*/