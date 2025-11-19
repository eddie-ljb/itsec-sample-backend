package de.etiennebader.itsecbackend.service;

import de.etiennebader.itsecbackend.persistence.IKontoPersistence;
import de.etiennebader.itsecbackend.persistence.KontoPersistenceImpl;
import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.stereotype.Service;

@Hidden
@Service
public class KontoService {

    IKontoPersistence kontoPersistence = new KontoPersistenceImpl();
}
