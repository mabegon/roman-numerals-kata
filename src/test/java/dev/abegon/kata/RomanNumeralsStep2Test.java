package dev.abegon.kata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class RomanNumeralsStep2Test {

    @Parameterized.Parameter(value = 0)
    public int arabicNumber;

    @Parameterized.Parameter (value = 1)
    public String romanNumber;

    @Parameterized.Parameters(name = "{index}: Should_return_{0}_when_input_is_{1}()")
    public static Collection data() {
        return Arrays.asList(new Object[][]{
                {1, "I"},
                {2, "II"}
        });
    }

    @Test
    public void romanToArabic() {
        assertEquals(arabicNumber, RomanNumerals.romanToArabic(romanNumber));
    }
}