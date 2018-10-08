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
public class ActividadE {
        public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
        int numeroInicial;
        int numeroFinal;
        
        int numero2;
        int numero1;
        
       System.out.println(" Introduce un numero entero entre 000 y 1000");
        numeroInicial = scan.nextInt();
        numeroFinal = numeroInicial;
        numero1 = numeroFinal%10;
        numeroFinal = numeroFinal/10;
        numero2 = numeroFinal%10;
        numeroFinal = numeroFinal/10;
        
        System.out.print("La suma de los digitos"+numeroInicial+" es "+(numero1+numero2+numeroFinal));
        }
}
