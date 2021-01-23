package com.beatrix.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/debts")
public class DebtController {

    @Autowired
    private DebtService service;

    @GetMapping
    public ResponseEntity<?> fetchAllDebts(){
        List<Debt> debts = service.fetchAllDebt();

        return ResponseEntity.ok(debts);
    }

}
