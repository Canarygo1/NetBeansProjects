/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hoja1;

import java.util.Scanner;

/**
 *
 * @author alejandro
 */
public class Actividades4 {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

                int valorA;
                int suma = 0;
            
                System.out.println("Introducir una cifra menos que 50 (la serie terminara con un 0)");
                valorA = scan.nextInt();
                
                do {
                System.out.println("Introducir otro entero(si el numero es 0 o mayor que 50 se termina el programa):");
                valorA = scan.nextInt();
                    if (valorA!=0 || valorA<50)
                    suma = valorA+ suma;
                }
                while (valorA !=0 && valorA <50 || (valorA<50 && valorA>1) );
                System.out.println("La suma es " + suma);
        }
}
