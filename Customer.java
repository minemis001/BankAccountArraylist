import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    private ArrayList<Account> accounts;

    public Customer(String f, String l) {
        this.firstName = f;
        this.lastName = l;
        this.accounts = new ArrayList<Account>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAccount(Account acct) {
        if (accounts.isEmpty()) {
            accounts.add(acct);
        } else {
            accounts.set(0, acct);
        }
    }

    public Account getAccount() {
        return accounts.isEmpty() ? null : accounts.get(0);
    }

    /** Menambah akun tambahan. */
    public void addAccount(Account acct) {
        accounts.add(acct);
    }

    public Account getAccount(int index) {
        if (index >= 0 && index < accounts.size()) {
            return accounts.get(index);
        }
        return null;
    }

    public int getNumOfAccounts() {
        return accounts.size();
    }
}
