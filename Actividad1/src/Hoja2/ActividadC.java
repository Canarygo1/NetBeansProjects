/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hoja2;
import java.util.Scanner;
/**
 *
 * @author alejandrocruz
 */
public class ActividadC {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    //System.out.println("Introduzca la cantidad de dinero");
    float dinero ;
    float cent50;
    float cent10;
    float euro;
    float cent5;
    float cent1;
    float resto;
    dinero = scan.nextFloat();
    System.out.printf("Tu cantidad %.2f € consiste en :", dinero);
            
   
    euro = (int)dinero/1;
    dinero = (dinero-euro)*100;
    
    cent50 = (int)dinero/50;
    dinero = dinero-(cent50*50);
    
    cent10 = (int)dinero/10;
    dinero = dinero-(cent10*10);
    
    cent5 = (int)dinero/5;
    dinero = dinero-(cent5*5);
    
    cent1 = dinero/1;
    resto = dinero%1;
    cent1=cent1+resto;
    
    
    System.out.println("\n"+(int)euro+" Monedas de 1€ ");
    System.out.println((int)cent50+" Monedas de 50 Cent€");
    System.out.println((int)cent10+" Monedas de 10 Cent€ ");
    System.out.println((int)cent5+" Monedas de 5 Cent€");
    System.out.println((int)cent1+" Monedas de 1 Cent€");
    
    
    
    
    
    
    }
}
