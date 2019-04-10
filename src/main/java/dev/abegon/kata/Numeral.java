package dev.abegon.kata;

public enum Numeral {
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
