package de.etiennebader.itsecbackend.persistence;

import de.etiennebader.itsecbackend.entity.Transaction;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ITransactionPersistence {

    boolean addTransaction(Transaction transaction);
    boolean deleteTransaction(int id);
    boolean updateTransaction(Transaction transaction);
    List<Transaction> getAllTransactions();
    Transaction getTransactionById(int id);
    List<Transaction> getTransactionsByUser(int userID);
    List<Transaction> getAllTransactionsByUser(int userID);
    int getTransactionCount();
}
