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
   // ("\n El volumen de un cilindro =%.2f", Volumen);

         public static void main(String[] args) {
             Scanner scan = new Scanner(System.in);
             float precioFinal= 0f ;
             float precioImpuestos = 0f;
             System.out.println("Por favor,introduzca el precio a calcular");
             precioFinal = scan.nextFloat();
             
             precioImpuestos = precioFinal*0.075f;
             precioFinal = (int)precioFinal+(int)precioImpuestos;
             System.out.print("El recarga aplicado al producto de coste "+(precioFinal-(int)precioImpuestos)+
                     "\u20ac es de "+(int)precioImpuestos+"\u20ac \n");
             System.out.print("El coste total a pagar por el articulo es de"+precioFinal+"\u20ac");
         }
}
