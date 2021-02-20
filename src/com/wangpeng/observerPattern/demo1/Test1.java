package com.wangpeng.observerPattern.demo1;

/**
 * @author: DWP
 * @Date: 2021/2/20 18:13
 */
public class Test1 {

    public static void main(String[] args) {

        Sub sub = new Sub();
        new ExObser10(sub);
        new ExObser100(sub);

        System.out.println("第一次10");
        sub.setNum(10);

        System.out.println("第二次20");
        sub.setNum(20);

    }

}
