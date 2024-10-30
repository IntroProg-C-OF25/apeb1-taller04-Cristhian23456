/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.Scanner;

public class ejer9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base, altura, areaTriangulos, areaCuadrado, areaRectangulo, areaPoligono;

        System.out.print("Ingrese el valor de la base del triángulo (que también es el lado del cuadrado): ");
        base = input.nextDouble();

        System.out.print("Ingrese el valor de la hipotenusa del triángulo: ");
        double hipotenusa = input.nextDouble();

        altura = Math.sqrt((hipotenusa * hipotenusa) - (base * base));

        areaTriangulos = (base * altura) / 2 * 3;

        areaCuadrado = base * base;

        areaRectangulo = base * altura;

        areaPoligono = areaTriangulos + areaCuadrado + areaRectangulo;

        System.out.println("El área total del polígono es: " + areaPoligono);
        

    }
}

