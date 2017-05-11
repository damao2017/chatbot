package com.yann.autoreply.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by HSM11 on 2017/4/11.
 */
public class Matchers {
    public static String match(String p, String str){
        Pattern pattern = Pattern.compile(p);
        Matcher m = pattern.matcher(str);
        if(m.find()){
            return m.group(1);
        }
        return null;
    }
}
