package com.mycompany.stringapi.controller;

import com.mycompany.stringapi.dto.Statistics;
import com.mycompany.stringapi.service.StringService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class StringController {

    private final StringService stringService;

    public StringController(StringService stringService) {
        this.stringService = stringService;
    }

    @GetMapping("/is-alpha")
    public ResponseEntity<Boolean> isAlpha(@RequestParam("data") String data) {
        return ResponseEntity.ok(stringService.isAlpha(data));
    }

    @GetMapping("/is-number")
    public ResponseEntity<Boolean> isNumber(@RequestParam("data") String data) {
        return ResponseEntity.ok(stringService.isNumber(data));
    }

    @GetMapping("/is-lower")
    public ResponseEntity<Boolean> isLower(@RequestParam("data") String data) {
        return ResponseEntity.ok(stringService.isLower(data));
    }

    @GetMapping("/is-upper")
    public ResponseEntity<Boolean> isUpper(@RequestParam("data") String data) {
        return ResponseEntity.ok(stringService.isUpper(data));
    }

    @GetMapping("/statistics")
    public ResponseEntity<Statistics> getStatistics(@RequestParam("data") String data) {
        return ResponseEntity.ok(stringService.createStatistics(data));
    }
}
