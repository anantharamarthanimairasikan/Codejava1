package com.prodapt.capstoneproject.entities;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Dunning_Notification")
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long notificationid;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "accountid", referencedColumnName = "accountid")
    private Account account;
    @Column(nullable = false)
    private LocalDate sendDate;
    @Enumerated(EnumType.STRING)
    private EMessage method;
    @Enumerated(EnumType.STRING)
    private EResponse response;
}