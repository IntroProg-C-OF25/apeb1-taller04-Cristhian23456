
/**
 * Ejercicio 6 : Generar un solución que permita calcular y mostrar el pago mensual de un préstamo
de 1 año de plazo. Se debe ingresar el monto del préstamo y el interés mensual a
cobrar.
 * @author Cristhian Quizhpe
 */
import java.util.Scanner;

public class ejer6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double montoPrestamo, interesMensual;
        
        int meses;
        System.out.print("Ingrese el monto del préstamo: ");
        montoPrestamo = input.nextDouble();

        System.out.print("Ingrese el interés mensual (%): ");
        interesMensual = input.nextDouble();

        meses = 12;
        double pagoMensual = montoPrestamo * (1 + (interesMensual / 100)) / meses;

        System.out.println("El pago mensual del préstamo es: $" + pagoMensual);
        
    }
}
