/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividad2;

import java.util.Scanner;

/**
 *
 * @author alejandro
 */
public class java {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        float peso;
        float altura;
        float imc;
        float libras;
        System.out.print("Introducir el peso");
        peso = scan.nextFloat();
        System.out.print("Introducir la altura");
        altura= scan.nextFloat();
        imc = peso/(float)Math.pow(altura,2);
        System.out.printf("El IMC es de %.2f eso indica ",imc);
        
        if (imc<18.5)
            System.out.print("poco peso");
            else if (imc>18.5 && imc<25.00 )
                System.out.print("peso normal");
            else if (imc>25.0 && imc<30.00)
                System.out.print("sobrepeso");
            else if (imc>30.00)
                System.out.print("exceso de peso");
        

        System.out.printf("\n %-15s | %15s" ,"kilogramos","Libras\n");
        System.out.printf("----------------------------------\n");
        System.out.printf("\n %-15.0f | %15.0f" , kilogramos , libras);
        
        }
}
