
package Division;
import java.util.Scanner;
/**
 *
 * @author JOR
 */
public class ClaseDivision {
    public static void main (String[]args){
        try{
            
             int valor1, valor2, resultado;
         Scanner entrada = new Scanner(System.in);
        System.out.println("dame el primer numero");
        valor1= entrada.nextInt();

        System.out.println("dame el segundo  numero");
        valor2= entrada.nextInt();
        resultado= valor1 / valor2;
        System.out.println("El resultado de la division es  "+ resultado);
            
        }catch( Exception e){
                System.out.println("ERROR" + e);
        }
        
    }
}
            
        
    
    
    

