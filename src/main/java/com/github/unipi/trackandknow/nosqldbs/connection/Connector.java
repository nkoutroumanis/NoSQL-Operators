package com.github.unipi.trackandknow.nosqldbs.connection;

public abstract class Connector {

    public abstract Object createConnection();

    public abstract int hashCode();

    public abstract boolean equals(Object o);

}
