/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner ;
/**
 *
 * @author alejandro
 */
public class actividad1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            float a = 0 ; 
            float b = 0 ;
            float c = 0 ;
            System.out.println("Introducir valores de a y b separados por un espacio");
            a = scan.nextFloat();
            b = scan.nextFloat();
            c = b;
            b = a;
            a = c;
            //b=a+(a=b)-b; esta es la otra opcion pero sufre desborde.
           //La salida no es exacta en B debido a que es necesario un redondeo.
            
            System.out.println("El valor de a ahora es"+a);
            System.out.println("El valor de b ahora es "+b);
           
            }
}
