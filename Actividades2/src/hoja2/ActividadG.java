/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alejandrocruz
 */
public class ActividadG {
       public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         Random rnd = new Random();
         
         int aleatorio1;
         int aleatorio2;
         int sumauser=0;
         int suma;
         double incio_ms = System.currentTimeMillis();
         String user="";
         
         String condicion = " En esta fallastes";
         for (int i =0;i<3;i++){
         condicion =" En esta fallastes";
         aleatorio1 = rnd.nextInt(15)+1;
         aleatorio2 = rnd.nextInt(15)+1;
         suma = aleatorio1+aleatorio2;
         System.out.println("Que se obtiene de sumar: "+aleatorio1+"+"+aleatorio2);

         sumauser = scan.nextInt();
                 if (sumauser ==suma){
            System.out.println("Es correcto!"); 
            condicion =" En esta acertastes";
            }
                 
         
         user = user+Integer.toString(aleatorio1) +"+"+ Integer.toString(aleatorio2)+"="+Integer.toString(sumauser)+condicion+"\n";
         }
 
         double duracion = System.currentTimeMillis() - incio_ms;
         System.out.println("El tiempo empleado es de "+(int)(duracion/1000));
         System.out.println(user);
       }    
    
}
