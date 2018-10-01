import java.util.Scanner;/**
 *
 * @author alejandro
 */
public class Actividad4 { 
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
        //1 milla --> 1.6Km
        //M/H
        float distancia ; 
        float resultado;
        float tiempo;
        System.out.println("Por favor,introduzca los kilometros");
        distancia =scan.nextFloat()/1.6f;
        System.out.println("Por favor,introduzca los minutos");
        tiempo =scan.nextFloat();
        System.out.println("Por favor,introduzca los segundos");
        tiempo = (scan.nextFloat() / 60 + tiempo) /60;
        resultado = distancia/tiempo;
         
         System.out.printf("%.2f ", resultado);
        
       
    }
}
       

    }
}