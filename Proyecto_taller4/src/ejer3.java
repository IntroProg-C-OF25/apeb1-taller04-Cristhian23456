
/**
 * Ejercicio 3 : Se desea desarrollar un algoritmo que permita mostrar la tabla de multiplicar de
un número ingresado por el usuario; solo en el caso que el valor del número esté
entre 2 y 6.
 * @author Cristhian Quizhpe
 */
import java.util.Scanner;

public class ejer3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero, i;
        
        System.out.print("Ingresa un número entre 2 y 6: ");
        numero = input.nextInt();

        if (numero >= 2 && numero <= 6) {
            System.out.println("\nTabla de multiplicar del " + numero + ":\n");
            for (i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        } else {
            System.out.println("\nEl número ingresado no está entre 2 y 6.");
        }
        
    }
}

