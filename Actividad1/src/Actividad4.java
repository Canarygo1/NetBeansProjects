/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;/**
 *
 * @author alejandro
 */
public class Actividad4 { 
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
        //1 milla --> 1.6Km
        //M/H
<<<<<<< HEAD
        float kilometros = 0f ; 
        float minutos = 0f ;
        float segundos = 0f;
        float horas  = 0f;
=======
        float distancia ; 
        float resultado;
        float tiempo;
>>>>>>> 5332d7ec4e689acf352638887ba9128cb62fba4f
        System.out.println("Por favor,introduzca los kilometros");
        distancia =scan.nextFloat()/1.6f;
        System.out.println("Por favor,introduzca los minutos");
        tiempo =scan.nextFloat();
        System.out.println("Por favor,introduzca los segundos");
<<<<<<< HEAD
        minutos =
       // minutos = (minutos + segundos);
=======
        tiempo = (scan.nextFloat() / 60 + tiempo) /60;
        resultado = distancia/tiempo;
         
         System.out.printf("%.2f ", resultado);
        
       
>>>>>>> 5332d7ec4e689acf352638887ba9128cb62fba4f
    }
}