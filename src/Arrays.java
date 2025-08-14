import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("╔════════════════════════════╗");
            System.out.println("║    !!! BIENVENIDO !!!      ║");
            System.out.println("║   CONVERSOR DE MONEDAS Y   ║");
            System.out.println("║    TABLA DE MULTIPLICAR    ║");
            System.out.println("╚════════════════════════════╝");
            System.out.println("Ingrese su opcion \n1. Conversor de Monedas (S/) \n2. Tabla de Multiplicar");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("╔════════════════════════════╗");
                    System.out.println("║   CONVERSOR DE MONEDAS S/  ║");
                    System.out.println("╚════════════════════════════╝");
                    System.out.println("Ingrese el monto en soles");
                    double monto = sc.nextDouble();

                    if (monto <= 0) {
                        System.out.println("Error: El monto debe ser mayor que cero.");
                    } else {
                        // Paso 3: mostrar el menu
                        System.out.println("Convertir a : ");
                        System.out.println("1. Dolares");
                        System.out.println("2. Euros");
                        System.out.println("3. Yenes");
                        int opcion2 = sc.nextInt();

                        double montoConvertido = 0;
                        boolean opcionValida = true;

                        // Paso 4 Usar el switch de conversion
                        switch (opcion2) {
                            case 1:
                                montoConvertido = monto * 3.53;
                                break;
                            case 2:
                                montoConvertido = monto * 4.1;
                                break;
                            case 3:
                                montoConvertido = monto * 0.024;
                                break;
                            default:
                                System.out.println("Error: Opcion invalida.");
                                opcionValida = false;
                        }
                        if (opcionValida) {
                            System.out.println("Monto Convertido: "+montoConvertido);
                        }

                    }
                    break;

                case 2:
                    System.out.println("╔═══════════════════════════╗");
                    System.out.println("║   TABLA DE MULTIPLICAR    ║");
                    System.out.println("╚═══════════════════════════╝");
                    System.out.print("Ingrese el primer número: ");
                    double num1 = sc.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    double num2 = sc.nextDouble();
                    System.out.print("Ingrese operación (+, -, *, /): ");
                    char operacion = sc.next().charAt(0);

                    double resultado = 0;
                    boolean operacionValida = true;

                    switch (operacion) {
                        case '+':
                            resultado = num1 + num2;
                            break;
                        case '-':
                            resultado = num1 - num2;
                            break;
                        case '*':
                            resultado = num1 * num2;
                            break;
                        case '/':
                            if (num2 != 0) {
                                resultado = num1 / num2;
                            } else {
                                System.out.println("Error: División por cero no permitida.");
                                operacionValida = false;
                            }
                            break;
                        default:
                            System.out.println("Operación no válida.");
                            operacionValida = false;
                    }

                    if (operacionValida) {

                        String tipoResultado = (resultado >= 0) ? "Positivo" : "Negativo";
                        System.out.println("Resultado: " + resultado + " (" + tipoResultado + ")");
                    }

                    break;

            }
            System.out.println("Presione 1: para continuar , 0: para salir");




        }
        while (1 == sc.nextInt());// test Expression



    }
}
