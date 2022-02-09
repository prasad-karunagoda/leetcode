package prasad.leetcode.p2043;

public class SimpleBankSystem {

    private final long[] balance;
    private final int n;

    public SimpleBankSystem(long[] balance) {
        this.balance = balance;
        n = balance.length;
    }

    public boolean transfer(int account1, int account2, long money) {
        if (account1 >= 1 && account1 <= n && account2 >= 1 && account2 <= n) {
            if (balance[account1 - 1] >= money) {
                balance[account1 - 1] = balance[account1 - 1] - money;
                balance[account2 - 1] = balance[account2 - 1] + money;
                return true;
            }
        }
        return false;
    }

    public boolean deposit(int account, long money) {
        if (account >= 1 && account <= n) {
            balance[account - 1] = balance[account - 1] + money;
            return true;
        }
        return false;
    }

    public boolean withdraw(int account, long money) {
        if (account >= 1 && account <= n) {
            if (balance[account - 1] >= money) {
                balance[account - 1] = balance[account - 1] - money;
                return true;
            }
        }
        return false;
    }
}
