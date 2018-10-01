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
public class Actividad5 {
    ("\n El volumen de un cilindro =%.2f", Volumen);

         public static void main(String[] args) {
             Scanner scan = new Scanner(System.in);
             float precioFinal= 0f ;
             float precioImpuestos = 0f;
             System.out.println("Por favor,introduzca el precio a calcular");
             precioImpuestos = scan.nextFloat()*0.075f ;
             precioFinal = precioFinal+precioImpuestos;
             System.out.println("los impuestos a pagar por "+ (precioFinal - precioImpuestos) + 
                     ("son de : %0f")), precioImpuestos;
         }
}
