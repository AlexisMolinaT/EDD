/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_11_ejemplo_arreglos;

import java.util.Scanner;

/**
 *
 * @author Alexis M.
 */
public class EVA1_11_EJEMPLO_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Pedir número de grupos
        //Pedir número de alumnos por grupo
        //Capturar calificaciones
        //Imprimir calificaciones
        
        int arregloCali[][];
        //primer dimension --> grupos
        //segunda dimension --> estudiantes por grupo
        //Determinar los grupos
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca el número de grupos: ");
        int iGpos = input.nextInt();
        arregloCali = new int[iGpos][]; 
       
        
        
        //para cada grupo: ¿cuantos estudiantes necesitas?
        for (int i = 0; i < arregloCali.length; i++) {
            System.out.println("¿Cuantos  estudiantes hay en el grupo " + (i + 1));
           int iEstu = input.nextInt();
            arregloCali[i] = new int[iEstu]; 
            System.out.println(arregloCali[i].length);
        }
        
        
        
        
        
        
    }
}

