package com.yuyu.abstractFactory;

/**
 * Created by 彦祖 .
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("MOUSE")){
            return new MouseFactory();
        } else if(choice.equalsIgnoreCase("KEYBOARD")){
            return new KeyBoardFactory();
        }
        return null;
    }

}
