package gr.ds.unipi.noda.api.YYYDataBase.filterOperator.geographicalOperators.geoSpatialOperators;

import gr.ds.unipi.noda.api.core.operators.filterOperators.geographicalOperators.GeographicalOperator;
import gr.ds.unipi.noda.api.core.operators.filterOperators.geographicalOperators.geoSpatialOperators.BaseGeoSpatialOperatorFactory;
import gr.ds.unipi.noda.api.core.operators.filterOperators.geographicalOperators.geometries.Circle;
import gr.ds.unipi.noda.api.core.operators.filterOperators.geographicalOperators.geometries.Point;
import gr.ds.unipi.noda.api.core.operators.filterOperators.geographicalOperators.geometries.Polygon;
import gr.ds.unipi.noda.api.core.operators.filterOperators.geographicalOperators.geometries.Rectangle;

public final class YYYDataBaseGeoSpatialOperatorFactory extends BaseGeoSpatialOperatorFactory {
    @Override
    public GeographicalOperator newOperatorInGeoPolygon(String fieldName, Polygon polygon) {
        return null;
    }

    @Override
    public GeographicalOperator newOperatorInGeoRectangle(String fieldName, Rectangle rectangle) {
        return null;
    }

    @Override
    public GeographicalOperator newOperatorInGeoCircleKm(String fieldName, Circle circle) {
        return null;
    }

    @Override
    public GeographicalOperator newOperatorInGeoCircleMeters(String fieldName, Circle circle) {
        return null;
    }

    @Override
    public GeographicalOperator newOperatorInGeoCircleMiles(String fieldName, Circle circle) {
        return null;
    }

    @Override
    public GeographicalOperator newOperatorGeoNearestNeighbors(String fieldName, Point point, int neighbors) {
        return null;
    }
}
