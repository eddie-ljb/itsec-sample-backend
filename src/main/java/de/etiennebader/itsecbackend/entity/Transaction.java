package de.etiennebader.itsecbackend.entity;

import lombok.Getter;
import lombok.Setter;

import java.security.Timestamp;
import java.util.Date;

@Getter
@Setter
public class Transaction {
    private int id;
    private float amount;
    private int kontoidSender;
    private int kontoidReceiver;
    private String verwendungszweck;
    private boolean anomaly;
    private Date date;
    private Timestamp timestamp;
}
