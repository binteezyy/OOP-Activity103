package activity103;

import javax.swing.JOptionPane;

public class PanganibanACM_Act103Exer25 {
	public static void main(String[] args) {
        float frontRight = Float.parseFloat(JOptionPane.showInputDialog("Input right front pressure"));
        float frontLeft = Float.parseFloat(JOptionPane.showInputDialog("Input left front pressure"));
        float rearRight = Float.parseFloat(JOptionPane.showInputDialog("Input right rear pressure"));
        float rearLeft = Float.parseFloat(JOptionPane.showInputDialog("Input left rear pressure"));

        JOptionPane.showMessageDialog(null, "Inflation is " + (frontRight == frontLeft && rearRight == rearLeft ? "OK" : "BAD"));
    }
}
