package com.srx.blog.route;


public class DynamicDataSourceContextHolder {

    private static final ThreadLocal<String> contextHolder = new ThreadLocal<>();

    /**
     * 设置数据源
     * @param datasourceType
     */
    public static void setDataSourceType(DatasourceType datasourceType) {
        contextHolder.set(datasourceType.getValue());
    }

    /**
     * 取得当前数据源
     * @return
     */
    public static String getDataSourceType() {
        return contextHolder.get();
    }

    /**
     * 清除上下文数据
     */
    public static void clearDataSourceType() {
        contextHolder.remove();
    }

}
