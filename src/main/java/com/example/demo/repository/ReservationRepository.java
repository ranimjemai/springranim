package com.example.demo.repository;

import com.example.demo.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    // Tu peux ajouter des méthodes personnalisées ici si nécessaire, par exemple :
    // List<Reservation> findByClientId(Long clientId);
}
