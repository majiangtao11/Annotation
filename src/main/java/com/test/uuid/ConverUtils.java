package com.test.uuid;

/**
 * @author: mjt
 * time:2021-09-01
 * desription:
 */
public class ConverUtils {
    /**
     * _数字转换为16进制字符串
     *
     * @param value  数字
     * @param length byte长度
     */
    public static String numToHexStr(long value, int length) {
        StringBuilder b = new StringBuilder(Long.toHexString(value));
        while (b.length() < (length << 1)) {
            b.insert(0, '0');
        }
        return b.toString().toUpperCase();
    }
}