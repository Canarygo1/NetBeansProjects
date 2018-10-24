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
public class ActividadA {
    
         public static void main(String[] args) {
            Random rnd = new Random();
            Scanner scan = new Scanner(System.in);
            int tiradas = 0;
            int aleatorio;
            int suma=0;
            System.out.print("Introducir el numero de tiradas que se desean:");
            tiradas =scan.nextInt();
         
             for (int i =0; i<tiradas;i++){
             
                   aleatorio = rnd.nextInt(6)+1;
                   System.out.println("El numero de la tirada es"+(i+1)+"ª es:" 
                           +aleatorio);
                   
                   suma=aleatorio+suma;
         
             }
         
             System.out.println("-->La suma de puntos totales es de :"+suma);
         }
}
