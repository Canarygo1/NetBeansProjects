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
            
            long distancia;
            long tiempo ;
            long aceleracion;
            long velocidadInicial;
            long velocidadFinal;
            long velocidadTotal;
            System.out.println("Introducir los datos de velocidad inicial v0, final v1 en metros por"
                    + "segundo, y el tiempo t en segundos : ");
            velocidadInicial = scan.nextLong();
            velocidadFinal = scan.nextLong();
            velocidadTotal = (velocidadFinal - velocidadInicial);
            System.out.println(velocidadTotal);
            tiempo = scan.nextLong();
            aceleracion = (long)(velocidadTotal / tiempo);
            System.out.println(aceleracion);
            //System.out.println (Math.pow(velocidadTotal,2) /(2*aceleracion));
        }
}   
