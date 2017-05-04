
package cv.mikusher.outros;

/**
 *
 * @author Miky Mikusher
 */


public class Calculos {

    /**
     * @param args the command line arguments
     */
     
    public static void main(String[] args) {
        // TODO code application logic here
        Soma(3, 5);
        multiplica(3, 2);
        multiplica(-3, 2);
    }
    
    public static void Soma (int a, int b){
        int c = a + b;
        System.out.println(c);
    }
    
    public static int multiplica(int d1, int d2){
        int cc = 0;
        if (d1 > 0) {
            cc = d1 * d2;
            System.out.println("Primeiro if: "+cc);
        } else {
            cc = d2 * 2;
            System.out.println("Segundo if: "+cc);
        }
        return cc;
    }
    
}
