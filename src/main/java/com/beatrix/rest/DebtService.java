package com.beatrix.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DebtService {

    @Autowired
    private DebtRepo repo;

    public List<Debt> fetchAllDebt(){
        return repo.fetchAllDebt();
    }

    public List<Debt> addDebt(){
        return repo.fetchAllDebt();
    }

}
