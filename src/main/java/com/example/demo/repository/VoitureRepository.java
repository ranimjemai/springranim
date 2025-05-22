package com.example.demo.repository;

import com.example.demo.model.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoitureRepository extends JpaRepository<Voiture, Long> {
    // Exemple : trouver toutes les voitures disponibles
    java.util.List<Voiture> findByDisponibleTrue();
}
