package org.example.homework4;

import java.util.Arrays;
import java.util.Objects;

/// Создайте класс BankAccount с полями owner, balance и методами deposit(amount), withdraw(amount), printBalance().
/// Добавьте массив transactions[], хранящий последние 5 операций.
/// Реализуйте метод printTransactions(), который выводит все операции.
/// В main создайте объект и протестируйте методы с циклами и массивами.
public class BankAccount {
    //максимальный индекс транзации в массиве transactions. Максимальное количество транзакций = MAX_TRANSACTION + 1
    private final int MAX_TRANSACTION = 4;

    private String owner;
    private int balance;
    private String[] transactions;

    public BankAccount (String owner) {
        this.owner = owner;
        this.balance = 0;
        this.transactions = new String[5];
    }
    public BankAccount (String owner, int balance, String[] transactions) {
        setOwner(owner);
        setBalance(balance);
        setTransactions(transactions);
    }

    /** внести средства на счет
    * @param amount сумма средств, над которой проводится операция. Можно внести только положительное число
    */
    public void deposit(int amount) {
        System.out.println("выполняется транзакция deposit: balance + " + amount);
        if (amount > 0) {
            balance = balance + amount;
            addTransaction("balance + " + amount);
        }
        else System.out.println("не удалось произвести операцию, проверьте корректность введенных данных");
    }

    /** снять средства со счета
     * @param amount сумма средств, над которой проводится операция. Можно снять только положительное число
     */
    public void withdraw(int amount) {
        System.out.println("выполняется транзакция withdraw: balance - " + amount);
        if (amount > 0) {
            int a = this.balance - amount;
            if (a >= 0) {
                this.balance = a;
                addTransaction("balance - " + amount);
            } else {
                System.out.println("недостаточно средств");
            }
        }
        else System.out.println("не удалось произвести операцию, проверьте корректность введенных данных");
    }
    public void printBalance() {System.out.println("баланс: " + balance);}
    /// TODO сделать нормальный вывод
    public void printTransactions() {
        System.out.println("список транзакций владельца " + owner + ": " + Arrays.toString(transactions)
            .replaceAll("[\\[\\]]", "")
            .replaceAll("null, ", "")
            .replaceAll("null", ""));
    }

    public void setOwner(String owner) {
        if (!Objects.isNull(owner) && !owner.isEmpty()) {
            this.owner = owner;
        }
    }
    public void setBalance(int balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
        else System.out.println("однажды солнце взорвется");
    }
    public void setTransactions(String[] transactions) {
        if (!Objects.isNull(transactions) && MAX_TRANSACTION+1 == transactions.length) {
            this.transactions = Arrays.copyOf(transactions, transactions.length);
        }
        else {
            System.out.println("указано некорректное значение, транзакция не сохранена");
        }
    }
    public String getOwner() {return this.owner;}
    public int getBalance() {return this.balance;}
    public String[] getTransactions() {return this.transactions;}

    private void addTransaction (String transaction) {
        System.arraycopy(transactions, 1, transactions, 0, MAX_TRANSACTION);
        transactions[MAX_TRANSACTION] = transaction;
    }
}
