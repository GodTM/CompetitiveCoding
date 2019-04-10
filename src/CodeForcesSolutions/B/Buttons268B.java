/* doubt */

package CodeForcesSolutions.B;
import java.util.Scanner;
public class Buttons268B {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in) ;
        int numberOfButtons = Integer.parseInt(input.nextLine().trim()) ;
        int sum = numberOfButtons  ;
        for(int i = 1 ; i< numberOfButtons ; i++){
            sum+= (numberOfButtons- i)  * i ;
        }
        System.out.println(sum);

    }
}
