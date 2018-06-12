package com.yuyu.factory.impl;

import com.yuyu.factory.Shape;

/**
 * Created by 彦祖 .
 */
public class Square implements Shape {

    public void draw() {
        System.out.println("调用了正方形的的绘图方法！");
    }

}
