import java.util.Scanner;

public class repaso {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese monto a convertir: ");
        double valor = scanner.nextDouble();
        System.out.println("Escoga las opciones: ");
        System.out.println("1. Euros");
        System.out.println("2. Pesos Mexicanos");
        System.out.println("3. Soles");
        int opc = scanner.nextInt();
        switch (opc){
            case 1:
                System.out.println("Conversion "+valor*3.56);
        }

    }
}






