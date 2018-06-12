package com.yuyu.abstractFactory;

/**
 * Created by 彦祖 .
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
public class Test {

    public static void main(String[] args) {

        AbstractFactory mouseFactory = FactoryProducer.getFactory("MOUSE");

        Mouse mouse1 = mouseFactory.getMouse("RED");

        mouse1.use();

        Mouse mouse2 = mouseFactory.getMouse("BLUE");

        mouse2.use();


        AbstractFactory keyboardFactory = FactoryProducer.getFactory("KEYBOARD");

        KeyBoard keyBoard1 = keyboardFactory.getKeyBoard("RED");

        keyBoard1.use();

        KeyBoard keyBoard2 = keyboardFactory.getKeyBoard("BLUE");

        keyBoard2.use();


    }
}
