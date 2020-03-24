package gr.ds.unipi.noda.api.redisearch.filterOperator.textualOperator;

import gr.ds.unipi.noda.api.core.operators.filterOperators.textualOperators.BaseTextualOperatorFactory;
import gr.ds.unipi.noda.api.core.operators.filterOperators.textualOperators.TextualOperator;

public class RediSearchTextualOperatorFactory extends BaseTextualOperatorFactory {
    @Override
    public TextualOperator newOperatorAnyKeywords(String fieldName, String keyword, String... keywords) {
        return OperatorAnyKeywords.newOperatorAnyKeywords(fieldName, keyword, keywords);
    }

    @Override
    public TextualOperator newOperatorAllKeywords(String fieldName, String keyword1, String keyword2, String... keywords) {
        return OperatorAllKeywords.newOperatorAllKeywords(fieldName, keyword1, keyword2, keywords);
    }

    @Override
    public TextualOperator newOperatorNoneKeywords(String fieldName, String keyword1, String keyword2, String... keywords) {
        return OperatorNoneKeywords.newOperatorAllKeywords(fieldName, keyword1, keyword2, keywords);
    }
}