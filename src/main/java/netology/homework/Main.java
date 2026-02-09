package netology.homework;

import netology.homework.accounts.Account;
import netology.homework.accounts.CreditAccount;
import netology.homework.accounts.SimpleAccount;
import netology.homework.logers.Logger;
import netology.homework.logers.SimpleLogger;
import netology.homework.logers.SmartLogger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Account creditAccount = new CreditAccount(-1000000L);
        Account simpleAccount = new SimpleAccount();
        Logger simpleLogger = new SimpleLogger();
        Logger smartLogger = new SmartLogger();
        simpleLogger.log(String.valueOf(simpleAccount.getBalance()));
        smartLogger.log(String.valueOf(creditAccount.getBalance()));
        creditAccount.transfer(simpleAccount, 10000);
        simpleLogger.log(String.valueOf(simpleAccount.getBalance()));
        smartLogger.log(String.valueOf(creditAccount.getBalance()));
    }
}