/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alejandro
 */
import java.util.Scanner;
public class Actividad2 {
        public static void main(String[] args) {
                
                Scanner scan = new Scanner(System.in);
                
                double radio= 0;
                double altura=0;
                double areaTotal=0;
                double volumenTotal=0;

                System.out.println("Por favor,introduzca el radio en cm");
                radio =scan.nextDouble();
                 System.out.println("Por favor,introduzca la altura en cm");
                altura =scan.nextDouble();
                //formula del area total Cilindro.
                areaTotal = (2*Math.PI*radio*altura)+2*(Math.PI*Math.pow(radio,2));
                //formula del volumen total del Cilindro
                volumenTotal = (Math.PI*Math.pow(radio,2)*altura);
                System.out.println("la superfice del vaso con tapa = " + areaTotal);
                System.out.println("el volumen total del vaso es de = " + volumenTotal);
                System.out.println("la superficie del vaso sin tapa es = " + (areaTotal -(Math.PI*Math.pow(radio,2))));
                System.out.println("la superficie de la pegatina = " + (areaTotal -2*(Math.PI*Math.pow(radio,2))));
                 
        }
}
