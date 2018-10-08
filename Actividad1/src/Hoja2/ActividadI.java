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
public class ActividadI {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     
     //Valor_Inversionfutura = cantidad_inversión * (1+ tasa_de_interés_mensual)número de años *12
     
     double inversion;
     double inversionFutura;
     double interes;
     double years;
     System.out.println("---> Introducir la cantidad de euros neta invertida");
     inversion = scan.nextDouble();
     System.out.println("---> Introducir el porcentaje de la tasa del interes aplicada");
     interes = scan.nextDouble();
     System.out.println("---> Introducir el numero tiempo en activo del producto bancario");
     years = scan.nextDouble();
     
     inversionFutura = inversion * (Math.pow((1+interes/12/100),years*12));
     
     
     System.out.printf("El valor acumulado es de : %.2f",inversionFutura);
     



    }    
}
