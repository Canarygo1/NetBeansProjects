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
        float kilometros = 0f ; 
        float minutos = 0f ;
        float segundos = 0f;
        
        System.out.println("Por favor,introduzca los kilometros");
        kilometros =scan.nextFloat()*1.6f; 
        System.out.println("Por favor,introduzca los minutos");
        minutos =scan.nextFloat();
        System.out.println("Por favor,introduzca los segundos");
        
        segundos =0.01f*(scan.nextFloat()+minutos);
        System.out.println(segundos);
        segundos = segundos/60;
        
        System.out.println(kilometros/segundos);
        
       // minutos = (minutos + segundos);
    }
}