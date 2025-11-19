package de.etiennebader.itsecbackend.persistence;

import de.etiennebader.itsecbackend.entity.Konto;

import java.util.List;

public class KontoPersistenceImpl implements IKontoPersistence{
    @Override
    public boolean addKonto(Konto konto) {
        return false;
    }

    @Override
    public boolean deleteKonto(Konto konto) {
        return false;
    }

    @Override
    public boolean updateKonto(Konto konto) {
        return false;
    }

    @Override
    public List<Konto> getKontosFromUser(int userID) {
        return List.of();
    }

    @Override
    public Konto findKontoById(int id) {
        return null;
    }

    @Override
    public int getKontoCount() {
        return 0;
    }
}
