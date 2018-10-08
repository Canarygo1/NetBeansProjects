/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hoja2;
import java.util.Scanner;

/**
 *
 * @author alejandrocruz
 */
public class ActividadF {
     public static void main(String[] args) {
           Scanner scan = new Scanner(System.in);

          int minutos = scan.nextInt();
          int horas;
          int dias;
          int year;
          int diasRestantes;
            horas= minutos/60 ;
            dias = horas /24;
            year = dias/365;
            diasRestantes = dias-(365*year);
          System.out.print(year + " "+diasRestantes);
    }
}