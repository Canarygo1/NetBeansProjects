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
public class Actividad8 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        boolean condicion = false;
        double numAleatorio = Math.random()*10;
        double numAleatorio2 = Math.random()*10;
         int resultado = 0;   
        int resultadoCorrecto = 0;
        
        System.out.print( (int)numAleatorio + "+" + (int)numAleatorio2);

        resultado = scan.nextInt();
        resultadoCorrecto = (int)numAleatorio + (int)numAleatorio2;
        condicion = (resultado ==resultadoCorrecto);
        System.out.print( (int)numAleatorio + " + " + (int)numAleatorio2 +" = "+
        resultado + " es "+condicion);

       
         
        
    
    }

   
}

