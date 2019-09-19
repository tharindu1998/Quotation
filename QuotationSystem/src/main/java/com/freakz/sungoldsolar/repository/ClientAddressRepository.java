package com.freakz.sungoldsolar.repository;

import java.util.Optional;

import com.freakz.sungoldsolar.domain.ClientAddress;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data MongoDB repository for the ClientAddress entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ClientAddressRepository extends MongoRepository<ClientAddress, String> {
    Optional<ClientAddress> findByClientId(String client);
}
