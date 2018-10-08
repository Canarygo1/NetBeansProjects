
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alejandro
 */
public class Actividad3 {
            public static void main(String[] args) {
                
                Scanner scan = new Scanner(System.in);
                
                double radio= 0;
                double altura=0;
                double areaTotal=0;
                double volumenTotal=0;
                double vasoSinTapa;
                double pegatina;
                //REVISAR TIEMPOS DE COMPILACION.
                //Pi se va a usar con Math.PI.
                //http://www.profesorenlinea.cl/geometria/VolumenCilindro.html formulas
                System.out.println("Por favor,introduzca el radio en cm");
                radio =scan.nextDouble();
                 System.out.println("Por favor,introduzca la altura en cm");
                altura =scan.nextDouble();
                //formula del area total Cilindro.
                areaTotal = (2*Math.PI*radio*altura)+2*(Math.PI*Math.pow(radio,2));
                //formula del volumen total del Cilindro
                volumenTotal = (Math.PI*Math.pow(radio,2)*altura);
                vasoSinTapa=(areaTotal -(Math.PI*Math.pow(radio,2)));
                pegatina= (areaTotal -2*(Math.PI*Math.pow(radio,2)));
                
                System.out.printf("la superfice del vaso con tapa = %.2f \n", areaTotal);
                System.out.printf("el volumen total del vaso es de = %.2f \n" , volumenTotal);
                System.out.printf("la superficie del vaso sin tapa es = %.2f \n", vasoSinTapa );
                System.out.printf("la superficie de la pegatina = %.2f" ,pegatina );
                 
        }
}
