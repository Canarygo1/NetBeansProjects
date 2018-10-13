/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miapp00;

/**
 *
 * @author alejandro
 */
public class Miapp00 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int resultado = 0;
        resultado = suma(5,5);
        System.out.println("El resultado de la suma fue :" +resultado);
        sumaSinRetorno(20,30);



    }
    
    public static int suma(int numero1,int numero2){
        int resultado = 0;
        resultado = numero1+numero2;
        return resultado;
    }
    
    public static void sumaSinRetorno(int numero1,int numero2){
        int resultado = numero1+numero2;
        System.out.println("El resultado de la suma fue :"+resultado);
        
        
    }
}
