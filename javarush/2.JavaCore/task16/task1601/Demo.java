package com.javarush.task.task16.task1601;

import java.util.regex.*;

public class Demo {
    private Pattern pattern, pattern2;
    private Matcher m;
    private static final String EMAIL_PATTERN ="^[a-zA-Z0-9_-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-]+$";

    public Demo(){
        pattern = Pattern.compile(EMAIL_PATTERN);
    }

    boolean checkEmail(String email){
        m = pattern.matcher(email);
        return m.matches();
    }

    public static void main(String[] args){
        Demo demo = new Demo();
        System.out.println(demo.checkEmail("info@team.ru"));


    }
}
