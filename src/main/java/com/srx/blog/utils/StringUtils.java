package com.srx.blog.utils;

import java.util.Iterator;

/**
 *
 */
public class StringUtils {

    /**
     * 字符串为空或null
     * @param toTest
     * @return
     */
    public static boolean isNullOrEmpty(String toTest) {
        return (toTest == null || toTest.length() == 0 || toTest.trim().length() == 0);
    }

    /**
     * 字符串为空
     * @param value
     * @return
     */
    public static boolean isEmpty(String value) {
        return isEmpty((CharSequence)value);
    }

    public static boolean isEmpty(CharSequence value) {
        return value == null || value.length() == 0;
    }

    /**
     * 将字符串列表中的元素以特定字符串拼接成字符串
     * @param iterator
     * @param separator
     * @return
     */
    public static String join(final Iterator<String> iterator, final String separator) {

        // handle null, zero and one elements before building a buffer
        if (iterator == null) {
            return null;
        }
        if (!iterator.hasNext()) {
            return "";
        }
        final String first = iterator.next();
        if (!iterator.hasNext()) {
            return first;
        }

        // two or more elements
        final StringBuilder buf = new StringBuilder(1024); // Java default is 16, probably too small
        if (first != null) {
            buf.append(first);
        }

        while (iterator.hasNext()) {
            buf.append(separator);
            final String obj = iterator.next();
            if (obj != null) {
                buf.append(obj);
            }
        }
        return buf.toString();
    }

    public static <T> String join(final Iterator<T> iterator, final String separator,Class<T> clazz) {

        // handle null, zero and one elements before building a buffer
        if (iterator == null) {
            return null;
        }
        if (!iterator.hasNext()) {
            return "";
        }
        final T first = iterator.next();
        if (!iterator.hasNext()) {
            return first.toString();
        }

        // two or more elements
        final StringBuilder buf = new StringBuilder(1024); // Java default is 16, probably too small
        if (first != null) {
            buf.append(first);
        }

        while (iterator.hasNext()) {
            buf.append(separator);
            T obj = iterator.next();
            final String objStr = obj.toString();
            if (obj != null) {
                buf.append(objStr);
            }
        }
        return buf.toString();
    }

//    /**
//     * 为Key生成全局唯一的Value
//     * @param key
//     * @return
//     */
//    public static synchronized String generateUniqueValueForKey(String key){
//        DistributedIdGen idGen = SpringContextUtils.getBean(DistributedIdGen.class);
//        return key + idGen.getId() + System.currentTimeMillis();
//    }

    /**
     * 获得随机数
     * @return
     */
    public static String getRandomNum(){
        int n=0;
        n=(int)(Math.random()*1000000);
        while(n<100000 || !handle(n)){
            n=(int)(Math.random()*1000000);
        }
        return n+"";
    }

    private static boolean handle(int n){
        int[] list=new int[6];
        for(int i=0;i<6;i++){
            list[i]=n%10;
            n=n/10;
        }
        for(int i=0;i<6;i++){
            for(int j=i+1;j<6;j++){
                if(list[i]==list[j]) return false;
            }
        }
        return true;
    }
}
