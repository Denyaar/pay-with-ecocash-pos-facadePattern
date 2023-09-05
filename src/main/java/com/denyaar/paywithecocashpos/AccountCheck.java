/**
 * Created by tendaimupezeni for banking-system-facde
 * User: tendaimupezeni
 * Date: 9/5/23
 * Time: 9:05 PM
 */

package com.denyaar.paywithecocashpos;


public class AccountCheck {

    final  private int phoneNumber  = 771815579;

    public int getAccountNumber() {
        return phoneNumber;
    }
    public  boolean accountNumberActive(int accNumber){

        if(accNumber == getAccountNumber())
            return true;
        else
            return false;
    }
}
