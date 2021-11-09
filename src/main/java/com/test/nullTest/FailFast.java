package com.test.nullTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: mjt
 * time:2021-11-04
 * desription:
 *      fail-fast 是一种通用的系统设计思想，
 *      一旦检测到可能会发生错误，就立马抛出异常，程序将不再往下执行。
 */
public class FailFast {
    public static void main(String[] args) {
        Wanger wanger = null;
//        test(wanger);
        array();
    }
    public static void test(Wanger wanger) {
        if (wanger == null) {
            throw new RuntimeException("wanger 不能为空");
        }
        System.out.println(wanger.toString());
    }

    public static void array(){
        List<String> list = new ArrayList<String>();
        list.add("沉默王二");
        list.add("沉默王三");
        list.add("一个文章真特么有趣的程序员");

        for (String str : list) {
            if ("沉默王二".equals(str)) {
                list.remove(str);
                System.out.println(str + "\'");
            }
        }
        System.out.println(list);
    }
}