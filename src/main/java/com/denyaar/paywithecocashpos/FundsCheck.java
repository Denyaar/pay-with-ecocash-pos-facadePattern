/**
 * Created by tendaimupezeni for banking-system-facde
 * User: tendaimupezeni
 * Date: 9/5/23
 * Time: 9:12 PM
 */

package com.denyaar.paywithecocashpos;

public class FundsCheck {

    private double availableAmount  = 10_000.00;

    public double getAvailableAmount() {
        return availableAmount;
    }

    private void  makePayment(double amountToPay){
        availableAmount -= amountToPay;
    }

    public  boolean  haveEnoughFunds(double payAmount$){
        if(getAvailableAmount() < payAmount$){
            System.out.println("Error, Insufficient Balance");
            System.out.println("Current Balance is: " + getAvailableAmount());
            return false;
        }else {
            makePayment(payAmount$);
            System.out.println("Payment Successful !!" + " Current Balance is : " + getAvailableAmount() +"\n");
            return  true;
        }

    }

}
