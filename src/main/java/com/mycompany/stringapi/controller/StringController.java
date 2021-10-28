package com.mycompany.stringapi.controller;

import com.mycompany.stringapi.service.StringService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StringController {

    private final StringService stringService;

    public StringController(StringService stringService) {
        this.stringService = stringService;
    }

    @PostMapping("/is-alpha")
    public ResponseEntity<Boolean> isAlpha(@RequestParam("data") String data) {
        return ResponseEntity.ok(stringService.isAlpha(data));
    }
}
