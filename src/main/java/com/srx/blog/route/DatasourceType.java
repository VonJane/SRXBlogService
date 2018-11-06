package com.srx.blog.route;

public enum DatasourceType {

    DB_MYSQL_MASTER("db_mysql_master");

//    DB_MYSQL_ACCOUNT("db_mysql_vipaccount"),
//
//    DB_MYSQL_SHOP("db_mysql_vipshop"),
//
//    DB_MYSQL_COLLECTION("db_mysql_collection");

    private String value;

    DatasourceType(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
