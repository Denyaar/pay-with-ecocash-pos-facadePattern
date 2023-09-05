/**
 * Created by tendaimupezeni for banking-system-facde
 * User: tendaimupezeni
 * Date: 9/5/23
 * Time: 9:09 PM
 */

package com.denyaar.paywithecocashpos;

public class SecurityPin {

    private final int pin  = 3322;

    public int getPin() {
        return pin;
    }

    public  boolean isPinCorrect(int pintToCheck){

        if(pintToCheck == getPin())
            return true;
        else
            return false;
    }

}
