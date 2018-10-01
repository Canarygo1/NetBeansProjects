/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alejandrocruz
 */
import java.util.Scanner;
public class Actividad6 {
    public static void main(String[] args) {
      /*
        Crear un programa interactivo que convierta grados Fahrenheit a Celsius implementando la fórmula siguiente:
celsius = (5/9) (fahrenheit - 32). El resultado debe mostrar una precisión de dos cifras decimales para los grados
        centígrados.*/
        Scanner scan = new Scanner(System.in);
        float celsius = 0f;
        float fahrenheit = 0f;
        
        System.out.println("Introducir grados en Farenheit");
        fahrenheit = scan.nextFloat();
        celsius = (fahrenheit - 32)*(5/9f);
        System.out.printf("La temperatura %.2f  en grados Fahrenheit es de %.2f en grados centigrados." , fahrenheit, celsius);
    }
}
