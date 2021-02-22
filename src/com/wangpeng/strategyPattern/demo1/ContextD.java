package com.wangpeng.strategyPattern.demo1;

/**
 * @author: DWP
 * @Date: 2021/2/22 11:51
 */
public class ContextD {
    private Par par;

    public ContextD(Par par) {
        this.par = par;
    }

    public Integer doRun(Integer Num1, Integer Num2){
        return par.doAction(Num1,Num2);
    }

}
