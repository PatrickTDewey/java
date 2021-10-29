package com.ptddev.portfolio.portfolio.services;

import com.ptddev.portfolio.portfolio.models.Client;
import com.ptddev.portfolio.portfolio.repositories.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    // ********** Create / Update **************
    public Client save(Client client) {
        return clientRepository.save(client);
    }

    // ********** Find All *********************
    public List<Client> findAllClients() {
        return clientRepository.findAll();
    }

    // ********** Find One *********************
    public Client findOneByEmail(String email) {
        Optional<Client> clientOptional = clientRepository.findClientByEmail(email);
        if (clientOptional.isPresent()) {
            return clientOptional.get();
        } else {
            System.out.println("Client not found");
            return null;
        }
    }

    // ********** Delete ***********************
    public void delete(String id) {
        clientRepository.deleteById(id);
    }



}
