package com.freakz.sungoldsolar.repository;

import com.freakz.sungoldsolar.domain.Panels;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data MongoDB repository for the Panels entity.
 */
@SuppressWarnings("unused")
@Repository
public interface PanelsRepository extends MongoRepository<Panels, String> {

}
