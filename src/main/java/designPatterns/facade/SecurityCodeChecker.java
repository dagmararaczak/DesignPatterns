package designPatterns.facade;

public class SecurityCodeChecker {

    private int securityCode = 1234;

    public int getSecurityCode() {
        return securityCode;
    }

    public boolean checkSecurityCode(int securityCode){

        if(securityCode == getSecurityCode()){
            return true;

        }else {

            return false;
        }


    }
}
