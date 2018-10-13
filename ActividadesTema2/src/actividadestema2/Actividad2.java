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
public class Actividad2 {
       public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int aleatorio1;
       int aleatorio2;
       int intercambio;
       int resultado;
         
       aleatorio1 = (int) (Math.random()*50);
       aleatorio2 = (int) (Math.random()*50);
       
       if (aleatorio2<aleatorio1){
           intercambio = aleatorio2;
           aleatorio2 = aleatorio1;
           aleatorio1 = intercambio;
        }
       System.out.print("Que se obtiene de " +aleatorio1 +" -"+numero2);
       
       resultado = scan.nextInt();
       
       if (aleatorio1 + aleatorio2 ==resultado)
                 System.out.print("Es correcto");
       
            else 
                  System.out.print("No es correcto ");
       
        
       if (resultado%2 == 0 && resultado%3 == 0 )
           
       }
       
       }
}
