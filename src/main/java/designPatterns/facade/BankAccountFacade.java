package designPatterns.facade;

public class BankAccountFacade {


    private long accountNumber;
    private int securityCode;

    WelcomeToBank welcomeToBank;
    FundChecker fundChecker;
    SecurityCodeChecker securityCodeChecker;
    AccountNumberChecker accountNumberChecker;

    public BankAccountFacade(long accountNumber, int securityCode) {
        this.accountNumber = accountNumber;
        this.securityCode = securityCode;

        welcomeToBank = new WelcomeToBank();
        fundChecker = new FundChecker();
        securityCodeChecker = new SecurityCodeChecker();
        accountNumberChecker = new AccountNumberChecker();

    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void withDrawMoney(int cash){


        if(accountNumberChecker.checkAccountNumber(accountNumber) && securityCodeChecker.checkSecurityCode(securityCode)
        && fundChecker.haveEnoughMoney(cash)){

            System.out.println("Transaction complete");

        }else {

            System.out.println("Transaction failed ");
        }
    }

    public void depositCash(int cash){
        if(accountNumberChecker.checkAccountNumber(accountNumber) && securityCodeChecker.checkSecurityCode(securityCode)){

            fundChecker.makeDeposit(cash);

            System.out.println("Transaction complete");

        }else {

            System.out.println("Transaction failed ");
        }

    }
}
