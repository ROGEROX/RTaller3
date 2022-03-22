package ejer2;

import javax.swing.JOptionPane;

public class ejer2 {
    public static void main(String[] args){
        int s_inicial, t_abonos, t_deducciones, l_credito, n_saldo; 
        
        s_inicial = Integer.parseInt(JOptionPane.showInputDialog("ingrese su saldo incial: "));
        t_abonos = Integer.parseInt(JOptionPane.showInputDialog("ingres el total de abonos en el mes: "));
        t_deducciones = Integer.parseInt(JOptionPane.showInputDialog("ingres el total de deducciones aplicadas: "));
        l_credito = Integer.parseInt(JOptionPane.showInputDialog("ingres el limite de creditos permitido: "));
        
        n_saldo = s_inicial + t_abonos - t_deducciones;
        
        if(n_saldo > l_credito){
            JOptionPane.showMessageDialog(null, "Se excedió el límite de su crédito");
        }else{
            JOptionPane.showMessageDialog(null,"no excedió el límite de su crédito");
        }
        
    }

}
