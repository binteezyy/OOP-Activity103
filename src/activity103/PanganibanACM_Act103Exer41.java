package activity103;

import javax.swing.JOptionPane;

public class PanganibanACM_Act103Exer41 {
	public static void main(String[] args) {
        System.out.println("Computer Aided Design Program");
        while (true) {
            int x1, y1, x2, y2, width, height, area;
            x1 = Integer.parseInt(JOptionPane.showInputDialog("First corner X coordinate:"));

            y1 = Integer.parseInt(JOptionPane.showInputDialog("First corner Y coordinate:"));

            x2 = Integer.parseInt(JOptionPane.showInputDialog("Second corner X coordinate:"));

            y2 = Integer.parseInt(JOptionPane.showInputDialog("Second corner Y coordinate:"));

            width = Math.abs(x1 - x2);
            height = Math.abs(y1 - y2);
            if (width == 0 || height == 0) {
                JOptionPane.showMessageDialog(null, "Cannot be a rectangle");
                break;
            }
            area = width * height;
            JOptionPane.showMessageDialog(null, "Width: " + width + " Height: " + height + " Area: " + area + "\n");
        }
    }
}
