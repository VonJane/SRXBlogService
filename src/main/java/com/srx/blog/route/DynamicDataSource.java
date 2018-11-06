package com.srx.blog.route;

import lombok.extern.log4j.Log4j;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

@Log4j
public class DynamicDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        String s = DynamicDataSourceContextHolder.getDataSourceType();
        //logger.info("determineCurrentLookupKey > " + s);
        return DynamicDataSourceContextHolder.getDataSourceType();
    }
}
