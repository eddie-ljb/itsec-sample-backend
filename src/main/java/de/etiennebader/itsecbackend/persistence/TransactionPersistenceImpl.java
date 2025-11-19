package de.etiennebader.itsecbackend.persistence;

import de.etiennebader.itsecbackend.entity.Transaction;

import java.util.List;

public class TransactionPersistenceImpl implements ITransactionPersistence{
    @Override
    public boolean addTransaction(Transaction transaction) {
        return false;
    }

    @Override
    public boolean deleteTransaction(int id) {
        return false;
    }

    @Override
    public boolean updateTransaction(Transaction transaction) {
        return false;
    }

    @Override
    public List<Transaction> getAllTransactions() {
        return List.of();
    }

    @Override
    public Transaction getTransactionById(int id) {
        return null;
    }

    @Override
    public List<Transaction> getTransactionsByUser(int userID) {
        return List.of();
    }

    @Override
    public List<Transaction> getAllTransactionsByUser(int userID) {
        return List.of();
    }

    @Override
    public int getTransactionCount() {
        return 0;
    }
}
