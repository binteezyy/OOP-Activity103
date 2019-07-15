package activity103;
import javax.swing.*;
public class PanganibanACM_Act103Exer03 {
	public static void main(String[] args) {
        float april = 12;
        float may = 14;
        float june = 8;
        float average = (april + may + june) / 3;

        JOptionPane.showMessageDialog(null, "Rainfall for April:\t" + april +"\n" 
        + "Rainfall for May:\t" + may + "\n" + "Rainfall for June:\t" 
        		+ june + "\n" + "Average rainfall:\t" + average);
    }
}
