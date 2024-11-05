/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Ejercicio 8 : Se debe generar un algoritmo que permite calcular y mostrar el valor total a
pagar mensual de servicios digitales de una persona. Los servicios digitales son:
netflix, youtube premium, dropbox, spotify. Si la persona es menor a 30 años se
descuenta el 20% del total mensual.
 * @author Cristhian Quizhpe
 */
import java.util.Scanner;

public class ejer8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el costo mensual de Netflix: ");
        double netflix = input.nextDouble();

        System.out.print("Ingrese el costo mensual de YouTube Premium: ");
        double youtubePremium = input.nextDouble();

        System.out.print("Ingrese el costo mensual de Dropbox: ");
        double dropbox = input.nextDouble();

        System.out.print("Ingrese el costo mensual de Spotify: ");
        double spotify = input.nextDouble();

        System.out.print("Ingrese su edad: ");
        int edad = input.nextInt();

        double totalMensual = netflix + youtubePremium + dropbox + spotify;

        if (edad < 30) {
            totalMensual *= 0.8; 
        }

        System.out.println("El valor total a pagar por servicios digitales es: $" + totalMensual);
        
    }
}
