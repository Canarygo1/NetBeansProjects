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
            double nacimientos;
            double muertes;
            double indepe;
            double inmigrantes;
            int poblacionactual = 7523388;
            double variacionpoblacion;
            
            nacimientos = ((((60/19d)*60)*24)*365);
            muertes = ((((60/13d)*60)*24)*365);
            indepe = ((1/3d)*365);
            inmigrantes =  ((((60/45f)*60)*24)*365);
           
                         System.out.println(nacimientos);

            variacionpoblacion = ((indepe+muertes) *agno- (nacimientos+inmigrantes)*agno) ;
             System.out.print((int)(poblacionactual-variacionpoblacion));
        
        
        
    }
}
