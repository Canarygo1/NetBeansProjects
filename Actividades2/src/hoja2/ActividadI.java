/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja2;

import java.util.Scanner;

/**
 *
 * @author alejandrocruz
 */
public class ActividadI {
         public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         int ultposicion = 0;
         
         String texto ="";
         String textoalreves="";
         String textoImpares="";
         System.out.print("Por favor ,introduzca la frase");
         texto = scan.nextLine();
         
         
        
         
         for (int i=texto.length()-1;i>=0;i--){
             textoalreves = textoalreves+texto.charAt(i);
             if (i%2==0){
             textoImpares = textoImpares+texto.charAt(i);
             }
         
         }
         System.out.println("El texto alreves es :"+textoalreves);
         
         
         System.out.println("DECTAR CARACTERES EN POSICIONES IMPARES:");
         System.out.println("----Se muestran los caracteres impares----:");
         System.out.println(textoImpares);
    }
}
