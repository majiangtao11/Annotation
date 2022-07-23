package com.test.test;

import org.junit.Test;

import javax.xml.bind.SchemaOutputResolver;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: mjt
 * time:2022-02-10
 * desription:
 */
public class PageNumTest {
    public static void main(String[] args) {
        int pageNum = 1;
        User user = new User();
        user.setPageNum(pageNum);
        System.out.println(pageNum);
        pageNum = pageNum++;
        System.out.println(pageNum);
    }
    @Test
    public void str(){
        ConcurrentHashMap<Object, Object> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("","");
        concurrentHashMap.put("","");
        concurrentHashMap.put("1","");
        System.out.println(concurrentHashMap.size());
    }

    @Test
    public void tr(){
//        Integer a = 1000;
//        Integer b = 1000;
//        Integer c = 100;
//        Integer d = 100;
//        System.out.println(a == b);
//        System.out.println(c == d);
        String a = "a";
//        Integer b = 97;
        a.hashCode();
//        System.out.println(b.hashCode());
    }
}