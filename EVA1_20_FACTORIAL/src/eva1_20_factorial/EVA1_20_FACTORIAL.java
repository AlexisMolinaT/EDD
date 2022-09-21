package eva1_20_factorial;

/**
 *
 * @author Alexis M.
 */
public class EVA1_20_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("El factorial de: " + factorial(5));
    }

    //5 * 4 * 3 * 2 * 1

    public static int factorial(int valor) {
        //factorial(0) --> 1
        if (valor == 0)
            return 1;
        else 
            return valor * factorial(valor - 1);
        
    }

}
