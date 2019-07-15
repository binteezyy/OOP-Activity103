package activity103;

import javax.swing.JOptionPane;

public class PanganibanACM_Act103Exer19 {
	public static void main(String[] args) {
        int yearOfBirth = Integer.parseInt(JOptionPane.showInputDialog("Year of birth: "));
        int currentYear = Integer.parseInt(JOptionPane.showInputDialog("Current year: "));
        if (yearOfBirth > currentYear)
            currentYear += 100;

        JOptionPane.showMessageDialog(null, "Your age: " + (currentYear - yearOfBirth));
    }
}
