//Урок 5. Создание объектов. Понятие ,конструктор,. Объявление и вызов методов.
//main.java.net.borymskyi.javacore.homework lesson5
package main.java.net.borymskyi.javacore.homework.lesson5;

public class BankAccount {
    int id;
    double balance;

    public BankAccount(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public void popolnenieScheta(int value) {
        balance += value;
    }

    public void snyatieSoScheta(int value) {
        balance -= value;
    }
}
