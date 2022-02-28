package Scratch.PublicClasses;

import java.lang.System;
/**
 * Created by Family on 26.02.2022.
 */
public class SetCromeDriver {

    String key;
    String value;

    public void setCromeDriver(String key, String value){
        System.setProperty(key,value);

    }
}
