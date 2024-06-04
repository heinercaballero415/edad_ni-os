import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese la cantidad de estudiantes"));
        Scanner entrada = new Scanner(System.in);
        int edad[];
        int grado[];
        int estu[];
        int estudi[];
        edad = new int[num];
        grado = new int[num];
        estudi = new int[num];
        estu = new int[num];

        for (int i = 0; i < num; i++) {

            System.out.println((i + 1) + "porfavor digite la edad");
            edad[i] = entrada.nextInt();

        }
        for (int i = 0; i < num; i++) {
            System.out.println((i + 1) + "porfavor ingrese el grado");
            grado[i] = entrada.nextInt();
        }
        int j = 0;
        for (int i = 0; i < num; i++) {
            estu[j] = edad[i];
            j++;
        }
        System.out.println(" edad :");
        for (int i = 0; i < num; i++) {
            System.out.println(estu[i] + " ");
        }
        int g = 0;
        for (int i = 0; i < num; i++) {
            estudi[g] = grado[i];
            g++;
        }
        System.out.println("grado :");
        for (int i = 0; i < num; i++) {
            System.out.println(estudi[i] + " ");
        }
        System.out.println();
        System.out.println("gracias por ingresar a nuestro programa");
        for (int i = 0; i < num; i++) {
            System.out.println("edad : " + estu[i] + "grado :" + estudi[i]);
        }
    }
}


