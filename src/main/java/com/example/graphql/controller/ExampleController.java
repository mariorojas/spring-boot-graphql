package com.example.graphql.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/example")
public class ExampleController {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> example() {
        Map<String, Object> response = new HashMap<>();
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        response.put("response", "This is an example");
        response.put("timestamp", timestamp);
        return ResponseEntity.ok(response);
    }
}
