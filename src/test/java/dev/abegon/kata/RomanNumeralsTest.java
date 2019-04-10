package dev.abegon.kata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(value = Parameterized.class)
public class RomanNumeralsTest {

    @Parameterized.Parameter(value = 0)
    public int arabicNumber;

    @Parameterized.Parameter (value = 1)
    public String romanNumber;

    @Parameterized.Parameters(name = "{index}: Should_return_{1}_when_input_is_{0}()")
    public static Collection data() {
        return Arrays.asList(new Object[][]{
                {1, "I"},
                {2, "II"},
                {3, "III"},
                {4, "IV"},
                {5, "V"},
                {6, "VI"},
                {9,"IX"},
                {14,"XIV"},
                {40,"XL"},
                {50,"L"},
                {90,"XC"},
                {100,"C"},
                {1000,"M"},
                {3000,"MMM"}
        });
    }


    @Test
    public void test_arabicToRoman()
    {
        assertEquals(romanNumber, RomanNumerals.arabicToRoman(arabicNumber));
    }



}