package ejer1;

import java.util.Scanner;

public class ejer1 {
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        int cant, t_productos=0, t_ingresos=0, m_vendido=0, cod_v = 0, m_costoso=0, cod_c =0;
        
        System.out.print("¿cuantos productos vendio hoy?: ");
        cant = entrada.nextInt();
        
        int[] a = new int[cant];
        int[] b = new int[cant];
        int[] c = new int[cant];
        
        for(int i=0;i<=cant-1;i++){
            System.out.println("\n---- Producto "+(i+1)+" ----");
            
            System.out.print("ingrese el codigo del producto: ");
            a[i] = entrada.nextInt();
            
            System.out.print("ingrese el valor del producto: ");
            b[i] = entrada.nextInt();
            
            System.out.print("ingrese la cantidad vendida del producto: ");
            c[i] = entrada.nextInt();
            
            t_productos += c[i];
            t_ingresos += (b[i]*c[i]);
            
            if(c[i] > m_vendido){
                m_vendido = c[i];
                cod_v = a[i];
            }
            
            if(b[i] > m_costoso){
                m_costoso = b[i];
                cod_c = a[i];
            }
            
        }
        System.out.println("\n------ Resultado ------");
        System.out.println("el total de productos vendidos es: "+t_productos);
        System.out.println("el total de ingresos del dia es: "+ t_ingresos);
        System.out.println("el codigo del producto mas vendido es: "+cod_v);
        System.out.println("el codigo del producto mas costoso es: "+cod_c);
    }
}
