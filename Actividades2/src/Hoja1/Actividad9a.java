/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hoja1;
import java.util.Scanner;
/**
 *
 * @author alejandrocruz
 */
public class Actividad9a {
         public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
             double numerolot ;
             int numerosindec;
             int numeroApuesta;
             int apuesta1;
             int apuesta2;
             int numero1;
             int numero2;
             int premiado = 0;
             
             numerolot= Math.random()*100;
             
             System.out.println("Introducir tu apuesta solo dos numeros");
             numeroApuesta = scan.nextInt();
             
             numerosindec = (int)numerolot;
             numero2 = numerosindec%10;  
             numero1 =  numerosindec/10;

             apuesta2 = numeroApuesta%10;  
             apuesta1 =  numeroApuesta/10;             
          
             
             System.out.print("-->El numero premiado es el "+(int)numerolot);
            
           if (numero1==apuesta1&&numero2==apuesta2)
               System.out.print("***Has acertado un digito: ganas 10000€***");
              
              else if (numero2==apuesta1&&numero1==apuesta2)
                    System.out.print("***Has acertado un digito: ganas 3000€***");
              else if ((numero1==apuesta1||numero2==apuesta2)||(numero2==apuesta1||numero1==apuesta2))
                    System.out.print("***Has acertado un digito: ganas 1000€***");
              else if (numero1!=apuesta1&&numero2!=apuesta2)
                    System.out.print("Lo sentimos,prueba la proxima vez");
               }
}
