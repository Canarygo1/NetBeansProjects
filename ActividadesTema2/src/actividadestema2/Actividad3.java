/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadestema2;
import java.util.Scanner;

/**
 *
 * @author alejandro
 */
public class Actividad3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String cadena1;
        String cadena2;
        char letra1;
        char letra2;
        String TituloN= "----Nombre y Apellido----";
        System.out.print("Introducir los datos en una cadena de la 1 persona");
        cadena1 = scan.nextLine();
        System.out.print("Introducir los datos en una cadena de la 2 persona");
        cadena2 = scan.nextLine();
        
        
        
        int k = cadena1.indexOf("-");
            String nombre1 = cadena1.substring(0,k);
            String numero1 = cadena1.substring(k+1);

        int m = cadena2.indexOf("-");
            String nombre2 = cadena2.substring(0,m);
            String numero2 = cadena2.substring(m+1);
            
           // System.out.printf("%s",nombre1);
        letra1 = nombre1.charAt(0);
        letra2 = nombre2.charAt(0);
        //System.out.print(nombre1+"---------"+numero2);
        if (letra1<letra2){
        System.out.printf("%-25s%12s\n",nombre1,numero1);
        System.out.printf("%-25s%12s\n",nombre2,numero2);
        }
            else{
        System.out.printf("%-25s%12s\n",nombre2,numero2);
        System.out.printf("%-25s%12s\n",nombre1,numero1);
                } 
    
            
        
        
            
            
            }

    
}
