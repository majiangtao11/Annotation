package com.test.escape;

/**
 * @author: mjt
 * time:2021-11-03
 * desription:字符串转义符
 *
 * 常用的转义字符及其含义：
 * \’ 单引号
 * \” 双引号
 * \\ 反斜杠
 * \0 空
 * \a 警告（产生峰鸣）
 * \b 退格
 * \f 换页
 * \n 换行
 * \r 回车
 * \t 水平制表符
 * \v 垂直制表符
 *
 *
 *
 */
public class Escape {
    public static void main(String[] args) {
        String param = "反斜杠\\反斜杠\\\\反斜杠";
        System.out.println(param);
        System.out.println("=====================================");
        String an = "换行\n换行回车\r回车";
        System.out.println(an);
        System.out.println("=====================================");
        System.out.println("=====================================");
        System.out.println("=====================================");
        System.out.println("=====================================");
        System.out.println("=====================================");
    }
}