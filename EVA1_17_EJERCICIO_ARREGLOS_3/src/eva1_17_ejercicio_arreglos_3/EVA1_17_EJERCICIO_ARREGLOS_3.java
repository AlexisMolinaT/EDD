package eva1_17_ejercicio_arreglos_3;

/**
 *
 * @author Alexs M.
 */
public class EVA1_17_EJERCICIO_ARREGLOS_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*generar una MATRIZ 5X5 enteros,
         llenarla con numero aleatorios entre 1 y 100 e imprimir
        
         crear una copia de la matriz, pero en orden inverso
         */
        //int[][] Matriz = new int[5][5];
        int matriz[][] = new int [5][5];
        int matrizCopia[][] = new int [][];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = ((int)(Math.random() * 100)) + 1;
                
            }
            
        }       
        imprimirMatriz(matriz);
        imprimirMatriz(matrizCopia);
        
        for (int i = 0; i < matrizCopia.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matrizCopia[i][j] = [[matriz[matriz.length - 1] - i [matriz[matriz.length - 1] - j]];
            }
        }
    
    
    }
    public static void imprimirMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) { //filas
            for (int j = 0; j < matriz.length; j++) { //columnas
                System.out.print("[" + matriz[i][j] + "]");
                
            }
            System.out.println("");
            
        }
    }

}
