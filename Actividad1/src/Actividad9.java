/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author alejandrocruz
 */
public class Actividad9 {
        public static void main(String[] args) {
            Scanner scan = new Scanner (System.in);
            
            double distancia;
            double tiempo ;
            double aceleracion;
            double velocidadInicial;
            double velocidadFinal;
            double velocidadTotal;
            double velocidadDespegue;
            System.out.println("Introducir los datos de velocidad inicial v0, final v1 en metros por"
                    + "segundo, y el tiempo t en segundos : ");
            velocidadInicial = scan.nextDouble();
            velocidadFinal = scan.nextDouble();
            tiempo = scan.nextDouble();
            
            velocidadTotal = (velocidadFinal - velocidadInicial);
            

            aceleracion = (velocidadTotal / tiempo);
            System.out.println("La aceleracion es de :" + aceleracion  + "m/s^2");

            System.out.println("Introduzca la velocidad de despeje : ");
            

            velocidadDespegue = scan.nextDouble();
            distancia = Math.pow(velocidadDespegue,2) /(2*aceleracion);
            
            System.out.printf ("La distancia minima que necesita para el despegue es de : %.2f  metros",distancia);
        }
}   
