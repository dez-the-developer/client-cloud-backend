package com.clientcloud.clientcarecentre.mapper;

import com.clientcloud.clientcarecentre.dto.ClientDto;
import com.clientcloud.clientcarecentre.entity.Client;

public class ClientMapper {

    public static ClientDto mapToClientDto(Client client){
        return new ClientDto(
                client.getId(),
                client.getFirstName(),
                client.getLastName(),
                client.getEmail()
        );
    }

    public static Client mapToClient(ClientDto clientDto){
        return new Client(
                clientDto.getId(),
                clientDto.getFirstName(),
                clientDto.getLastName(),
                clientDto.getEmail()
        );
    }
}
