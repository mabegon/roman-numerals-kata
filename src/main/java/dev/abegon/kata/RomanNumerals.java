package dev.abegon.kata;

public class RomanNumerals {

    public static final String I = "I";
    public static final String V = "V";

    public static String arabicToRoman(int arabic) {
        StringBuilder response = new StringBuilder();

        int partialArabic = arabic;
        String nextSymbol = "";

        if (arabic >= 10) {
            response.append("X");
            partialArabic -= 10;


        } else if (arabic >= 5) {
            response.append("V");
            partialArabic -= 5;
        }

        if (arabic >= 0 && arabic <5){
            nextSymbol = "V";
        }else if (arabic >= 5 && arabic <10){
            nextSymbol = "X";
        }else if (arabic >= 0 && arabic <5){

        }

       switch(partialArabic){
           case 1: response.append("I"); break;
           case 2: response.append("II"); break;
           case 3: response.append("III"); break;
           case 4: response = new StringBuilder("I").append(nextSymbol); break;
       }
        return response.toString();
    }
}
