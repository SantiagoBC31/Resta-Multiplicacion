//Santiago Bustos Coca
//26/08/2024
//Prueba Coperaiva
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double resultado;
        double primerNumero;
        double segundoNumero;
        int operacion;
        int seguirOperando;
        System.out.println("Bienvenido a la calculadora");
        do {
            System.out.println("¿Quieres hacer multiplicación o división?");
            System.out.println("Multiplicación = 1");
            System.out.println("División = 2");
            System.out.print("Elige una opción: ");
            operacion = teclado.nextInt();
            if (operacion == 1) {
                System.out.println("Elegiste multiplicación");
                System.out.print("Ingresa el primer número: ");
                primerNumero = teclado.nextDouble();
                System.out.print("Ingresa el segundo número: ");
                segundoNumero = teclado.nextDouble();
                resultado = primerNumero * segundoNumero;
                System.out.println("El producto es: " + resultado);
            } else if (operacion == 2) {
                System.out.println("Elegiste división");
                System.out.print("Ingresa el primer número: ");
                primerNumero = teclado.nextDouble();
                System.out.print("Ingresa el segundo número: ");
                segundoNumero = teclado.nextDouble();
                if (segundoNumero != 0) {
                    resultado = primerNumero / segundoNumero;
                    System.out.println("El cociente es: " + resultado);
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                }
            } else {
                System.out.println("Opción no válida.");
            }
            System.out.println("¿Quieres seguir operando?");
            System.out.println("Sí = 1");
            System.out.println("No = 2");
            System.out.print("Elige una opción: ");
            seguirOperando = teclado.nextInt();
        } while (seguirOperando == 1);
        System.out.println("Gracias por utilizar la calculadora.");
    }
}






