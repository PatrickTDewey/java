package com.ptddev.portfolio.portfolio;

import com.ptddev.portfolio.portfolio.models.Client;
import com.ptddev.portfolio.portfolio.repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class PortfolioApplication {

    public static void main(String[] args) {
        SpringApplication.run(PortfolioApplication.class, args);
    }

//    @Bean
//    CommandLineRunner runner(ClientRepository clientRepository, MongoTemplate mongoTemplate) {
//        return args -> {
//            String email = "ptddev@protonmail.com";
//            Client client = new Client(
//                    "Patrick",
//                    email,
//                    "github.com/PatrickTDewey",
//                    LocalDateTime.now(),
//                    null
//            );
//
//            Optional<Client> clientOptional = clientRepository.findClientByEmail(email);
//            if (clientOptional.isPresent()){
//                System.out.println("Client already exists, " + clientOptional.get());
//            } else {
//                System.out.println("Inserting a new client " + client);
//                clientRepository.insert(client);
//            }
//
//        };
//    }
}
