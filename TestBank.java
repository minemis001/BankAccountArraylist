public class TestBank {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustomer("Budi", "Santoso");
        bank.addCustomer("Siti", "Aminah");

        bank.getCustomer(0).setAccount(new Account(1000));
        bank.getCustomer(1).setAccount(new Account(500));
        bank.getCustomer(0).addAccount(new Account(2500));

        Account a = bank.getCustomer(0).getAccount();
        System.out.println("Jumlah customer : " + bank.getNumOfCustomers());
        System.out.println("Saldo awal      : " + a.getBalance());
        System.out.println("Deposit 250     : " + a.deposit(250) + " -> " + a.getBalance());
        System.out.println("Withdraw 300    : " + a.withdraw(300) + " -> " + a.getBalance());
        System.out.println("Withdraw 5000   : " + a.withdraw(5000) + " -> " + a.getBalance());

        for (int i = 0; i < bank.getNumOfCustomers(); i++) {
            Customer c = bank.getCustomer(i);
            System.out.println(c.getFirstName() + " " + c.getLastName()
                + " | jumlah akun: " + c.getNumOfAccounts());
            for (int j = 0; j < c.getNumOfAccounts(); j++) {
                System.out.println("   akun " + (j + 1) + " | saldo: " + c.getAccount(j).getBalance());
            }
        }
    }
}
