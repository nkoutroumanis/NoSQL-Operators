package gr.ds.unipi.noda.api.hbase.filterOperator.geoperators.geoTextualOperators.geoTextualConstraintOperators;

import gr.ds.unipi.noda.api.core.operators.filterOperators.geoperators.geometries.Rectangle;
import gr.ds.unipi.noda.api.core.operators.filterOperators.textualOperators.conditionalTextualOperators.ConditionalTextualOperator;
import gr.ds.unipi.noda.api.hbase.filterOperator.geoperators.geographicalOperators.OperatorInGeoRectangle;

public class OperatorInGeoTextualRectangle extends GeoTextualConstraintOperator<Rectangle> {

    protected OperatorInGeoTextualRectangle(String fieldName, Rectangle rectangle, ConditionalTextualOperator conditionalTextualOperator) {
        super(OperatorInGeoRectangle.newOperatorInGeoRectangle(fieldName,rectangle), conditionalTextualOperator);
    }

    @Override
    public Object getOperatorExpression() {
        return null;
    }

    public static OperatorInGeoTextualRectangle inGeoTextualRectangle(String fieldName, Rectangle rectangle, ConditionalTextualOperator conditionalTextualOperator){
        return new OperatorInGeoTextualRectangle(fieldName, rectangle, conditionalTextualOperator);
    }
}
