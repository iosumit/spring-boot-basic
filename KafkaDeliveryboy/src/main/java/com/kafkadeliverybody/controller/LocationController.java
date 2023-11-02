package com.kafkadeliverybody.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafkadeliverybody.service.KafkaService;

@RestController
@RequestMapping("/location")
public class LocationController {

    @Autowired
    private KafkaService kafkaService;

    @GetMapping
    public ResponseEntity<?> updateLocation() {
        for (int i = 0; i < 100000; i++) {
            this.kafkaService
                    .updateLocation(
                            "(" + Math.round(Math.random() * 100) + ", " + Math.round(Math.random() * 100) + ")");
        }
        return new ResponseEntity<>(Map.of("message", "Location updated"), HttpStatus.OK);
    }
}
