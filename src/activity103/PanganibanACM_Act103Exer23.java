package activity103;

import javax.swing.JOptionPane;

public class PanganibanACM_Act103Exer23 {
	public static void main(String[] args) {
        System.out.println("Welcome to Yertle's Quest");
        String Name = JOptionPane.showInputDialog("Enter the name of your character: ");
        int strength = Integer.parseInt(JOptionPane.showInputDialog("Enter strenght (1-10): "));
        int health = Integer.parseInt(JOptionPane.showInputDialog("Enter health (1-10): "));
        int luck = Integer.parseInt(JOptionPane.showInputDialog("Enter luck (1-10): "));

        if ((strength + health + luck) > 15) {
            strength = 5;
            health = 5;
            luck = 5;
        }
        JOptionPane.showMessageDialog(null, Name + ", strength: " + strength + ", health: " + health + ", luck: " + luck);
    }
}
