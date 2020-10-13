public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addCustomer("Jane", "Smith");

        bank.getCustomer(0).setAccount(new Account(2000));

        bank.getCustomer(0).getAccount().withdraw(500);

        double balance = bank.getCustomer(0).getAccount().getBalance();

        System.out.println("客户： " + bank.getCustomer(0).getFirstName() + " " + bank.getCustomer(0).getLastName() + "的账户余额为： " + balance);

        System.out.println("**********************");

        bank.addCustomer("炜杰", "周");

        System.out.println("银行客户的个数为： " + bank.getNumberOfCustomers());
    }
}
