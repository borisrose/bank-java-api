package com.bank.api.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import lombok.Data;

@Data
@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Number amount;
    private Integer debitAccountId;
    private Integer creditAccountId;

    private LocalDate madeAt;

    @PrePersist
    protected void onCreate() {
        madeAt = LocalDate.now(); 
    }

}
