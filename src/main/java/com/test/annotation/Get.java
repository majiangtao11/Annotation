package com.test.annotation;

import java.lang.annotation.*;

/**
 * @author:mjt
 * @Time: 2021-08-26
 * description:
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Get {
    String value() default "默认值";
}
