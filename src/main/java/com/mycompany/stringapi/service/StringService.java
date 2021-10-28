package com.mycompany.stringapi.service;

import com.mycompany.stringapi.dto.Statistics;
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

    public Statistics createStatistics(String data) {
        var statistics = new Statistics();
        statistics.isAlpha = isAlpha(data);
        statistics.isLower = isLower(data);
        statistics.isNumber = isNumber(data);
        statistics.isUpper = isUpper(data);
        statistics.characterCount = data.length();
        statistics.letterCount = data.chars().filter(Character::isAlphabetic).count();
        statistics.digitCount = data.chars().filter(Character::isDigit).count();
        statistics.lowercaseLetterCount = data.chars().filter(Character::isLowerCase).count();
        statistics.uppercaseLetterCount = data.chars().filter(Character::isUpperCase).count();
        statistics.whitespaceCount = data.chars().filter(Character::isWhitespace).count();
        statistics.specialCharactersCount = data.length() - statistics.letterCount - statistics.digitCount - statistics.whitespaceCount;
        return statistics;
    }
}
