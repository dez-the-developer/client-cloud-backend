package com.clientcloud.clientcarecentre.service.impl;


import com.clientcloud.clientcarecentre.exception.ResourceNotFoundException;
import lombok.AllArgsConstructor;
import com.clientcloud.clientcarecentre.dto.ClientDto;
import com.clientcloud.clientcarecentre.entity.Client;
import com.clientcloud.clientcarecentre.mapper.ClientMapper;
import com.clientcloud.clientcarecentre.repository.ClientRepository;
import com.clientcloud.clientcarecentre.service.ClientService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ClientServiceImpl implements ClientService {

    private ClientRepository clientRepository;

    @Override
    public ClientDto createClient(ClientDto clientDto) {

        Client client = ClientMapper.mapToClient(clientDto);
        Client savedClient = clientRepository.save(client);
        return ClientMapper.mapToClientDto(savedClient);
    }

    @Override
    public ClientDto getClientById(Long clientId) {
        Client client = clientRepository.findById(clientId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Client not found with given id : " + clientId));

        return ClientMapper.mapToClientDto(client);
    }

    @Override
    public List<ClientDto> getAllClients() {
        List<Client> clients = clientRepository.findAll();
        return clients.stream().map((client) -> ClientMapper.mapToClientDto(client))
                .collect(Collectors.toList());
    }

    @Override
    public ClientDto updateClient(Long clientId, ClientDto updatedClient) {

        Client client = clientRepository.findById(clientId).orElseThrow(
                () -> new ResourceNotFoundException("Client not found with given id : " + clientId)
        );

        client.setFirstName(updatedClient.getFirstName());
        client.setLastName(updatedClient.getLastName());
        client.setEmail(updatedClient.getEmail());

        Client updatedClientObj = clientRepository.save(client);

        return ClientMapper.mapToClientDto(updatedClientObj);
    }

    @Override
    public void deleteClient(Long clientId) {

        Client client = clientRepository.findById(clientId).orElseThrow(
                () -> new ResourceNotFoundException("Client not found with given id : " + clientId)
        );

        clientRepository.deleteById(clientId);

    }
}
