/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hoja1;

import java.util.Scanner;

/**
 *
 * @author alejandro
 */
public class Actividad6 {
             public static void main(String[] args){
             Scanner scan = new Scanner(System.in);
             int agno;
             System.out.println("En que año en particular necesitas saber si es bisiesto?:");
             agno = scan.nextInt();
                if(agno%4==0 && agno%100!=100 || agno%400==0)
                        System.out.print ("Bisiesto");
                
                else 
                        System.out.print ("No bisiesto");
        }
}
