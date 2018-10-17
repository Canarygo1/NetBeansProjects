/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hoja1;

import java.util.Scanner;

/**
 *
 * @author alejandrocruz
 */
public class Actividad3 {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduzca el numero de años");
            int agno = scan.nextInt();
            float nacimientos;
            float muertes;
            float indepe;
            float inmigrante;
            int poblacionactual = 7523388;
            int variacionpoblacion;
            
            nacimientos = ((((60/19f)*60)*24)*365);
            muertes = ((((60/13f)*60)*24)*365);
            indepe = ((1/3f)*365);
            inmigrante =  ((((60/45f)*60)*24)*365);
           
                         System.out.println(nacimientos);

            variacionpoblacion = (Math.round(indepe)+Math.round(muertes))*agno - 
                                                (Math.round(nacimientos)+Math.round(inmigrante))    *agno;
             System.out.print(poblacionactual-variacionpoblacion);
        
        
        
    }
}
