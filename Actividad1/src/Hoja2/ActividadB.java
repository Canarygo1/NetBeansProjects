/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hoja2;
/**
 *
 * @author alejandrocruz
 */
public class ActividadB {
    public static void main(String[] args) {
    double  a = 3.4d;
    double b = 50.2d;
    double c = 2.1d;
    double d = 0.55d;
    double e = 44.5d;
    double f = 5.9d;
     
    double x ;
    double y ;
    x = ((e*d)-(b*f))/((a*d)-(b*c));
    y = ((a*f)-(e*c))/((a*d)-(b*c));
    System.out.printf("%.8f  %.8f", x,y);
    
    
    
    }
}