package oop1.ex;

public class Account {
    int balance; // 잔액

    // 입금
    void deposit(int amount) {
        balance += amount;
    }

    // 출금
    void withdraw(int amount) {
        // 잔액 부족
        if (balance < amount) {
            System.out.println("잔액 부족");
            return;
        }

        balance -= amount;
    }
}
