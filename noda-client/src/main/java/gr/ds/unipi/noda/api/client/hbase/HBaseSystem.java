package gr.ds.unipi.noda.api.client.hbase;

import gr.ds.unipi.noda.api.client.NoSqlDbSystem;
import gr.ds.unipi.noda.api.core.nosqldb.NoSqlDbConnector;
import gr.ds.unipi.noda.api.hbase.HBaseConnectionFactory;
import gr.ds.unipi.noda.api.hbase.HBaseConnector;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;

import java.util.Map;

public class HBaseSystem extends NoSqlDbSystem {

    private final HBaseConnector connector;

    @Override
    protected NoSqlDbConnector getConnector() {
        return connector;
    }

    @Override
    public int getDefaultPort() {
        return 2181;
    }

    public static class Builder extends NoSqlDbSystem.Builder<Builder> {

        private Configuration config = HBaseConfiguration.create();

        public Builder() {

        }

        public Builder addProperty(String name, String value) {
            config.set(name, value);
            return this;
        }

        public Builder configuration(Configuration config) {
            this.config.addResource(config);
            return this;
        }

        @Override
        public NoSqlDbSystem build() {
            return new HBaseSystem(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private HBaseSystem(Builder builder) {
        super(builder, new HBaseConnectionFactory());

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : getAddresses()) {
            sb.append(entry.getKey()).append(":").append(entry.getValue()).append(",");
        }

        sb.deleteCharAt(sb.lastIndexOf(","));

        builder.config.set("hbase.zookeeper.quorum", sb.toString());

        connector = HBaseConnector.newHBaseConnector(builder.config);
    }

}
