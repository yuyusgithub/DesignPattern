package com.yuyu.factory;

/**
 * Created by 彦祖 .
 *
 * 优点：不需要知道其中的实现逻辑，只要知道一个产品名称就能获取实例；
 * 缺点：增加一个产品，就要增加一个实现类，并需要修改工厂方法，会似的类的数量线性增长；
 * 应用场景：Hibernate 换数据库只需换方言和驱动就可以
 *
 */
public class Test {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //获取 Circle 的对象，并调用它的 draw 方法
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //调用 Circle 的 draw 方法
        shape1.draw();

        //获取 Rectangle 的对象，并调用它的 draw 方法
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //调用 Rectangle 的 draw 方法
        shape2.draw();

        //获取 Square 的对象，并调用它的 draw 方法
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //调用 Square 的 draw 方法
        shape3.draw();
    }
}
