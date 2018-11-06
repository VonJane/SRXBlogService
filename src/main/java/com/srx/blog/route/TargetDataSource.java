package com.srx.blog.route;


import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface TargetDataSource {

    DatasourceType value() default DatasourceType.DB_MYSQL_MASTER;

}
