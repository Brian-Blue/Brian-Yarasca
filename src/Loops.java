import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        System.out.println("===============");
        System.out.println("Ejemplo 1");
        System.out.println("===============");
        //imprimir los numeros del 1 al 10.
        for (int i = 1; i<=10;i++){
            System.out.println(i);
        }
        // Tabla de multiplicar
        // Tabla del 12.
        System.out.println("Tabla de multiplicar del 12");
        System.out.println("========================");
        Scanner sc = new Scanner(System.in);
        System.out.println("Hey, ingresa la tabla que quieres imprimir");
        int tab= sc.nextInt();
        for (int i=1;i<=12;i++){
            System.out.println(i+ " x "+tab+" = "+i*tab);
        }
        //bucles anidados
        System.out.println("===============");
        System.out.println("Ejemplo 4");
        System.out.println("===============");
        //tabla de multiplicar apiladas
        for (int i = 1;i<=5;i++) {

            for (int j = 1; j < 5; j++) {

                System.out.print(i + " x " + j + " = " + (i + j) + "\t");
            }
            System.out.println("I");
        }


    }
}
