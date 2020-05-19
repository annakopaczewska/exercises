package oop_exercises.savingaccount;

public class Main {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount();
        SavingAccount savingAccount2 = new SavingAccount();

        savingAccount.setSavingBalance(20000);
        savingAccount2.setSavingBalance(35000);

        SavingAccount.modifyInterestRate(0.04);
        savingAccount.calculateMonthlyInterest();
        savingAccount2.calculateMonthlyInterest();

        System.out.println(savingAccount.getSavingBalance());
        System.out.println(savingAccount2.getSavingBalance());

    }
}
