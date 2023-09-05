/**
 * Created by tendaimupezeni for banking-system-facde
 * User: tendaimupezeni
 * Date: 9/5/23
 * Time: 9:03 PM
 */

package com.denyaar.paywithecocashpos;

public class PaymentFacade {

    private final int accountNumber;
    private final int pin;

    AccountCheck accountCheck;
    SecurityPin securityPin;
    FundsCheck fundsCheck;

    public PaymentFacade(int accNumber, int aacPin ) {
        accountNumber = accNumber;
        pin = aacPin;

        accountCheck  =  new AccountCheck();
        securityPin= new SecurityPin();
        fundsCheck = new FundsCheck();

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getPin() {
        return pin;
    }

    public  void makePayment(double cashToPay)
    {
        if(accountCheck.accountNumberActive(getAccountNumber()) && securityPin.isPinCorrect(getPin())
                        && fundsCheck.haveEnoughFunds(cashToPay)) {
            System.out.println("Transaction Complete\n");
        } else {
            System.out.println("Transaction Failed");
        }
    }

}
