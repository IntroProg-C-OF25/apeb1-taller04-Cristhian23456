
/**
 * Ejercicio 7 : Generar un algoritmo que permita calcular y mostrar el valor a cancelar de una
planilla de luz. Se debe ingresar el valor de costo por kilovatio/hora y el número
de kilovatios consumidos en el mes. Si el usuario tiene edad mayor a 65 años, se
debe descontar el 10%.
 * @author User
 */
import java.util.Scanner;

public class ejer7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el costo por kilovatio/hora: ");
        double costoPorKilovatio = input.nextDouble();

        System.out.print("Ingrese el número de kilovatios consumidos en el mes: ");
        double kilovatiosConsumidos = input.nextDouble();

        System.out.print("Ingrese su edad: ");
        int edad = input.nextInt();

        double valorTotal = costoPorKilovatio * kilovatiosConsumidos;

        if (edad > 65) {
            valorTotal *= 0.9; 
        }

        System.out.println("El valor a cancelar de la planilla de luz es: $" + valorTotal);
        
    }
}
