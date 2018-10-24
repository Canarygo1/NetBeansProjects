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
public class ActividadB {
         public static void main(String[] args) {
         Random rnd = new Random();
         Scanner scan = new Scanner(System.in);
         int aleatorio;
         int a = 0,b=0,c=0,d=0,e=0,f=0;
         int tiradas=0;
            System.out.print("Introducir el numero de veces de lanzamiento el dado:");
         tiradas =scan.nextInt();
         
         for (int i =0; i<tiradas;i++){
                
                  aleatorio = rnd.nextInt(6)+1;

                  switch(aleatorio){
                      case 1: a++;break;
                      case 2: b++;break;
                      case 3: c++;break;
                      case 4: d++;break;
                      case 5: e++;break;
                      case 6: f++;break;

                  }
                  
         
                  }
         System.out.println(a+"\n"+b+"\n"+c+"\n"+d+"\n"+e+"\n"+f);
         
        
         }

}
