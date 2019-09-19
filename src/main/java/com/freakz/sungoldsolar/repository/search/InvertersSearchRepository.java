package com.freakz.sungoldsolar.repository.search;

import com.freakz.sungoldsolar.domain.Inverters;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the Inverters entity.
 */
public interface InvertersSearchRepository extends ElasticsearchRepository<Inverters, String> {
}
