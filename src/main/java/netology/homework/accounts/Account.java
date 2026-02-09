package netology.homework.accounts;

public abstract class Account {
    protected long balance;

    public abstract boolean add(long amount);

    public abstract boolean pay(long amount);

    public boolean transfer(Account account, long amount) {
        if (pay(amount)) {
            account.add(amount);
            return true;
        }
        return false;
    }

    public long getBalance() {
        return balance;
    }
}
