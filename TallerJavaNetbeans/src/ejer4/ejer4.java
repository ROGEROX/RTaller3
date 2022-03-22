package ejer4;

public class ejer4 {
    public static void main(String[] args) {
        
        String[] E = {"Roger","Leonardo","Juliana","Robert","Andrea","Isabella"};
        int [] H = {45,67,44,68,42,50};
        double[] T = {5000.34,2500.56,3000,7000,5000,10000};
        double[] sueldo = new double[6];
        
        
        System.out.println("\tCalcular el valor a pagar de cada trabajador");
        System.out.println("\nEmpleado: Horas de trabajo\n");
        
        for (int i=0;i<6;i++){
            
            System.out.println(E[i]+": "+H[i]);            
            sueldo[i] = T[i]*H[i];
        }
        System.out.println();
        for (int i = 0;i<6;i++){
            System.out.printf("EL total a pagar a %s es de %.2f\n",E[i],sueldo[i]);
        }
    }
}
