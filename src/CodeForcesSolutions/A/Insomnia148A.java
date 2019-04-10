package CodeForcesSolutions.A;
import java.util.Scanner;
public class Insomnia148A {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in) ;
        int i = Integer.parseInt(input.nextLine().trim() ) ;
        int j = Integer.parseInt(input.nextLine().trim() ) ;
        int k = Integer.parseInt(input.nextLine().trim() ) ;
        int m = Integer.parseInt(input.nextLine().trim() ) ;
        int numberOfDragons = Integer.parseInt(input.nextLine().trim() ) ;
        int count = 0 ;
        for(int c = 1 ; c<= numberOfDragons ; c++){
            if(c%i==0 || c%j==0 || c%k == 0 || c%m == 0){
                count+= 1 ;
            }
        }
        System.out.println(count);
    }
}
