package com.wangpeng.observerPattern.demo1;

/**
 * @author: DWP
 * @Date: 2021/2/20 18:03
 */
public class ExObser10 extends Obser{

    public ExObser10(Sub sub) {
        this.sub = sub;
        sub.binding(this);
    }

    @Override
    public void update() {
        System.out.println("10倍：" + sub.getNum()*10);
    }
}
