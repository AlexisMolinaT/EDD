package eva1_18_recursividad;

/**
 *
 * @author Alexis M.
 */
public class EVA1_18_RECURSIVIDAD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        falsoForDes(5);
        falsoForAsc(5, 1);
    }

    /*FALSO FOR
     IPRIMIR UNA LISTA DE NÚMEROS DE MAYOR A MENOR (DE MANERA RECURSIVA)
     recibe un valor falsoForDes(5) --> "5 - 4 - 3 - 2 - 1"
     */
    public static void falsoForDes(int valor) {

         //Que voy a hacer "imprmir valor"
        //llamada recursiva "falsoForDes (valor - 1)"
        //detener la llamada recursiva "cuando valor es = 1"
        //si es 1 me detengo, si no, llamada recrsiva
        /*if(valor > 0){
         System.out.println(valor + " - ");
         valor--;
         falsoForDes(valor);
            
         }*/
        /*if (valor == 1) {
         System.out.print(valor + " - ");
         } else {
         System.out.print(valor + " - ");
         falsoForDes(valor - 1);
         }*/
        System.out.print(valor + " - ");
        if (valor > 1) {
            falsoForDes(valor - 1);
        }

    }
    
    public static void falsoForAsc(int valor, int ini) {
        //falsoFodAsc(5,1) --> 1 - 2 - 3 - 4 - 5
        if (ini <= valor) {
            System.out.print(ini + " - ");
            falsoForAsc(valor, ini + 1);
        }
        
    }

}
