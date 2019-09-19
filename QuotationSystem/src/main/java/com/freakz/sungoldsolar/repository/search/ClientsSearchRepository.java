package com.freakz.sungoldsolar.repository.search;

import com.freakz.sungoldsolar.domain.Clients;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the Clients entity.
 */
public interface ClientsSearchRepository extends ElasticsearchRepository<Clients, String> {
}
