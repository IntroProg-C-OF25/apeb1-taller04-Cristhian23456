
/**
 * Ejercicio 4 : Generar un algoritmo que permita calcular y mostrar el valor de la planilla de
teléfono de un casa. Se debe ingresar el costo por minutos, el número de minutos
consumidos en el mes.
 * @author Cristhian Quizhpe 
 */
import java.util.Scanner;
public class ejer4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double planilla, costo_minutos, minutos_consumidos;
        
        System.out.print("Ingrese el costo por minutos: ");
        costo_minutos = input.nextDouble();
        
        System.out.print("Ingrese el costo por minutos: ");
        minutos_consumidos = input.nextDouble();
        
        planilla= costo_minutos * minutos_consumidos;
        System.out.println("Planilla = " + planilla);
    }
}
