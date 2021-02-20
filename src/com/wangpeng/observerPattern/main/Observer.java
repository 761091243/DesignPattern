package com.wangpeng.observerPattern.main;

public abstract class Observer {
   protected Subject subject;
   public abstract void update();
}