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
       float horas ;
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
      
       horas = (int)tiempo/3600;
       tiempo = tiempo-(horas*3600);
       minutos = (int)tiempo/60;
       
       tiempo = tiempo -(segundos*60);
       segundos = (int)tiempo;
       segundos = segundos/60;
       
       System.out.printf("El coste total del transporte es de : %.2f \n",precioTransporte);
       System.out.printf("La velocidad necesaria sera de %.2f km/h para cumplir con el tiempo en h:m:s de ", velocidad);
       System.out.print((int)horas+":"+(int)minutos+":"+(int)segundos);
     
     }
}
