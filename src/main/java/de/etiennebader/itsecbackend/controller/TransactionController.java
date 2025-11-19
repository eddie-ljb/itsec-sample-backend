package de.etiennebader.itsecbackend.controller;

import de.etiennebader.itsecbackend.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController("/transaction")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;
}
