package de.etiennebader.itsecbackend.controller;

import de.etiennebader.itsecbackend.service.KontoService;
import de.etiennebader.itsecbackend.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController("/konto")
public class KontoController {

    @Autowired
    private KontoService kontoService;
}
