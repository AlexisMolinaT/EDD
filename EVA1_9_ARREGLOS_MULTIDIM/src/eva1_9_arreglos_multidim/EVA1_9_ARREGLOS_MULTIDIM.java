package eva1_9_arreglos_multidim;

/**
 *
 * @author Alexis M.
 */
public class EVA1_9_ARREGLOS_MULTIDIM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matrizDatos = new int[3][5];
        System.out.println("FILAS: " + matrizDatos.length); //IMPRIME 3
        for (int i = 0; i < matrizDatos.length; i++) { //PRIMER DIEMENSION (3 FILAS)
            System.out.println("COLUMNAS: " + matrizDatos[i].length);
            for (int j = 0; j < matrizDatos[i].length; j++) { //SEGUNDA DIMENSION (5 COLUMNAS)
                matrizDatos[i][j] = 100;
            }

        }
        System.out.println("");
        System.out.println("MANERA VISUAL DE VERLO: ");
        for (int i = 0; i < matrizDatos.length; i++) { //PRIMER DIEMENSION (3 FILAS)
        for (int j = 0; j < matrizDatos[i].length; j++) { //SEGUNDA DIMENSION (5 COLUMNAS)
                System.out.print("[" + matrizDatos[i][j] + "]");
                
        }
            System.out.println("");
        }
      
    }

}
