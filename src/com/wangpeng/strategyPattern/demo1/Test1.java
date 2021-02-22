package com.wangpeng.strategyPattern.demo1;

/**
 * @author: DWP
 * @Date: 2021/2/22 11:55
 */
public class Test1 {

    public static void main(String[] args) {
        ContextD contextD = new ContextD(new A());
        System.out.println("20+10 ="+contextD.doRun(20,10));
        contextD = new ContextD(new B());
        System.out.println("20-10 ="+contextD.doRun(20,10));


    }


}
