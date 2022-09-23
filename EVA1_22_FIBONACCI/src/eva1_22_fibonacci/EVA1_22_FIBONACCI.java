package eva1_22_fibonacci;

import java.util.*;

/**
 *
 * @author Alexis M.
 */
public class EVA1_22_FIBONACCI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /**
         * El primer numero de la serie es 1, el segundo número es 1 y cada uno
         * de los siguientes es la suma de los dos anteriores. 1, 1, 2, 3, 5, 8,
         * 13, ....... , N
         *
         */
        /*Scanner sc = new Scanner(System.in);
         int numero, fibo1, fibo2, i;

         do {
         System.out.print("Introduce el número de terminos de la serie (número mayor que 1): ");
         numero = sc.nextInt();
         } while (numero <= 0);

         System.out.println("Los " + numero + " primeros términos de la serie son:");

         fibo1 = 1;
         fibo2 = 1;

         System.out.print(fibo1 + " - ");
         for (i = 2; i <= numero; i++) {
         System.out.print(fibo2 + " - ");
         fibo2 = fibo1 + fibo2;
         fibo1 = fibo2 - fibo1;
         }
         System.out.println();*/
        
        for (int i = 5; i >= 0; i--) {
            System.out.println(calcularFibo(i));
            
        }
       // System.out.println(calcularFibo(5));
    }

    public static int calcularFibo(int pos) {
        //llamada recursiva
        //detener la llamada recursiva
        if (pos <= 1) {
            return 1;
        } else {
            return calcularFibo(pos - 1) + calcularFibo(pos - 2);
        }
    }

}
