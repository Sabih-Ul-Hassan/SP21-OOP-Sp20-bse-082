package lab14;

public class Lab14__RUNNER__sp20_bse_082 {
    public static void main(String[] args) {
        ATM atm = new ATM();
        for (int i = 0; i < 10; i++) {
            atm.addAccount(new Account("name" + i, "" + i, 1000 * i + 1000));
        }
        atm.balanceInquire("1");
        atm.balanceInquire("5");
        atm.balanceInquire("10");
        atm.transfer("5", "1", 1000);
        System.out.println("\nAfter transfer\n");
        atm.balanceInquire("1");
        atm.balanceInquire("5");
        System.out.println("after withdraw");
        atm.withdraw("1", 100);
        atm.balanceInquire("1");
        System.out.println("after deposit");
        atm.deposit("1", 100);
        atm.balanceInquire("1");
    }
}
