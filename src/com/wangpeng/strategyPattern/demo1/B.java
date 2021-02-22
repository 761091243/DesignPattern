package com.wangpeng.strategyPattern.demo1;

/**
 * @author: DWP
 * @Date: 2021/2/22 11:50
 */
public class B implements Par {
    @Override
    public Integer doAction(Integer num1, Integer num2) {
        return num1 - num2;
    }
}
