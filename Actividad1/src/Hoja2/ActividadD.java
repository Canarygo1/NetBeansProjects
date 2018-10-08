/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hoja2;
import java.util.Scanner;
        /**
 *
 * @author alejandrocruz
 */
public class ActividadD {
         public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         
         double x1;
         double x2;
         double y1;
         double y2;
         double resultado1;
         double resultado2;
         double resultadoTotal;
          System.out.print("Introducir x1 e y1: ");
         x1=scan.nextDouble();
         y1=scan.nextDouble();
         System.out.print("Introducir x2 e y2: ");
         x2=scan.nextDouble();
         y2=scan.nextDouble();
         //((x2 - x1)2 + (y2 - y1)2)1/2
         //resultado1 = x2-x1;
         //resultado2 = y2-y1;
         resultado1 = Math.pow(x2-x1, 2);
         resultado2 = Math.pow(y2 - y1, 2);
         resultadoTotal = Math.sqrt(resultado1+resultado2);
         System.out.println(resultadoTotal);
         
         
         }
}
