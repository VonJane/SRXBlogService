package com.srx.blog.route;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(-1)
@Component
public class DynamicDataSourceAspect {

    private static final Logger logger = Logger.getLogger(DynamicDataSourceAspect.class);

    /**
     * 使用注解的方式启用切换数据源，方法执行前设置数据源
     * @param point
     * @param ds
     */
    @Before("@annotation(ds)")
    public void changeDataSource(JoinPoint point, TargetDataSource ds){
        //logger.info("Use DataSource : "+ds.value()+" > "+point.getSignature()+"");
        DynamicDataSourceContextHolder.setDataSourceType(ds.value());
    }

    /**
     * 方法执行之后，取出数据源设置
     * @param point
     * @param ds
     */
    @After("@annotation(ds)")
    public void revertDataSource(JoinPoint point, TargetDataSource ds){
        //logger.info("Revert DataSource : "+ds.value()+" > "+point.getSignature()+"");
        DynamicDataSourceContextHolder.clearDataSourceType();

    }

}
