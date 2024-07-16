package com.dekankilic.logging_elk.controller;

import com.dekankilic.logging_elk.service.BasicService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/home")
@RequiredArgsConstructor
public class BasicController {

    private final BasicService basicService;

    @GetMapping
    public ResponseEntity<String> homePage() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(basicService.home());
    }
}
