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
public class ActividadG {
  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      float precio;
      float propina;
      float total;
      System.out.print("Introduccion de subtotal y a continuacion la tasa en % a aplicar");
      precio = scan.nextFloat();
      propina = scan.nextFloat();
    
      propina = (propina/100)*precio;
      total = precio+propina;
      
      System.out.printf("La propina en euros %.2f \n El total a pagar es %.2f ",propina,total);

    
    
    }
}
