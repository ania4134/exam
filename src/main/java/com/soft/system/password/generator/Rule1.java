package com.soft.system.password.generator;

public class Rule1 implements Rule {
    char[] rule1Array;
    int rule1CharNumber;

    public char[] getArrayOfChars() {
        return rule1Array;
    }

    public int getNumberOfChar() {
        return rule1CharNumber;
    }

    public void setRule1Array(char[] rule1Array) {
        this.rule1Array = rule1Array;
    }

    public void setRule1CharNumber(int rule1CharNumber) {
        this.rule1CharNumber = rule1CharNumber;
    }
}
