package netology.homework;

import netology.homework.accounts.Account;
import netology.homework.accounts.CreditAccount;
import netology.homework.accounts.SimpleAccount;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Account creditAccount = new CreditAccount(-1000000L);
        Account simpleAccount = new SimpleAccount();
        System.out.println(creditAccount.getBalance());
        System.out.println(simpleAccount.getBalance());
        creditAccount.transfer(simpleAccount,10000);
        System.out.println(creditAccount.getBalance());
        System.out.println(simpleAccount.getBalance());
    }
}