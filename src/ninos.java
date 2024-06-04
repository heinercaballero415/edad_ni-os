import javax.swing.*;
import java.util.Scanner;

public class ninos {
    public static void main (String [] args){
        int  num;
        num = Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese la cantidad de estudiantes"));
        Scanner entrada = new Scanner(System.in);
        int edad[];
        int grado[];
        int estu[];
        int estudi[],conteo_igual = 0,sum_mayor =0,conteo_mayor = 0;
        edad = new int[num];
        grado = new int[num];
        estudi = new int[num];
        estu = new int[num];

        System.out.println("espere porfavor estamos guardando los datos");
        for (int i = 0 ; i < num; i++) {
            System.out.println((i + 1) + "porfavor ingrese el grado");
            grado[i] = entrada.nextInt();
        }
   
       for (int i = 0; i < num ; i++) {

           System.out.println((i + 1) + "porfavor digite la edad");
           edad[i] = entrada.nextInt();

       }

       int g=0;
       for(int i=0;i<num;i++){
           estudi[g] = edad[i];
           g++;
       }
       int j= 0;
       for (int i=0;i<num;i++){
           estu[j]= grado[i];
           j++;
       }
        System.out.println("estudiantes");
       for (int i = 0 ; i<num; i++){
           System.out.println("Grado : " + estu[i] + " Edad :" + estudi[i]);
       }
        }
    }

