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

    @Test
    public void Should_return_XL_when_input_is_40()
    {
        assertEquals("XL", RomanNumerals.arabicToRoman(40));
    }

    @Test
    public void Should_return_L_when_input_is_50()
    {
    assertEquals("L", RomanNumerals.arabicToRoman(50));
    }

    @Test
    public void Should_return_XC_when_input_is_90()
    {
    assertEquals("XC", RomanNumerals.arabicToRoman(90));
    }

    @Test
    public void Should_return_C_when_input_is_100()
    {
    assertEquals("C", RomanNumerals.arabicToRoman(100));
    }

    @Test
    public void Should_return_M_when_input_is_1000()
    {
    assertEquals("M", RomanNumerals.arabicToRoman(1000));
    }

    @Test
    public void Should_return_MMM_when_input_is_3000()
    {
        assertEquals("MMM", RomanNumerals.arabicToRoman(3000));
    }

}