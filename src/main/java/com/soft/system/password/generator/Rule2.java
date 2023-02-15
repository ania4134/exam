package com.soft.system.password.generator;

public class Rule2 implements Rule {
    char[] rule2Array;
    int rule2CharNumber;

    public char[] getArrayOfChars() {
        return rule2Array;
    }

    public int getNumberOfChar() {
        return rule2CharNumber;
    }

    public void setRule2Array(char[] rule2Array) {
        this.rule2Array = rule2Array;
    }

    public void setRule2CharNumber(int rule2CharNumber) {
        this.rule2CharNumber = rule2CharNumber;
    }
}
