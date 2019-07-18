package activity103;

import javax.swing.JOptionPane;

public class PanganibanACM_Act103Exer42 {
	public static void main(String[] args) {
        double balance = 1000, totalPayments = 0, monthlyPayment;
        monthlyPayment = Double.parseDouble(JOptionPane.showInputDialog("Enter the monthly payment:"));
        String message = "";
        int i = 1;
        while (balance > 0) {
            balance += balance * 0.015;
            balance -= monthlyPayment;
            totalPayments += monthlyPayment;
            message += "Month: " + (i++) + " balance: " + balance + " total payments: " + totalPayments + "\n";
        }
        JOptionPane.showMessageDialog(null, message);
    }
}
