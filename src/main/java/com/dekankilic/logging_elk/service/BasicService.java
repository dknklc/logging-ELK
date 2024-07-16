package com.dekankilic.logging_elk.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Slf4j
public class BasicService {

    public String home() {
        log.info("Welcome to home page " + LocalDateTime.now());
        return "Welcome to Home Page Bro";
    }
}
