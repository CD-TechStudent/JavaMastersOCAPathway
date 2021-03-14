package com.codedifferently.core.fundamentals.week01.labA;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestMathUtilities {

    private static volatile MathUtilities mathUtils = new MathUtilities();

    @Test
    public void testIntegerAddition() {
        // : Given
        int baseValue = 20;
        int addedValue = 7;
        int expected = 27;
        // : When
        int actual = mathUtils.add(baseValue, addedValue);
        // : Then
        assertEquals(expected, actual);
    }

    @Test
    public void testLongAddition() {
        // : Given
        long baseValue = 228437266;
        long difference = 228437265;
        long expected = 456874531;
        // : When
        long actual = mathUtils.add(baseValue, difference);
        // : Then
        assertEquals(expected, actual);
    }

    @Test
    public void testShortAddition() {
        // : Given
        short baseValue = 16384;
        short addedValue = 7;
        short expected = 16391;
        // : When
        short actual = mathUtils.add(baseValue, addedValue);
        // : Then
        assertEquals(expected, actual);
    }

    @Test
    public void testByteAddition() {
        // : Given
        byte baseValue = 63;
        byte addedValue = 64;
        byte expected = 127;
        // : When
        byte actual = mathUtils.add(baseValue, addedValue);
        // : Then
        assertEquals(expected, actual);
    }

    @Test
    public void testFloatAddition() {
        // : Given
        float baseValue = 750.585F;
        float addedValue = 795.000F;
        float expected = 1545.585F;
        // : When
        float actual = mathUtils.add(baseValue, addedValue);
        // : Then
        assertEquals(expected, actual, 0);
    }

    @Test
    public void testDoubleAddition() {
        // : Given
        double baseValue = 225.25;
        double addedValue = 231;
        double expected = 456.25;
        // : When
        double actual = mathUtils.add(baseValue, addedValue);
        // : Then
        assertEquals(expected, actual, 0);
    }

    /** Division **/

    @Test
    public void testIntegerDivision() {
        // : Given
        int dividend = 20;
        int divisor = 2;
        int expectedInt = 10;
        // : When
        int actualInt = mathUtils.divide(dividend, divisor);
        // : Then
        assertEquals(expectedInt, actualInt);
    }

    @Test
    public void testLongDivision() {
        // : Given
        long dividend = 20000000L;
        long divisor = 1000L;
        long expectedLong = 20000;
        // : When
        long actualLong = mathUtils.divide(dividend, divisor);
        // : Then
        assertEquals(expectedLong, actualLong);
    }

    @Test
    public void testShortDivision() {
        // : Given
        short dividend = 2;
        short divisor = 1;
        short expectedShort = 2;
        // : When
        short actualShort = mathUtils.divide(dividend, divisor);
        // : Then
        assertEquals(expectedShort, actualShort);

    }

    @Test
    public void testByteDivision() {
        // : Given
        byte dividend = 64;
        byte divisor = 32;
        byte expectedByte = 2;
        // : When
        byte actualByte = mathUtils.divide(dividend, divisor);
        // : Then
        assertEquals(expectedByte, actualByte);
    }

    @Test
    public void testFloatDivision() {
        // : Given
        float dividend = 7.5F;
        float divisor = 3;
        float expectedFloat = 2.50F;
        // : When
        float actualFloat = mathUtils.divide(dividend, divisor);
        // : Then
        assertEquals(expectedFloat, actualFloat, 0);
    }

    @Test
    public void testDoubleDivision() {
        // : Given
        double dividend = 5.0;
        double divisor = 4.0;
        double expectedDouble = 1.25;
        // : When
        double actualDouble = mathUtils.divide(dividend, divisor);
        // : Then
        assertEquals(expectedDouble, actualDouble, 0);
    }

    /** Multiplication **/

    @Test
    public void testIntegerMultiplication(){
        // : Given
        int multiplicand = 5;
        int multiplier = 2;
        int expectedInt = 10;
        // : When
        int actualInt = mathUtils.multiply(multiplicand,multiplier);
        // : Then
        assertEquals(expectedInt,actualInt);
    }
    @Test
    public void testLongMultiplication() {
        // : Given
        long multiplicand = 20;
        long multiplier = 1000;
        long expectedLong = 20000;
        // : When
        long actualLong = mathUtils.multiply(multiplicand, multiplier);
        // : Then
        assertEquals(expectedLong, actualLong);
    }
    @Test
    public void testShortMultiplication() {
        // : Given
        short multiplicand = 2;
        short multiplier = 1;
        short expectedShort = 2;
        // : When
        short actualShort = mathUtils.multiply(multiplicand, multiplier);
        // : Then
        assertEquals(expectedShort, actualShort);
    }
    @Test
    public void testByteMultiplication() {
        // : Given
        byte multiplicand = 16;
        byte multiplier = 14;
        byte expectedByte = 64;
        // : When
        byte actualByte = mathUtils.multiply(multiplicand, multiplier);
        // : Then
        assertEquals(expectedByte, actualByte);
    }
    @Test
    public void testFloatMultiplication() {
        // : Given
        float multiplicand = 2.5F;
        float multiplier = 1;
        float expectedFloat = 2.50F;
        // : When
        float actualFloat =  mathUtils.multiply(multiplicand,multiplier);
        // : Then
        assertEquals(expectedFloat, actualFloat, 0);
    }
    @Test
    public void testDoubleMultiplication() {
        // : Given
        double multiplicand = 3.25;
        double multiplier = 3.0;
        double expectedDouble = 9.75;
        // : When
        double actualDouble = mathUtils.multiply(multiplicand,multiplier);
        // : Then
        assertEquals(expectedDouble, actualDouble, 0);
    }

    /** Subtraction **/

    @Test
    public void testIntegerSubtraction(){
        // : Given
        int baseValue = 20;
        int difference = 7;
        int expectedInt = 13;
        // : When
        int actualInt = mathUtils.subtract(baseValue,difference);
        // : Then
        assertEquals(expectedInt,actualInt);
    }
    @Test
    public void testLongSubtraction() {
        // : Given
        long baseValue = 228437266;
        long difference = 228437265;
        long expectedLong = 1;
        // : When
        long actualLong = mathUtils.subtract(baseValue, difference);
        // : Then
        assertEquals(expectedLong,actualLong);
    }
    @Test
    public void testShortSubtraction() {
        // : Given
        short baseValue = 16384;
        short difference = 16383;
        short expectedShort = 1;
        // : When
        short actualShort = mathUtils.subtract(baseValue, difference);
        // : Then
        assertEquals(expectedShort,actualShort);
    }
    @Test
    public void testByteSubtraction() {
        // : Given
        byte baseValue = 63;
        byte difference = 64;
        byte expectedByte = -1;
        // : When
        byte actualByte = mathUtils.subtract(baseValue, difference);
        // : Then
        assertEquals(expectedByte,actualByte);
    }
    @Test
    public void testFloatSubtraction() {
        // : Given
        float baseValue = 750.585F;
        float difference = 795.0F;
        float expectedFloat = -44.415F;
        // : When
        float actualFloat = mathUtils.subtract(baseValue,difference);
        // : Then
        assertEquals(expectedFloat,actualFloat, 0.005);
    }
    @Test
    public void testDoubleSubtraction() {
        // : Given
        double baseValue = 225.25;
        double difference = 231;
        double expectedDouble = -5.75;
        // : When
        double actualDouble = mathUtils.subtract(baseValue, difference);
        // : Then
        assertEquals(expectedDouble,actualDouble, 0);
    }


}
