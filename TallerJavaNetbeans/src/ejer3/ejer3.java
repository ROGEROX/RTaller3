package ejer3;

import javax.swing.JOptionPane;

public class ejer3 {
    public static void main(String[] args) {
        int[] dias = new int[7];
        int i_semanal, interes_A = 9, interes_B = 9, t_vendido = 0, incremento_A = 0, incremento_B = 0;
        double aumento_A, aumento_B;
        i_semanal = 200;


        for (int i = 0; i <= 6; i++) {
            dias[i] = Integer.parseInt(JOptionPane.showInputDialog("ingrese el total vendido el dia " + (i + 1)));
            t_vendido += dias[i];
        }

        /*------ categoria A -------*/
        if (t_vendido > 3000) {
            incremento_A = 5;
            if (t_vendido > 5000) {
                incremento_A = 7;
                if (t_vendido > 7000) {
                    incremento_A = 10;
                }
            }
        }
        interes_A += incremento_A;


        /*------ categoria B -------*/
        if (t_vendido > 5000) {
            incremento_B = 7;
            if (t_vendido > 10000) {
                incremento_B = 10;
                if (t_vendido > 15000) {
                    incremento_B = 13;
                }
            }

        }
        interes_B += incremento_B;

        aumento_A = i_semanal + ((t_vendido * interes_A) / 100);
        aumento_B = i_semanal + ((t_vendido * interes_B) / 100);

        JOptionPane.showMessageDialog(null, "el pago semanal en la categoria A es: " + aumento_A);
        JOptionPane.showMessageDialog(null, "el pago semanal en la categoria B es: " + aumento_B);
    }
}
