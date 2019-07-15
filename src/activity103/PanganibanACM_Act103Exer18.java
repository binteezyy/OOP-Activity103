package activity103;

import javax.swing.JOptionPane;

public class PanganibanACM_Act103Exer18 {
	public static void main(String[] args) {
        float apound = Float.parseFloat(JOptionPane.showInputDialog("Price per pound package A: "));
        float alean = Float.parseFloat(JOptionPane.showInputDialog("Percent lean package A: "));
        float bpound = Float.parseFloat(JOptionPane.showInputDialog("Price per pound package B: "));
        float blean = Float.parseFloat(JOptionPane.showInputDialog("Percent lean package B:"));

        float packageA = (apound / alean) * 100, packageB = (bpound / blean) * 100;
        JOptionPane.showMessageDialog(null, "Package A cost per pound of lean:" + packageA + "\n" +
        "Package B cost per pound of lean:" + packageB + "\n" +
        (packageA < packageB ? "Package A is the best Value" : "Package B is the best Value"));

    }
}
