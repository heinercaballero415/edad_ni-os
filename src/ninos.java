import javax.swing.*;
import java.util.Scanner;

public class ninos {
    public static void main (String [] args){
        int  num;
        num = Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese la cantidad de estudiantes"));
        Scanner entrada = new Scanner(System.in);
        float edad [] = new float [num];

       float suma_mayor = 0 , suma_menor = 0 ,media_mayor , media_menor;
       int conteo_mayor = 0 , conteo_menor = 0 , conteo_igual = 0;

        System.out.println("espere porfavor estamos guardando los datos");
       for (int i = 0; i < num ; i++) {

           System.out.println((i + 1) + "porfavor digite la edad");
           edad[i] = entrada.nextFloat();

           if (edad[i] == 5) {
               conteo_igual++;
           }
            if (edad[i] >= 5 ) {
               suma_mayor += edad[i];
               conteo_mayor++;
           }
            if (edad[i] < 5 ){
               suma_menor += edad[i];
               conteo_menor++;
           }

       }
       if (conteo_igual == 5){
           System.out.println("no se puede saber la cantidad de niños que son menores de 5 años");
       }
       else {
           System.out.println("los niños que tienen 5 años son: " + conteo_igual);
       }
       if (conteo_mayor == 5){
           System.out.println("no se puede saber la cantidad de niños que son menores de 5 años");
       }
       else {
           media_mayor = suma_mayor / conteo_mayor;
           System.out.println("la media de los  niños que son mayores a 5 son: " + media_mayor);

       }
if (conteo_menor == 5){
    System.out.println("no se puede saber la cantidad de niños que son menores de 5 años");
}
else {
    media_menor = suma_menor / conteo_menor;
    System.out.println("niños que son menores de 5 años son: " + media_menor);
}
    }
}
