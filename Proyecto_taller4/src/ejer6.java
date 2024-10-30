/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
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
