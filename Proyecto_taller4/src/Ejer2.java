/**
 * Ejercicio 2 : Generar un algoritmo que permite ingresar los gastos de tres hijos de un padre de
familia; calcular y mostrar el total de gastos de los hijos del padre de familia.
 * @author Cristhian Quizhpe
 */
import java.util.Scanner;
public class Ejer2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         double hijo1, hijo2, hijo3, gasto_total;
         
         //Gastos
         System.out.print("Ingres los gastos del primer hijo ");        
         hijo1 = input.nextDouble();
         
         System.out.print("Ingres los gastos del primer hijo ");        
         hijo2 = input.nextDouble();
         
         System.out.print("Ingres los gastos del primer hijo ");        
         hijo3 = input.nextDouble();
         
         //Calculo de gasro tatal por los tres hijos
         
         gasto_total = hijo1 + hijo2+  hijo3;
         System.out.println("El gasto_total de todos los hijos es = " + gasto_total);
    }
}
