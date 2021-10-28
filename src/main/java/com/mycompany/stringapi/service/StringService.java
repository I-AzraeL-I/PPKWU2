package com.mycompany.stringapi.service;

import org.springframework.stereotype.Service;

@Service
public class StringService {

    public boolean isAlpha(String data) {
        return data.chars().allMatch(Character::isAlphabetic);
    }
}
