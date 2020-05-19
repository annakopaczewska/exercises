package oop_exercises.savingaccount;

public class SavingAccount {
    private double savingBalance;
    public static double annualInterestRate;

    public SavingAccount(){
        annualInterestRate = 0.0;
        savingBalance = 0.0;
    }

    public SavingAccount(double savBal, double intRate){
        savingBalance = savBal;
        annualInterestRate = intRate;
    }

    public double calculateMonthlyInterest(){
        double intRate = (savingBalance * annualInterestRate/ 12);
        savingBalance += intRate;
        return intRate;
    }
    public static void modifyInterestRate(double newInterestRate){
        annualInterestRate = newInterestRate;
    }

    public void setSavingBalance(double newBal){
        savingBalance = newBal;
    }

    public double getSavingBalance(){
        return savingBalance;
    }
    public double getAnnualInterestRate(){
        return  annualInterestRate;
    }

}
