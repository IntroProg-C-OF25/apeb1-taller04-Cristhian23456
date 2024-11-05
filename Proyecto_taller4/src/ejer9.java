

/**
 * Ejercicio 9 :  El programa debe calcular el área del polígono. La figura se compone de un
cuadrado perfecto (A), tres triángulos rectángulos iguales (B, C, E), cuya base
mide lo mismo que uno de los lados del cuadrado, y un rectángulo cuyo ancho mide lo
mismo que uno de los lados del cuadrado, mientras que la altura mide lo mismo que
la altura de los triángulos. Se pide que haga un programa que calcule el área
total.
 * @author Cristhian Quizhpe
 */
import java.util.Scanner;

public class ejer9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base, hipotenusa, altura, areaTriangulos, areaCuadrado, areaRectangulo, areaPoligono;

        System.out.print("Ingrese el valor de la base del triángulo (que también es el lado del cuadrado): ");
        base = input.nextDouble();

        System.out.print("Ingrese el valor de la hipotenusa del triángulo: ");
        hipotenusa = input.nextDouble();

        altura = Math.sqrt((hipotenusa * hipotenusa) - (base * base));

        areaTriangulos = (base * altura) / 2 * 3;

        areaCuadrado = base * base;

        areaRectangulo = base * altura;

        areaPoligono = areaTriangulos + areaCuadrado + areaRectangulo;

        System.out.println("El área total del polígono es: " + areaPoligono);
        
    }
}

