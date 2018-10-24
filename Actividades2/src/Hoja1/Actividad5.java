/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hoja1;



/**
 *
 * @author alejandro
 */
public class Actividad5 {
         public static void main(String[] args) {
        
            int numero = 32000;
            double resultado = 0;
            int correcto = 0;
        
         for (  int i= 0; resultado<=numero;i++){
                resultado = Math.pow(i, 2);
                
                correcto = i ; 
               
         }
                
                System.out.println(correcto + "es el menor numero,tal que elevado al cuadrado es mayor que "+numero
                +" puesto que " + --correcto +"^2 = "+ Math.pow(correcto, 2)+" y "+(++correcto)
                        +"^2=" +Math.pow(correcto, 2));

        }
}
