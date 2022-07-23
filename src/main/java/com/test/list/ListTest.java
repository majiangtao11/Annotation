package com.test.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: mjt
 * time:2021-12-16
 * desription:
 */
public class ListTest {
    public static void main(String[] args) {
        List list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        Collections.addAll(list,"e","f");
        System.out.println(list);
    }
}