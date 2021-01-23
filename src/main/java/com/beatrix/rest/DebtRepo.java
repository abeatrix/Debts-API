package com.beatrix.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository

public class DebtRepo {
    // storing in memory
    private Integer Counter = 0;
    private List<Debt> debts = new ArrayList<>();

    public List<Debt> fetchAllDebt(){

        return debts;
    }

}
