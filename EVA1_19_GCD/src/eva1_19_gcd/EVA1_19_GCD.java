package eva1_19_gcd;

/**
 *
 * @author Alexis M.
 */
public class EVA1_19_GCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*MAXIMO COMÚN DIVISOR
        dividendo y divisor
        dividendo/divisor --> residuo
        
        si residuo = 0
        divisor es el MCD
        si no
        divisor/residuo
        */
        System.out.println(gcd(180,48)); //invertido tambien funciona, sino tienen MCD devuelve "1"
        
        
    }
    
    public static int gcd(int dividendo, int divisor){
        int res;
        res = dividendo % divisor;
        //debo terminar si el algoritmo continua o se detiene 
        if(res == 0){//me detengo, encontre el MCD
            return divisor;
            
        }else{
            return gcd(divisor, res);
        }
        
    
}
    
    
    
}
