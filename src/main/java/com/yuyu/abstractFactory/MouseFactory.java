package com.yuyu.abstractFactory;

import com.yuyu.abstractFactory.mouseImpl.BlueMouse;
import com.yuyu.abstractFactory.mouseImpl.RedMouse;

/**
 * Created by 彦祖 .
 */
public class MouseFactory extends AbstractFactory {

    @Override
    public Mouse getMouse(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new RedMouse();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new BlueMouse();
        }
        return null;
    }

    @Override
    public KeyBoard getKeyBoard(String color) {
        return null;
    }
}
