package activity103;

import javax.swing.JOptionPane;

public class PanganibanACM_Act103Exer22 {
	public static void main(String[] args) {
        int items = Integer.parseInt(JOptionPane.showInputDialog("Enter number of items: "));
        float time = Float.parseFloat(JOptionPane.showInputDialog("Enter single-item heating time (in minutes): "));

        if (items == 1) {
        } else if (items == 2) {
            time *= 1.5;
            JOptionPane.showMessageDialog(null, "Recommended heating time: " + time + " minutes");
        } else if (time == 3) {
            time *= 2;
            JOptionPane.showMessageDialog(null, "Recommended heating time: " + time + " minutes");
        } else if (time > 3) {
            JOptionPane.showMessageDialog(null, "Heating with more than 3 items is not recommended" + "\n" +
            		"Recommended heating time: " + time + " minutes");
        }
    }
}
