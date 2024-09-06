package com.example.customQueries_1.repositories;

import com.example.customQueries_1.entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Integer> {
}