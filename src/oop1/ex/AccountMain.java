package oop1.ex;

public class AccountMain {

    public static void main(String[] args) {
        Account account = new Account();

        // 계좌 10000원 입금
        account.deposit(10000);

        // 계좌 9000원 출금
        account.withdraw(9000);

        // 계좌 2000원 출금
        account.withdraw(2000);

        System.out.println("잔고: " + account.balance);

    }
}
