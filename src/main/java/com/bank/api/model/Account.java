package com.bank.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PreUpdate;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Number balance;
    private LocalDate updatedAt;

    @OneToMany(mappedBy = "debitAccountId")
    private List<Transaction> debitTransactions; // Transactions en tant que compte débité

    @OneToMany(mappedBy = "creditAccountId")
    private List<Transaction> creditTransactions; // Transactions en tant que compte crédité

    @PreUpdate
    protected void onUpdate() {
        updatedAt = LocalDate.now();
    }

    @OneToOne
    private User owner;


    
}
