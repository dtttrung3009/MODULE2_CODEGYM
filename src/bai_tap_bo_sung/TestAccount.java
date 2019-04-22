package bai_tap_bo_sung;

public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000);
        System.out.println("\t\t\t ACCOUNT\t\t Time: "+account.getDateCreated());
        account.setAnnualIterestRate(4.5);
        System.out.println("\t\tTiền lãi tháng "+account.getMonthlyInterest());
        System.out.println("\t\tSố dư sau khi rút 2000 là "+account.withdraw(2500));
        System.out.println("\t\tSố dư sau khi gửi 3000 là "+account.deposit(3000));
    }
}
