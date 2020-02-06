package gr.ds.unipi.noda.api.neo4j.filterOperator.logicalOperator;

import gr.ds.unipi.noda.api.core.operators.filterOperators.FilterOperator;

abstract class LogicalOperator extends gr.ds.unipi.noda.api.core.operators.filterOperators.logicalOperators.LogicalOperator<T> {

    protected LogicalOperator(FilterOperator filterOperator1, FilterOperator filterOperator2, FilterOperator... filterOperators) {
        super(filterOperator1, filterOperator2, filterOperators);
    }

    protected abstract String getOperatorJsonField();

    public T getOperatorExpression() {

        return null;
    }


}
