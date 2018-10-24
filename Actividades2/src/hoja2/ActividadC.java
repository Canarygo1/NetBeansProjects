/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja2;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author alejandrocruz
 */
public class ActividadC {
         public static void main(String[] args) {

         Random rnd = new Random();
         Scanner scan = new Scanner(System.in);
         int conjetura = 0;
         int aleatorio ;
         aleatorio = rnd.nextInt(100);
         System.out.println("Adivina un numero magico entre 0 y 100");
         
         double incio_ms = System.currentTimeMillis();
         
         while (conjetura !=aleatorio){
             System.out.print("Introduce una conjetura : ");
             conjetura = scan.nextInt();
             if (conjetura<aleatorio){
                 System.out.println("Tu conjetura es demasiado baja");
             }
             else {
                 System.out.println("Tu conjetura es demasiado alta");
             }
         
            }
         System.out.print("Felicidades has acertado " + conjetura +"="+aleatorio);
         double duracion = System.currentTimeMillis() - incio_ms;
         
         System.out.printf("El valor es ",(int)(duracion/1000));
         }
}