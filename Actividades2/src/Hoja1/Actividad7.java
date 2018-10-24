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
public class Actividad7 {
        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);

            int numero;
            int resultado = 1;
            System.out.print("Introduce un numero : ");
            numero = scan.nextInt();
            int i = 2;
            do{                
                
                resultado = i;
                System.out.println("Estoy dentro");
                i++;
                }
            while (numero % i == 0);           
            System.out.println(resultado);
        }

}
