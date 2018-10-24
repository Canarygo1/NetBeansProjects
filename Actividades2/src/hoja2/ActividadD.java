/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja2;

import java.util.Scanner;

/**
 *
 * @author alejandrocruz
 */
public class ActividadD {
   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float seno =0;
        float suma = 0;
        float radianes=0;
        float coseno =0;
        float tang=0;
        for (float i = 0.01f; i <= 1.0f; i = i +0.01f) {
            suma +=i;
           
        }
        
        suma =Math.round(suma*100f)/100f;
        System.out.println("La suma es "+ suma);
        radianes = (float) Math.toRadians(suma);
        seno = (float)Math.sin(radianes);
        coseno = (float)Math.cos(radianes);
        tang=(float)Math.tan(radianes);
        System.out.printf("%-8s%8s%8s%10s%10s\n","Grados","Radianes","Seno","Coseno","Tangente");
        System.out.printf("%.2f%-3s%.2f%8s%.2f%-4s%.2f%4s%.2f",suma,"",radianes,"",seno,"",
                coseno,"",tang);
    }
    
}
