package com.example.customQueries_1.services;


import com.example.customQueries_1.entities.Flight;
import com.example.customQueries_1.entities.enumerated.StatusEnum;
import com.example.customQueries_1.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;


@Service
public class FlightService {

    @Autowired
    private FlightRepository flightRepository;

    public String randomString(Integer length) {
        Integer leftLimit = 97; // letter 'a'
        Integer rightLimit = 122; // letter 'z'
        Random random = new Random();
        return random.ints(leftLimit, rightLimit + 1)
                .limit(length)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    public void init() {
        for (int i = 0; i < 50; i++) {
            Flight newFlight = new Flight(i, randomString(10), randomString(3), randomString(3), StatusEnum.ONTIME);
            flightRepository.save(newFlight);
        }
    }

    public List<Flight> listOfFlights () {
        return flightRepository.findAll();
    }

}
