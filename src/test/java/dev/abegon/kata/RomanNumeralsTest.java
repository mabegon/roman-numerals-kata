package dev.abegon.kata;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumeralsTest {

    @Test
    public void Should_return_I_when_input_is_1()
    {
        assertEquals("I", RomanNumerals.arabicToRoman(1));
    }

    @Test
    public void Should_return_II_when_input_is_2()
    {
        assertEquals("II", RomanNumerals.arabicToRoman(2));
    }

    @Test
    public void Should_return_III_when_input_is_3()
    {
        assertEquals("III", RomanNumerals.arabicToRoman(3));
    }


    @Test
    public void Should_return_IV_when_input_is_4()
    {
        assertEquals("IV", RomanNumerals.arabicToRoman(4));
    }

    @Test
    public void Should_return_V_when_input_is_5()
    {
        assertEquals("V", RomanNumerals.arabicToRoman(5));
    }

    @Test
    public void Should_return_VI_when_input_is_6()
    {
        assertEquals("VI", RomanNumerals.arabicToRoman(6));
    }


    @Test
    public void Should_return_IX_when_input_is_9()
    {
        assertEquals("IX", RomanNumerals.arabicToRoman(9));
    }

    @Test
    public void Should_return_XIV_when_input_is_14()
    {
        assertEquals("XIV", RomanNumerals.arabicToRoman(14));
    }

}