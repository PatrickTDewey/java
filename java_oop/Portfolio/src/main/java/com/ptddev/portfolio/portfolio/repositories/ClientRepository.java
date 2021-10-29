package com.ptddev.portfolio.portfolio.repositories;

import com.ptddev.portfolio.portfolio.models.Client;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface ClientRepository extends MongoRepository<Client, String> {
    Optional<Client> findClientByEmail(String email);

}
