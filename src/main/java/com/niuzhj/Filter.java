/**
 * @program: LogFilter
 * @description:
 * @author: ZhaoJie Niu
 * @create: 2018-12-01 16:10
 **/

package com.niuzhj;

public class Filter {
    public static String filterFunc(String readLine, String keyWord) {
        if(readLine.contains(keyWord)) {
            return readLine;
        } else {
            return "";
        }
    }
}
