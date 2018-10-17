/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadestema2;
import java.util.Scanner;
/**
 *
 * @author alejandro
 */
public class Actividad4 {
    public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                
                int nLineas = 0;
                
                do {
                    System.out.println("Introducir el numero de lineas : ");
                    nLineas = scan.nextInt();
                }
                while (nLineas > 10);
                int nColumnas = nLineas;
                for (int y=0;y<=nColumnas;y++){
                    System.out.println(" ");
                    
                        for (int i=nLineas;i!=0;i--){
                           System.out.print(" ");
                            if (y>=i)
                            System.out.print(" "+i+" ");
                            else {
                                System.out.print(" ");
               
                            }
                        }
                }
                System.out.println("");
    }
    
}
