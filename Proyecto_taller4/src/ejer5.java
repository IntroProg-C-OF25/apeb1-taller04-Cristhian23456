/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Ejercicio 5 : Generar un algoritmo que permita calcular y mostrar el costos de una computadora
de escritorio. La misma es comprada por partes; CPU, teclado, pantalla, ratón.
 * @author Cristhian Quizhpe 
 */
import java.util.Scanner;
public class ejer5{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double costoCPU, costoTeclado, costoPantalla, costoRaton, costo_total;
        
        System.out.print("Ingrese el costo del CPU: ");
        costoCPU = input.nextByte();
        
        System.out.print("Ingrese el costo del Teclado: ");
        costoTeclado = input.nextByte();
        
        System.out.print("Ingrese el costo del Pantalla: ");
        costoPantalla = input.nextByte();
        
        System.out.print("Ingrese el costo del Raton: ");
        costoRaton = input.nextByte();
        
        costo_total = costoCPU +costoPantalla + costoTeclado + costoRaton;
        
        System.out.print("El costo de la computadora es: " + costo_total);
    }
}
