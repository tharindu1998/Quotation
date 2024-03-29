package com.freakz.sungoldsolar.repository.search;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Configuration;

/**
 * Configure a Mock version of QuotationSearchRepository to test the
 * application without starting Elasticsearch.
 */
@Configuration
public class QuotationSearchRepositoryMockConfiguration {

    @MockBean
    private QuotationSearchRepository mockQuotationSearchRepository;

}
