package de.etiennebader.itsecbackend.service;

import de.etiennebader.itsecbackend.persistence.ITransactionPersistence;
import de.etiennebader.itsecbackend.persistence.TransactionPersistenceImpl;
import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.stereotype.Service;

@Hidden
@Service
public class TransactionService {

    ITransactionPersistence transactionPersistence = new TransactionPersistenceImpl();
}
