package com.srx.blog.utils;

import org.apache.log4j.Logger;

import java.security.MessageDigest;

/**
 *
 */
public class SecretUtils {

    private static final Logger logger = Logger.getLogger(SecretUtils.class);

    /**
     *
     * @param input
     * @return
     */
    public static String md5Crypt(String input){
        return md5Crypt(input,"");
    }

    /**
     *
     * @param input
     * @param salt
     * @return
     */
    public static String md5Crypt(String input,String salt){
        String resultString = null;
        try {
            if(!StringUtils.isNullOrEmpty(salt)){
                resultString = input + salt;
            }else{
                resultString = input;
            }
            logger.info("before md5 string is :" + resultString);
            MessageDigest md = MessageDigest.getInstance("MD5"); // MD5 SHA
            resultString = toHex(md.digest(resultString.getBytes()));
            logger.info("after md5 string is :" + resultString);
        } catch (Exception ex) {
        }
        return resultString;
    }

    /**
     * 将16位byte[] 转换为32位String
     * @param buffer
     * @return
     */
    private static String toHex(byte buffer[]) {
        StringBuilder sb = new StringBuilder(buffer.length * 2);
        for (int i = 0; i < buffer.length; i++) {
            sb.append(Character.forDigit((buffer[i] & 240) >> 4, 16));
            sb.append(Character.forDigit(buffer[i] & 15, 16));
        }

        return sb.toString();
    }

}
