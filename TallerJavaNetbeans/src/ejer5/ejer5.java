package ejer5;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ejer5 {
    public static void ganador(int valor1,int valor2,int valor3,int valor4,int num){
        
        if ((valor1 > valor2) && (valor1 > valor3) && (valor1 > valor4)){
            System.out.printf("\nEl candidato más votado fue el candidato %d",num);
            System.out.printf("\nEL candidato %d fue el ganador de las elecciones\n",num);
            
        }else if((valor1 == valor2) || (valor1 == valor3) || (valor1 == valor4)){
            System.out.printf("\nEl candidato más votado fue el candidato %d",num);
            System.out.printf("\nEL candidato %d fue el ganador de las elecciones\n",num);
        }
    }
    public static void main(String[] args) {
        JTextArea mensaje = new JTextArea();
        
        //Datos de la tabla
        int[] comuna = {1,2,3,4,5};
        int[] votosA = {194,180,221,432,820};
        int[] votosB = {48,20,90,50,61};
        int[] votosC = {206,320,140,821,946};
        int[] votosD = {45,16,20,14,18};
        
        //Vectores para el conteo de votos por comuna y por candidato
        int[] Num_votos = new int[4];
        int[] VotosComuna = new int[4];
        
        //Imprimir tabla
        mensaje.append("Comuna   CandidatoA   CandidatoB   CandidatoC   CandidatoD\n");
        for(int i=0;i<4;i++){
            mensaje.append("\n"+String.valueOf("    "+comuna[i]+"\t"+votosA[i]+"\t"+votosB[i]+"\t"
            +votosC[i]+"\t"+votosD[i]+"\n"));
            
            Num_votos[0] += votosA[i];
            Num_votos[1] += votosB[i];
            Num_votos[2] += votosC[i];
            Num_votos[3] += votosD[i];
            
            VotosComuna[i] = votosA[i]+votosB[i]+votosC[i]+votosD[i];
        }
        JOptionPane.showMessageDialog(null,mensaje,"Tabla de votos",JOptionPane.PLAIN_MESSAGE);
        
        //arreglos y variable para imprimir cantidad votos y porcentaje        
        int TotalVotos = Num_votos[0]+Num_votos[1]+Num_votos[2]+Num_votos[3];
        double[] porcentajes = new double[4];
        int MayorComuna = 0;
        
        //Imprimir cantidad de votos
        for(int i = 0; i<4;i++){
            porcentajes[i] = (Num_votos[i]*100)/TotalVotos;
            System.out.printf("La cantidad de votos del candidato %d es de %d con un "
                    + "porcentaje de %.2f\n",(i+1),Num_votos[i],porcentajes[i]);
            
            if(i==0){
                MayorComuna = comuna[i];
            }else{
                if(VotosComuna[i] > VotosComuna[i-1]){
                    MayorComuna = comuna[i] + 1;
                }
            }
        }
        
        //Imprimir el mas votado y el que ganó
        ganador(Num_votos[0],Num_votos[1],Num_votos[2],Num_votos[3],1);
        ganador(Num_votos[1],Num_votos[0],Num_votos[2],Num_votos[3],2);
        ganador(Num_votos[2],Num_votos[0],Num_votos[1],Num_votos[3],3);
        ganador(Num_votos[3],Num_votos[0],Num_votos[1],Num_votos[2],4);
        
        System.out.println("La comuna con mayor numero de votos fue la "+MayorComuna+"\n");
    }
}
