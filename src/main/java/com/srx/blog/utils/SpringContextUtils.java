package com.srx.blog.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;

/**
 * 从Spring容器上下文获得Bean
 * @author lingy
 */
public class SpringContextUtils {

    private static ApplicationContext applicationContext;

    public static ApplicationContext getApplicationContext(){
        return applicationContext;
    }

    public static void setApplicationContext(ApplicationContext applicationContext){
        SpringContextUtils.applicationContext = applicationContext;
    }

    /**
     * 通过名称获得上下文中的Bean
     * @param beanName
     * @return
     */
    public static Object getBean(String beanName){
        return applicationContext.getBean(beanName);
    }

    /**
     * 通过类型获得上下文中的Bean
     * @param requiredType
     * @return
     */
    public static <T> T getBean(Class<T> requiredType){
        return applicationContext.getBean(requiredType);
    }


    /**
     * 事件监听机制
     * @param event
     */
    public static void publishEvent(ApplicationEvent event){
        applicationContext.publishEvent(event);
    }
}
