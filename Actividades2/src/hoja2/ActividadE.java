/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja2;

import java.util.Scanner;

/**
 *
 * @author alejandrocruz
 */
public class ActividadE {
   public static void main(String[] args) {
             Scanner scan = new Scanner(System.in);
             
             int contador = 0;
             int nota=0;
             int nEstudiante=0;
             int nEstudiantesTotal=0;
             int notaMayor=0;
             String nombre ="";
             String notaAlta="";
             boolean entrar;
             
             System.out.print("Introducir el numero de estudiantes: ");
             nEstudiantesTotal = scan.nextInt();
             

             for (int i = 0;i<nEstudiantesTotal;i++){
                 System.out.print("Estudiante numero: ");
                 nEstudiante = scan.nextInt();
                 String  salto  = scan.nextLine();
                 System.out.print("\t Nombre: ");
                 nombre = scan.nextLine();
                 System.out.print("\t Puntuacion: ");
                 nota = scan.nextInt();
                 
                 
                if (nota>notaMayor){
                    
                    notaMayor = nota;
                    notaAlta = nombre;
                
                }
                 
             }
             
             System.out.print("El alumno con la nota mas alta es"+notaAlta);
    }
}
