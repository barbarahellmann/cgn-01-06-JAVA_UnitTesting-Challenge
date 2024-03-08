package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void calculateSum_shouldReturn20_whenCalledWith5and15(){
    //GIVEN
        int a=5;
        int b=15;
        int expected = 20;
    // WHEN
        int actual = Main.calculateSum(a,b);
    //THEN
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void isEven_shouldReturnTrue_whenCalledWith8(){
        //GIVEN
        int c=8;
        //WHEN
        boolean actual = Main.isEven(c);
        //THEN
        Assertions.assertTrue(actual);
    }

    @Test
    void multiply_shouldReturn56_whenCalledWith7and8(){
        //GIVEN
        int a=7;
        int b=8;
        int expected = 56;
        //WHEN
        int actual = Main.multiply(a,b);
        //THEN
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void toUpperCase_shouldReturnABCDEF_whenCalledWithabcdef(){
        //GIVEN
        String text = "abcdef";
        String expected = "ABCDEF";
        //WHEN
        String actual = Main.toUpperCase(text);
        //THEN
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void isPositive_shouldReturnTrue_whenCalledWith5() {
        //GIVEN
        int a = 5;
        //WHEN
        boolean actual = Main.isPositive(a);
        //THEN
        Assertions.assertTrue(actual);
    }
    @Test
    void isPositive_shouldReturnFalse_whenCalledWith0() {
        //GIVEN
        int a = 0;
        //WHEN
        boolean actual = Main.isPositive(a);
        //THEN
        Assertions.assertFalse(actual);
    }


}