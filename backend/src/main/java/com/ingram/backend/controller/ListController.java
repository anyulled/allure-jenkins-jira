package com.ingram.backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ListController {

    @GetMapping("get-list")
    public ResponseEntity<List<String>> getList() {
        return ResponseEntity.ok(List.of("one", "two", "three"));
    }
}
