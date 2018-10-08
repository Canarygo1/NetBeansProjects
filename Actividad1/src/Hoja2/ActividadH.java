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
public class ActividadH {
    public static void main(String[] args) {

    
    Scanner scan = new Scanner(System.in);
    double x1,x2,x3,y1,y2,y3;
    double lado1,lado2,lado3;
    double resultado1,resultado2;
    double s,area;
        System.out.print("Introduzca los 3 vertices del triangulo a medir : ");
        x1 = scan.nextDouble(); 
        y1 = scan.nextDouble();
        x2 = scan.nextDouble();
        y2 = scan.nextDouble();
        x3 = scan.nextDouble();
        y3 = scan.nextDouble();
        
    
    
    
         resultado1 = Math.pow(x2-x1, 2);
         resultado2 = Math.pow(y2 - y1, 2);
         lado1 = Math.sqrt(resultado1+resultado2);

         resultado1 = Math.pow(x3-x2, 2);
         resultado2 = Math.pow(y3 - y2, 2);
         lado2 = Math.sqrt(resultado1+resultado2);

         resultado1 = Math.pow(x3-x1, 2);
         resultado2 = Math.pow(y3-y1, 2);
         lado3 = Math.sqrt(resultado1+resultado2);
    
         
         s = (lado1+lado2+lado3)/2;
         area = Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
         
         System.out.printf("El area del triangulo es : %.2f",area);
         
         
         //1,5	   -4,6	3,8	5	9,5	-3,7
    }

}
