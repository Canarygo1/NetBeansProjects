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
public class ActividadesTema2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int y ;
       int year;
      year=scan.nextInt();
      y=year;
      int a =y%19;
      int b = y/100;
      int c = y%100;
      int d = b/4;
      int e = b%4;
      int g = (8*b+13)/25;
      int h = (19*a+b-d-g+15)%30;
      int j = c/4;
      int k= c % 4 ;
      int m = (a+11*h)/319;
      int r = (2*e+2*j-k-h+m+32)%7;
      int n = (h - m+r+90)/25;
      int p = (h-m+r+n+19)%32;
      
      
      System.out.print(y +" es el agno del ");
        
       
    year =(year%12);
      switch (year) {
          case 0: System.out.print("Mono");break;
          case 1: System.out.print("Gallo");break;
          case 2: System.out.print("Perro");break;
          case 3: System.out.print("Jabali");break;
          case 4: System.out.print("Rata");break;
          case 5: System.out.print("Buey");break;
          case 6: System.out.print("Tigre");break;
          case 7: System.out.print("Liebre");break;
          case 8: System.out.print("Dragon");break;
          case 9: System.out.print("Serpiente");break;
          case 10: System.out.print("Caballo");break;
          case 11: System.out.print("Cabra");break;
     
          
          
      }
            System.out.print("El domingo de pascua es "+p+"/"+n+"/"+y);
            
            
            
    }
    
}
