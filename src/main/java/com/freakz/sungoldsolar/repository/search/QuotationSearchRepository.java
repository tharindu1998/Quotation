package com.freakz.sungoldsolar.repository.search;

import com.freakz.sungoldsolar.domain.Quotation;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the Quotation entity.
 */
public interface QuotationSearchRepository extends ElasticsearchRepository<Quotation, String> {
}
