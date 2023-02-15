package com.soft.system.password.generator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PasswordGenerator {
    List<Character> passwordArray = new ArrayList<>();

    public String generatePassword(Rule1 rule1, Rule2 rule2, Rule3 rule3) {
        int numberOfCharsRule1 = generateRandomCharNumber(rule1);
        int numberOfCharsRule2 = generateRandomCharNumber(rule2);
        int numberOfCharsRule3 = generateRandomCharNumber(rule3);
        String password = "";

        for(int i = 0; i < numberOfCharsRule1; i++)
            passwordArray.add(getRandomChar(rule1.getArrayOfChars()));
        for(int i = 0; i < numberOfCharsRule2; i++)
            passwordArray.add(getRandomChar(rule2.getArrayOfChars()));
        for(int i = 0; i < numberOfCharsRule3; i++)
            passwordArray.add(getRandomChar(rule3.getArrayOfChars()));

        Collections.shuffle(passwordArray);
        for(char character : passwordArray)
            password += character;

        return password;
    }

    public char getRandomChar(char[] array) {
        Random rand = new Random();
        char randomChar = array[rand.nextInt(array.length)];
        return randomChar;
    }

    public int generateRandomCharNumber(Rule rule) {
        Random rand = new Random();
        int min = rule.getNumberOfChar();
        int max = rule.getNumberOfChar() + 5;
        int randomCharNumber = (int)(Math.random()*(max-min+1)+min);
        return randomCharNumber;
    }
}
