/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hoja2;
import java.util.Scanner;
/**
 *
 * @author alejandro
 */
public class ActividadA {
     public static void main(String[] args) {
       float distancia = 0f;
       float kmPorLitros = 0f;
       float precioLitro = 0f;
       float precioTransporte = 0f;
       float tiempo = 86399;
       float velocidad = 0f ; 
       float minutos = 0f;
       float segundos = 0f;
       Scanner scan = new Scanner(System.in);
       
       System.out.print("Cuantos miles de km va a recorrer el transporte de mercancias?");
       distancia = scan.nextFloat();
       System.out.print("Cuantos km recorre por litro de combustible el transporte?:");
       kmPorLitros = scan.nextFloat();
       System.out.print("Indicar el precio en € del litro de combustible aproximado : ");
       precioLitro = scan.nextFloat();
       precioTransporte = (distancia / kmPorLitros) * precioLitro;
       
       velocidad = distancia / (tiempo / 3600);
       tiempo = tiempo /3600;
       minutos = (86399 - (tiempo*3600))/60;
       segundos = 86399 - ((tiempo*3600)+(minutos*60));
       System.out.printf("%.2f %.2f ",precioTransporte,velocidad );
       System.out.println((int)tiempo2);
     
     }
}
