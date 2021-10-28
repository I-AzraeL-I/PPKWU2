package com.mycompany.stringapi.service;

import org.springframework.stereotype.Service;

@Service
public class StringService {

    public boolean isAlpha(String data) {
        return data.chars().allMatch(Character::isAlphabetic);
    }

    public boolean isNumber(String data) {
        try {
            Double.parseDouble(data);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public boolean isLower(String data) {
        return data.chars().allMatch(Character::isLowerCase);
    }

    public boolean isUpper(String data) {
        return data.chars().allMatch(Character::isUpperCase);
    }
}
