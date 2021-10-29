package com.ptddev.portfolio.portfolio.controllers;

import com.ptddev.portfolio.portfolio.models.Client;
import com.ptddev.portfolio.portfolio.services.ClientService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("api/v1/clients")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }
    @GetMapping
    public List<Client> fetchAllClients() {
        return clientService.findAllClients();
    }
    // ********** Create / Update **************

    @PostMapping("/new")
    public Client save(
            @RequestParam(value="name") String name,
            @RequestParam(value="email") String email,
            @RequestParam(value="gitHub") String gitHub

    ) {
        LocalDateTime now = LocalDateTime.now();
        Client client = new Client(name, email, gitHub, now, now );
        return clientService.save(client);
    }

    @PostMapping("/delete/{_id}")
    public void delete(@PathVariable("_id") String id) {
        clientService.delete(id);
    }

}
