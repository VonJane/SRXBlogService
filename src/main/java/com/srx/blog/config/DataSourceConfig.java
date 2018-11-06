package com.srx.blog.config;

import com.srx.blog.route.DatasourceType;
import com.srx.blog.route.DynamicDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
@MapperScan("com.jane.springbootmybatis.mapper")
public class DataSourceConfig {

    @Autowired
    public Environment environment;

    @Bean("master")
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource.druid-master")
    public DataSource master(){
        return DataSourceBuilder.create().build();
    }

//    @Bean("vipaccount")
//    @ConfigurationProperties(prefix = "spring.datasource.druid-account")
//    public DataSource vipaccount(){
//        return DataSourceBuilder.create().build();
//    }
//
//    @Bean("vipshop")
//    @ConfigurationProperties(prefix = "spring.datasource.druid-shop")
//    public DataSource vipshop(){
//        return DataSourceBuilder.create().build();
//    }
//
//    @Bean("vipcollection")
//    @ConfigurationProperties(prefix = "spring.datasource.druid-collection")
//    public DataSource vipcollection(){
//        return DataSourceBuilder.create().build();
//    }

    @Bean("dataSource")
    public DataSource dataSource(){
        DynamicDataSource dynamicDataSource = new DynamicDataSource();
        Map<Object, Object> dataSourceMap = new HashMap<Object, Object>();
        dataSourceMap.put(DatasourceType.DB_MYSQL_MASTER.getValue(), master());
//        dataSourceMap.put(DatasourceType.DB_MYSQL_ACCOUNT.getValue(), vipaccount());
//        dataSourceMap.put(DatasourceType.DB_MYSQL_SHOP.getValue(), vipshop());
//        dataSourceMap.put(DatasourceType.DB_MYSQL_COLLECTION.getValue(), vipcollection());
        dynamicDataSource.setDefaultTargetDataSource(master());
        dynamicDataSource.setTargetDataSources(dataSourceMap);
        return dynamicDataSource;
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        // 配置数据源，此处配置为关键配置，如果没有将 dynamicDataSource 作为数据源则不能实现切换
        sqlSessionFactoryBean.setDataSource(dataSource());
        sqlSessionFactoryBean.setTypeAliasesPackage(environment.getProperty("master.mybatis.typeAliasesPackage"));
        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(environment.getProperty("master.mybatis.mapper-locations")));
        return sqlSessionFactoryBean;
    }

    @Bean
    public PlatformTransactionManager transactionManager() {

        return new DataSourceTransactionManager(dataSource());
    }

}
