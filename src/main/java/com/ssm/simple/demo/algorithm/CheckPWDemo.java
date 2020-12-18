package com.ssm.simple.demo.algorithm;

import org.apache.commons.codec.binary.Hex;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 验证用户密码
 *
 * @Author peanutnowing
 * @Date 2020/8/26
 */
public class CheckPWDemo {
    /**
     * 密码验证
     * @param userId
     * @param password
     * @param encodedPassword
     * @return
     * @throws NoSuchAlgorithmException
     */
    public static Boolean checkPW(String userId, String password, String encodedPassword) throws NoSuchAlgorithmException {
        String encryptedStr = encodeBySHA256(userId+password);
        return encodedPassword.equals(encryptedStr);
    }

    /**
     * 加密
     * @param str
     * @return
     * @throws NoSuchAlgorithmException
     */
    private static String encodeBySHA256(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] digestBytes = messageDigest.digest(str.getBytes());
        String digestStr = Hex.encodeHexString(digestBytes);
        return digestStr;
    }

    public static void main(String[] args) throws NoSuchAlgorithmException {
        String userId = "10001";
        String pwd = "asdf1234";
        System.out.println(encodeBySHA256(userId+pwd));
        Boolean result = checkPW(userId, pwd, encodeBySHA256(userId+pwd));
        System.out.printf("result:"+ result);
    }
}
