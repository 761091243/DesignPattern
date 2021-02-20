package com.wangpeng.observerPattern.demo1;

/**
 * @author: DWP
 * @Date: 2021/2/20 18:11
 */
public class ExObser100 extends Obser{

    public ExObser100(Sub sub) {
        this.sub = sub;
        sub.binding(this);
    }

    @Override
    public void update() {
        System.out.println("100倍:" + sub.getNum()*100);
    }


}
