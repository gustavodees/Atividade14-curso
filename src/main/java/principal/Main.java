package principal;

import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor de 0-100:"));
        if (a < 0.0 || a > 100) {
            JOptionPane.showMessageDialog(null,"Fora do intervalo");
        }else if (a <= 25){
            JOptionPane.showMessageDialog(null,"Intervalo [0-25]");
        }else if (a <= 50){
            JOptionPane.showMessageDialog(null,"Intervalo [25-50]");
        } else if(a <= 75) JOptionPane.showMessageDialog(null, "Intervalo [50-75]");
        else if (a <= 100) JOptionPane.showMessageDialog(null,"Intervalo [0-100]");
    }
}