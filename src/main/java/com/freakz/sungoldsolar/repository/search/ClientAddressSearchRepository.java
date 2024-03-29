package com.freakz.sungoldsolar.repository.search;

import java.util.List;

import com.freakz.sungoldsolar.domain.ClientAddress;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the ClientAddress entity.
 */
public interface ClientAddressSearchRepository extends ElasticsearchRepository<ClientAddress, String> {
   List< ClientAddress> findByClientId(String client);
}
