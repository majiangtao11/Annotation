package com.test.sort;



import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;

/**
 * @author: mjt
 * time:2021-11-01
 * desription:
 */
public class TestString {
    public static void main(String[] args) {
        String param = "ss,CC";
        String[] split = param.split(",");
        String s1 = JSONObject.toJSONString(split);
        System.out.println("=============s1:" + s1);
//        ArrayList<String> strings = new ArrayList<String>();
//        for (String s : split) {
//            String a = "\""+s+"\"";
//            strings.add(a);
//        }
//        System.out.println(strings);

    }
}