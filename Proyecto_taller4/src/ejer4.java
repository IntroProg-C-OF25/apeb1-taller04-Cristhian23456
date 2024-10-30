/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
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
