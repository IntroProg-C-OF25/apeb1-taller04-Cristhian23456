/**
 * Ejercicio 2 : Generar un algoritmo que permite ingresar los gastos de tres hijos de un padre de
familia; calcular y mostrar el total de gastos de los hijos del padre de familia.
 * @author Cristhian Quizhpe
 */
import java.util.Scanner;
public class Ejer2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         double hijo1, h1_salud, h1_estudios,h1_otros;
         double hijo2, h2_salud, h2_estudios,h2_otros;
         double hijo3, h3_salud, h3_estudios,h3_otros;
         double  gasto_total;
         
         //Gastos para el primer hijo
         System.out.print("Ingres los gastos del primer hijo ");
         
         System.out.print("Ingrese los gastos de salud: ");
         h1_salud = input.nextDouble();
         
         System.out.print("Ingrese los gastos de estudio: ");
         h1_estudios = input.nextDouble();
         
         System.out.print("Ingrese los gastos de otros: ");
         h1_otros = input.nextDouble();
         
         hijo1 =h1_salud+h1_estudios+h1_otros;
         System.out.print("Los gastos del primer hijo = " + hijo1 );
         
         //Gastos para el segundo hijo
         System.out.print("Ingres los gastos del segundo hijo ");
         
         System.out.print("Ingrese los gastos de salud: ");
         h2_salud = input.nextDouble();
         
         System.out.print("Ingrese los gastos de estudio: ");
         h2_estudios = input.nextDouble();
         
         System.out.print("Ingrese los gastos de otros: ");
         h2_otros = input.nextDouble();
         
         hijo2 =h2_salud+h2_estudios+h2_otros;
         System.out.print("Los gastos del primer hijo = " + hijo2 );
         
         //Gastos para el primer hijo
         System.out.print("Ingres los gastos del tercer hijo ");
         
         System.out.print("Ingrese los gastos de salud: ");
         h3_salud = input.nextDouble();
         
         System.out.print("Ingrese los gastos de estudio: ");
         h3_estudios = input.nextDouble();
         
         System.out.print("Ingrese los gastos de otros: ");
         h3_otros = input.nextDouble();
         
         hijo3 =h3_salud+h3_estudios+h3_otros;
         System.out.print("Los gastos del primer hijo = " + hijo1 );
         
         //Calculo de gasro tatal por los tres hijos
         
         gasto_total = hijo1 + hijo2+  hijo3;
         System.out.println("gasto_total = " + gasto_total);
    }
}
