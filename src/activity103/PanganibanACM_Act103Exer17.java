package activity103;

import javax.swing.JOptionPane;

public class PanganibanACM_Act103Exer17 {
	public static void main(String[] args) {

        float weight = Float.parseFloat(JOptionPane.showInputDialog("Write your weight in pounds"));
        JOptionPane.showMessageDialog(null, (weight >= 30 && weight <= 250) ? "You are allowed in the contest"
                : "You are not allowed in the contest");
    }
}
