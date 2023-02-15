package com.soft.system.password.generator;

public class AppRunner {
    public static void main(String[] args) {
        char[] rule1Array = {'A','B','C','D','f','g'};
        char[] rule2Array = {'*','$','%','@'};
        char[] rule3Array = {'4','6','1','8'};
        int rule1CharMinNumber = 1;
        int rule2CharMinNumber = 1;
        int rule3CharMinNumber = 1;

        Rule1 rule1 = new Rule1();
        Rule2 rule2 = new Rule2();
        Rule3 rule3 = new Rule3();
        rule1.setRule1Array(rule1Array);
        rule1.setRule1CharNumber(rule1CharMinNumber);
        rule2.setRule2Array(rule2Array);
        rule2.setRule2CharNumber(rule2CharMinNumber);
        rule3.setRule3Array(rule3Array);
        rule3.setRule3CharNumber(rule3CharMinNumber);

        PasswordGenerator generator = new PasswordGenerator();
        String result = generator.generatePassword(rule1, rule2, rule3);
        System.out.println(result);
    }
}
