package com.clientcloud.clientcarecentre.repository;

import com.clientcloud.clientcarecentre.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
