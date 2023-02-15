package com.soft.system.password.generator;

public class Rule3 implements Rule {
    char[] rule3Array;
    int rule3CharNumber;

    public char[] getArrayOfChars() {
        return rule3Array;
    }

    public int getNumberOfChar() {
        return rule3CharNumber;
    }

    public void setRule3Array(char[] rule3Array) {
        this.rule3Array = rule3Array;
    }

    public void setRule3CharNumber(int rule3CharNumber) {
        this.rule3CharNumber = rule3CharNumber;
    }
}
