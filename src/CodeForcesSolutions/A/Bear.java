//package CodeForcesSolutions.A;

import java.util.Scanner;

public class Bear {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String[] inStr = input.nextLine().trim().split("\\s") ;
        int limakW = Integer.parseInt(inStr[0]) ;
        int bobW   = Integer.parseInt(inStr[1]) ;

        boolean greater = false ;
        int years = 0 ;

        while(!greater){
            if(limakW>bobW){
                greater = true ;
                break ;
            }

            limakW*=3  ;
            bobW*= 2  ;
            years += 1;
        }

        System.out.print(years);
    }
}
