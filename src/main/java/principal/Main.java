package principal;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor de 0-100:"));
        if (a <= 25){
            JOptionPane.showMessageDialog(null,"Intervalo [0-25]");
        }else if (a <= 50){
            JOptionPane.showMessageDialog(null,"Intervalo [25-50]");
        }else if (a <= 100){
            JOptionPane.showMessageDialog(null,"Intervalo [50-100]");
        }
        else{
            JOptionPane.showMessageDialog(null,"Fora do intervalo");
        }



    }
}