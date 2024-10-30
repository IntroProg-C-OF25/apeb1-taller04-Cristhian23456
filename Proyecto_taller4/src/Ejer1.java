/**
 * Ejercicio 1 :Generar un algoritmo que permite calcular y presentar el área de un triángulo.
Los datos deben ser pedidos al usuario.
 * @author Cristhian Quizhpe
 */

import java.util.Scanner;
public class Ejer1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        double base,altura,area;
        System.out.println("Ingrese la base de: ");
        base = input.nextDouble();
        
        System.out.println("Ingrese la altura de: ");
        altura = input.nextDouble();
        
        area = (base*altura)/2;
        System.out.println("El area del triangulo = " + area);
    }
}
