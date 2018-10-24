/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hoja1;

import java.util.Scanner;

/**
 *
 * @author alejandrocruz
 */
public class Actividad10a {
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         
         double r1;
         double r2;
         double b;
         double a;
         double c;
         double raiz;
         double discriminante;    
         System.out.print("Introducir los coeficientes de la ecuacion cuadratica...a, b, c:");
         a=scan.nextDouble();
         b=scan.nextDouble();
         c=scan.nextDouble();
         
         
         discriminante = Math.pow(b,2)-(4*(a*c));
         
         
         
         if (discriminante >0){
         raiz = Math.sqrt(discriminante);
         
         r1 = (-b-raiz)/(2*a);
         r2 = (-b+raiz)/(2*a);
         System.out.println("Las raices son:"+r1+" y  " +r2);
         
         }
         else if (discriminante == 0){
         raiz = Math.sqrt(discriminante);

         r1 = (-b-raiz)/(2*a);

          System.out.print("La raiz es :"+r1);
           } 
          else {
              System.out.print("No tiene soluciones reales");    
                  }
        
     }
    
}
