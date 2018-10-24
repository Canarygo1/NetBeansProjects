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
public class ActividadF {
       public static void main(String[] args) {
                   Scanner scan = new Scanner(System.in);

           float x1,x2,y1,y2,radio1,radio2,distancia;
           float totalA;
           float totalB;
           System.out.print("Ingresar las coordenadas x e y del area circular primaria, y el radio: ");
           x1=scan.nextFloat();
           y1=scan.nextFloat();
           radio1=scan.nextFloat();
           System.out.print("Ingresar las coordenadas x e y del area circular secundaria, y el radio: ");
           x2=scan.nextFloat();
           y2=scan.nextFloat();
           radio2=scan.nextFloat();          
           totalA = (float) Math.pow((x2-x1),2);
           totalB = (float) Math.pow((y2-y1),2);
           
           distancia = (float)Math.sqrt(totalA+totalB);
          
           if (distancia<=(radio1-radio2))
           {
               System.out.print("El area circular secundaria esta dentro del area primaria"+distancia);

       }
           else if (distancia<=(radio1+radio2)){
                   
           System.out.print("el area circular secundaria tiene un solape parcial");
           }
           else{
           System.out.print("ambas areass circulares son independientes y no se solapan");
           }
          
           
           
    }
}
