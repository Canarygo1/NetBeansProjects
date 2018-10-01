/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author alejandro
 */
public class Actividad7 {
   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
       int tiempo = 0 ;
       System.out.println("Introduzca un numero entero para los segundos");
       tiempo=scan.nextInt();
       
       System.out.println(tiempo+" Segundos son " + tiempo/60 +" y " + tiempo%60 + " segundos");
       
       
       
    }
}
