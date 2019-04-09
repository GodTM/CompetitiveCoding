package CodeForcesSolutions.A;
import java.util.Scanner;
public class VasyaHipster {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in) ;
        String[] inStr = input.nextLine().trim().split("\\s") ;
        int a = Integer.parseInt(inStr[0]);
        int b = Integer.parseInt(inStr[1]) ;
        int min = Math.min(a , b) ;
        int diff = 0 ;
        int remaining = (min==a) ? (diff = (b - min)/2) : (diff = (a - min)/2) ;
        System.out.print(min+" "+diff);
    }
}
