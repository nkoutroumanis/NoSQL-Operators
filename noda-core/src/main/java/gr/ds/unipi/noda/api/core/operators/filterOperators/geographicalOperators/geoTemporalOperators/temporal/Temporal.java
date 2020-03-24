package gr.ds.unipi.noda.api.core.operators.filterOperators.geographicalOperators.geoTemporalOperators.temporal;

import java.util.Date;

public abstract class Temporal {

    private final Date[] dates;

    protected Temporal(Date[] dates) {
        this.dates = dates;
    }

    protected Date[] getDates(){
        return dates;
    }
}