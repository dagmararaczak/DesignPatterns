package designPatterns.facade;

public class FundChecker {

    private double money = 100.00;


    public double getMoney() {
        return money;
    }

    public boolean haveEnoughMoney(double cash) {

        if (cash > getMoney()) {

            System.out.println("You wanna take: " + cash+"$");
            System.out.println("You dont have enough money in your account");
            System.out.println("You have : " + getMoney() + "$");

            return false;

        } else {

            System.out.println("You take " + cash + "$");
            decreaseMoney(cash);

            System.out.println("You have on your account: " + getMoney() + "$");

        return true;
        }

    }
    public void decreaseMoney(double moneyWithDraw){

        money-=moneyWithDraw;

    }

    public void increaseMoney(double moneyDeposited){

        money+=moneyDeposited;

    }

    public void makeDeposit(double cash){

        increaseMoney(cash);

        System.out.println("You have on your account:  " + getMoney() + "$");

    }


}
