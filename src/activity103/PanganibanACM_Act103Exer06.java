package activity103;


import javax.swing.JOptionPane;

public class PanganibanACM_Act103Exer06 {
	public static void main(String[] args) {
        String radius = JOptionPane.showInputDialog("Input radius");
        int rad = Integer.parseInt(radius);
        double area = Math.pow((double) rad, 2) * Math.PI;
        JOptionPane.showMessageDialog(null, "The radius is: " + rad + " The area is: " + area);
    }
}
