// Error reading included file Templates/Classes/Templates/Licenses/license-LuisTavares.txt
package cv.mikusher.cursojava.aula17;

/**
 *
 * @author mikusher
 */


public class LoopFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i=0; i<5; i++){
            System.out.println("O valor de i: " +i);
        }
        
        for (int i=5; i>0; i--){
            System.out.println("O valor de i: " +i);
        }
        
        //for com mais de uma variavel, pode-se separa as variaveis com uma virgula (,)
        for (int i=0, j=10; i < j; i++, j--){
            System.out.println("O valor de i " +i+ " o valor de j " +j);
        
        }
        
        //for utilizando as partes ausentes, somente a condição é definida dentro. A inicialização e atualização é definida fora.
        int count = 0;
        for( ;count < 10; ){
            System.out.println("Valor do count: " +count);
            count = count + 2;
        }
        
        int soma = 0;
        for (int i=1; i<5; soma += i++){
            System.out.println("O valor da soma " +soma);
        }        
    }
}
