package com.test.annotation;

import com.test.annotation.Get;

/**
 * @author: mjt
 * time:2021-08-26
 * desription:
 */
public class AnnotationTest {
    @Get
    public String getMessage(){
        return "";
    }
    @Get("第二个方法")
    public String getMessage1(){
        return "";
    }
}