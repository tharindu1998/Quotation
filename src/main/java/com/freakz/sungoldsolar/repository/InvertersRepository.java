package com.freakz.sungoldsolar.repository;

import com.freakz.sungoldsolar.domain.Inverters;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data MongoDB repository for the Inverters entity.
 */
@SuppressWarnings("unused")
@Repository
public interface InvertersRepository extends MongoRepository<Inverters, String> {

}
