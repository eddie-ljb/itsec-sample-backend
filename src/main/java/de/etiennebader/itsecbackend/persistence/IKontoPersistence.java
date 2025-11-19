package de.etiennebader.itsecbackend.persistence;

import de.etiennebader.itsecbackend.entity.Konto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IKontoPersistence {

    boolean addKonto(Konto konto);
    boolean deleteKonto(Konto konto);
    boolean updateKonto(Konto konto);
    List<Konto> getKontosFromUser(int userID);
    Konto findKontoById(int id);
    int getKontoCount();
}
