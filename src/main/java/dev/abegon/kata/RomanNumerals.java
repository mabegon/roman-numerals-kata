package dev.abegon.kata;

public class RomanNumerals {

    private enum Numeral {
        I("I"), //1
        V("V"), //5
        X("X"), //10
        L("L"), //50
        C("C"), //100
        D("D"), //500
        M("M"), //1000
        MV("V'"), //5000
        MX("X'"); //10000

        private String name;

        Numeral(String name) {
            this.name = name;
        }

        public String toString(){
            return  name;
        }

    }

    public static String arabicToRoman(int arabic) {
        StringBuilder response = new StringBuilder();

        int thousands = arabic / 1000 % 10;
        response.append(computeGroup(thousands, Numeral.M,Numeral.MV,Numeral.MX));
        int hundreds = arabic / 100 % 10;
        response.append(computeGroup(hundreds, Numeral.C,Numeral.D,Numeral.M));
        int tens = arabic / 10 % 10;
        response.append(computeGroup(tens, Numeral.X,Numeral.L,Numeral.C));
        int ones = arabic % 10;
        response.append(computeGroup(ones, Numeral.I,Numeral.V,Numeral.X));
        return response.toString();
    }

    private static String computeGroup(int arabicNumber, Numeral one, Numeral five, Numeral ten ) {
        StringBuilder response = new StringBuilder();

        switch (arabicNumber) {
            case 0: break;
            case 1:
                response.append(one);
                break;
            case 2:
                response.append(one).append(one);
                break;
            case 3:
                response.append(one).append(one).append(one);
                break;
            case 4:
                response.append(one).append(five);
                break;
            case 5:
                response.append(five);
                break;
            case 6:
                response.append(five).append(one);
                break;
            case 7:
                response.append(five).append(one).append(one);
                break;
            case 8:
                response.append(five).append(one).append(one).append(one);
                break;
            case 9:
                response.append(one).append(ten);
                break;
        }
        return response.toString();
    }
}
