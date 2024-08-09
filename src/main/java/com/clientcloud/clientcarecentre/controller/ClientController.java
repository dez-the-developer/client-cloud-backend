package com.clientcloud.clientcarecentre.controller;

import lombok.AllArgsConstructor;
import com.clientcloud.clientcarecentre.dto.ClientDto;
import com.clientcloud.clientcarecentre.service.ClientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("/api/clients")
public class ClientController {

    private ClientService clientService;

//     Add Client REST API
    @PostMapping
    public ResponseEntity<ClientDto> createClient(@RequestBody ClientDto clientDto){
        ClientDto savedClient = clientService.createClient(clientDto);
        return new ResponseEntity<>(savedClient, HttpStatus.CREATED);
    }

//    Get Client REST API
    @GetMapping("{id}")
    public ResponseEntity<ClientDto> getClientById(@PathVariable("id") Long clientId){
        ClientDto clientDto = clientService.getClientById(clientId);
        return ResponseEntity.ok(clientDto);
    }

//    Get All Clients REST API
    @GetMapping
    public ResponseEntity<List<ClientDto>> getAllClients(){
        List<ClientDto> clients = clientService.getAllClients();
        return ResponseEntity.ok(clients);
    }

//    Update Client REST API
    @PutMapping("{id}")
    public ResponseEntity<ClientDto> updateClient(@PathVariable("id") Long clientId,
                                                  @RequestBody ClientDto updatedClient){
        ClientDto clientDto = clientService.updateClient(clientId, updatedClient);
        return ResponseEntity.ok(clientDto);
    }

//    Delete Client REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteClient(@PathVariable("id") Long clientId){
        clientService.deleteClient(clientId);
        return ResponseEntity.ok("Client deleted successfully!");
    }

}
