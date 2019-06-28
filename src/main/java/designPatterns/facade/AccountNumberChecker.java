package designPatterns.facade;

public class AccountNumberChecker {

    private long accountNumber = 1234567;


    public boolean checkAccountNumber(long accountNumber){

        if(accountNumber == getAccountNumber()){

            return true;

        }else {

            return false;
        }


    }

    public long getAccountNumber() {
        return accountNumber;
    }


}

