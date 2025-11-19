package de.etiennebader.itsecbackend.entity;

import io.micrometer.core.instrument.distribution.TimeWindowMax;
import lombok.Getter;
import lombok.Setter;

import java.security.Timestamp;

@Getter
@Setter
public class Konto {
    private int id;
    private float saldo;
    private float limitDaily;
    private String name;
    private String waehrung;
    private int userID;
    private Timestamp createdTimestamp;
    private Timestamp updatedTimestamp;
}
