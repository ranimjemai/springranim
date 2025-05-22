package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
    
    @ManyToOne
    @JoinColumn(name = "voiture_id")
    private Voiture voiture;
    
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private double montantTotal;
    
    @Enumerated(EnumType.STRING)
    private StatutReservation statut;
}
