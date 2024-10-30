/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
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
