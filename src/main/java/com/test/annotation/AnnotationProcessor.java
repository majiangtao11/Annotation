package com.test.annotation;



import com.test.annotation.AnnotationTest;
import com.test.annotation.Get;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author: mjt
 * time:2021-08-26
 * desription:注解处理器
 */
public class AnnotationProcessor {
    public static void processor(){
        Method[] declaredMethods = AnnotationTest.class.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            Get get = declaredMethod.getAnnotation(Get.class);
            if (get != null) {
                System.out.println("get.value() = " + get.value());
            }
        }
    }

    public static void main(String[] args) {
        processor();
        Map<Object, Object> map = new HashMap<Object, Object>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.put("d",4);
        Iterator<Map.Entry<Object, Object>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Object, Object> entry = iterator.next();
            System.out.println(entry.getKey() + "--" + entry.getValue());
        }
        String obj = "1231";
        int objHashCode = obj.hashCode();
        System.out.println("obj.hashCode() -- " + objHashCode);

    }
}