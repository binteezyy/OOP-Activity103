package activity103;

import javax.swing.JOptionPane;

public class PanganibanACM_Act103Exer27 {
	public static void main(String[] args) {
        float frontRight = Float.parseFloat(JOptionPane.showInputDialog("Input right front pressure"));
        if (frontRight < 35 || frontRight > 45)
            JOptionPane.showMessageDialog(null, "Warning: pressure is out of range");
        float frontLeft = Float.parseFloat(JOptionPane.showInputDialog("Input left front pressure"));
        if (frontLeft < 35 || frontLeft > 45)
        	JOptionPane.showMessageDialog(null,"Warning: pressure is out of range");
        float rearRight = Float.parseFloat(JOptionPane.showInputDialog("Input right front pressure"));
        if (rearRight < 35 || rearRight > 45)
        	JOptionPane.showMessageDialog(null,"Warning: pressure is out of range");
        float rearLeft = Float.parseFloat(JOptionPane.showInputDialog("Input left front pressure"));
        if (rearLeft < 35 || rearLeft > 45)
        	JOptionPane.showMessageDialog(null,"Warning: pressure is out of range");

        JOptionPane.showMessageDialog(null,"Inflation is "
                + (Math.abs(frontRight - frontLeft) <= 3 && Math.abs(rearRight - rearLeft) <= 3 ? "OK" : "BAD"));
    }
}
