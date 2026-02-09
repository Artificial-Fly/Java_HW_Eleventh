package netology.homework.accounts;

public class SimpleAccount extends Account {
    @Override
    public boolean add(long amount) {
        if (amount < 0) {
            return false;
        }
        balance += amount;
        return true;
    }

    @Override
    public boolean pay(long amount) {
        if (amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }
}
