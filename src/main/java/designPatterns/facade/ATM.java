package designPatterns.facade;

public class ATM {

    public static void main(String[] args) {

        BankAccountFacade bankaAccount = new BankAccountFacade(1234567,1234);

        bankaAccount.withDrawMoney(50);
        System.out.println();
        bankaAccount.withDrawMoney(60);
        System.out.println();
        bankaAccount.depositCash(100);

    }
}
