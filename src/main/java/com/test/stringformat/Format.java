package com.test.stringformat;

/**
 * @author: mjt
 * time:2021-11-03
 * desription:字符串格式化
 *
 *
 *
 * String.format()字符串常规类型格式化的两种重载方式
 * format(String format, Object… args) 新字符串使用本地语言环境，制定字符串格式和参数生成格式化的新字符串。
 * format(Locale locale, String format, Object… args) 使用指定的语言环境，制定字符串格式和参数生成格式化的字符串。
 *
 *
 *转换符	详细说明	示例
 * %s	字符串类型	“喜欢请收藏”
 * %c	字符类型	‘m’
 * %b	布尔类型	true
 * %d	整数类型（十进制）	88
 * %x	整数类型（十六进制）	FF
 * %o	整数类型（八进制）	77
 * %f	浮点类型	8.888
 * %a	十六进制浮点类型	FF.35AE
 * %e	指数类型	9.38e+5
 * %g	通用浮点类型（f和e类型中较短的）	不举例(基本用不到)
 * %h	散列码	不举例(基本用不到)
 * %%	百分比类型	％(%特殊字符%%才能显示%)
 * %n	换行符	不举例(基本用不到)
 * %tx	日期与时间类型（x代表不同的日期与时间转换符)	不举例(基本用不到)
 *
 */
public class Format {
    public static void main(String[] args) {
        String param = "name:%s\nage:%d";
        String format = String.format(param, "xiaoxaio", 18);
        System.out.println(format);
    }
}