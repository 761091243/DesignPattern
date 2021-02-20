package com.wangpeng.observerPattern.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: DWP
 * @Date: 2021/2/20 18:00
 */
public class Sub {
    private List<Obser> list = new ArrayList<>();
    private Integer num;

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
        noticeAll();
    }
    public void binding(Obser obser){
        list.add(obser);
    }
    public void noticeAll(){
        list.parallelStream().forEach(obser -> obser.update());
    }

}
