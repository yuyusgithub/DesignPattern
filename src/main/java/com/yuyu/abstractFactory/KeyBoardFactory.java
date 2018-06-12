package com.yuyu.abstractFactory;

import com.yuyu.abstractFactory.keyBoardImpl.BlueKeyboard;
import com.yuyu.abstractFactory.keyBoardImpl.RedKeyboard;

/**
 * Created by 彦祖 .
 */
public class KeyBoardFactory extends AbstractFactory {


    @Override
    public Mouse getMouse(String color) {
        return null;
    }

    @Override
    public KeyBoard getKeyBoard(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new RedKeyboard();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new BlueKeyboard();
        }
        return null;
    }
}
