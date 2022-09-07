package eva1_15_copia_arreglos;

/**
 *
 * @author Alexis M.
 */
public class EVA1_15_COPIA_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arregloDatos = new int[100];
        llenar(arregloDatos);
        imprimir(arregloDatos);
        //Copiar los valores almacenados en el arreglo
        int[] arregloCopia = new int[arregloDatos.length];
        System.out.println("");
        System.out.println("<----------------------------DIRECCIONES-------------------------->");
        System.out.println(arregloDatos);
        System.out.println(arregloCopia);
        System.out.println("<----------------------------ARREGLO COPIA------------------------>");
        //¿Como transferir los valores al arreglo copia?
        for (int i = 0; i < arregloDatos.length; i++) {
            arregloCopia[i] = arregloDatos[i];

        }
        //imprimir
        imprimir(arregloCopia);

    }

    public static void llenar(int[] arreglo) {// metodos y argumentos
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 100);
        }
    }
   
    public static void imprimir(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {

            System.out.print("[" + arreglo[i] + "]");
        }
    }

}
