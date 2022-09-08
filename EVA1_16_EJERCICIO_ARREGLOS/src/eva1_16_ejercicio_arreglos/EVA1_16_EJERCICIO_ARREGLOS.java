package eva1_16_ejercicio_arreglos;

/**
 *
 * @author Alexis M.
 */
public class EVA1_16_EJERCICIO_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*CREAR UN ARREGLO DE 50 ELEMENTOS, LLENARLOS CONVALORES ALEATORIOS ENTRE 1 Y 100, E IMPIRMIR EN UNA LISTA
         CON LOS VALORES PARES QUE CONTENGA. GUARDAR LOS PARES EN UN ARREGLO NUEVO (TAMAÑO EXACTO)*/
        int[] arregloAlea = new int[50];
        //int[] arregloPares = new int[];

        for (int i = 0; i < arregloAlea.length; i++) {
            arregloAlea[i] = ((int) (Math.random() * 100) + 1);
            //System.out.print("[" + arregloPares[i] + "]");
        }
        System.out.println("<---------------ARREGLO DE 50 NUMEROS ALEATORIOS DE 1 A 100--------------->");
        imprimir(arregloAlea);
        
        /*for (int i = 0; i < arregloPares.length; i++) {
         arregloPares[i] = ;
         //System.out.print("[" + arregloPares[i] + "]");
         }*/
    }

    public static void imprimir(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");

        }
    }

    static boolean esPar(int numero) {
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    

}
