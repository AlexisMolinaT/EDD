/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_4_arreglos;

/**
 *
 * @author Alexos M.
 */
public class EVA1_4_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    //TDA tipo abstracto de dato (objetos y clase)
    //arreglos en java --> objetis --> tda
    //Estilo de programacion
    //CamelCase
    //funciones e identificadores --> empiezan en minúsculas
    //funciones --> indican una accion --> verbos
    //Clases -->
    public static void main(String[] args) {
        // TODO code application logic here
        //TIPO DE DATO [] IDENTIFICADOR = new TIPO DE DATO [TAMAÑO]
        //ARREGLO DE ENTEROS PARA CAPTURAR EDADES:
        //TODOS LOS IDENTIFICADORES DECLARADOS SON ARREGLOS DE ENTEROS
        int[] arregloEdades, arregloSalario, arregloCali;
        //SOLO ARREGLOPROMEDIO ES ARREGLO
        double arregloPromedio[], porcentaje;
        //LOS ARREGLOS SON OBJETOS
        arregloEdades = new int[50];
        
        System.out.println(arregloEdades);
        for (int i = 0; i < arregloEdades.length; i++) {
            arregloEdades[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < arregloEdades.length; i++) {
            System.out.println("[" + i + "] = " + arregloEdades[i]);
        }
    }

}
