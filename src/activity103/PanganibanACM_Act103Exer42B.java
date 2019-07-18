package activity103;

import javax.swing.JOptionPane;

public class PanganibanACM_Act103Exer42B {
	public static void main(String[] args) {
        double balance, monthlyPayment, monthlyInterest, totalPayments = 0;

        balance = Double.parseDouble(JOptionPane.showInputDialog("Enter your balance: "));
        monthlyInterest = Double.parseDouble(JOptionPane.showInputDialog("Enter the monthly interest:"));
        monthlyPayment = Double.parseDouble(JOptionPane.showInputDialog("Enter the monthly payment:"));

        int i = 1;
        String message = "";
        while (balance > 0) {
            balance += balance * monthlyInterest / 100;
            balance -= monthlyPayment;
            totalPayments += monthlyPayment;
            message += "Month: " + (i++) + " balance: " + balance + " total payments: " + totalPayments + "\n";
        }
        JOptionPane.showMessageDialog(null, message);
    }
}
