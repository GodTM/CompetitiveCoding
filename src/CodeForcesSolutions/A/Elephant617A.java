package CodeForcesSolutions.A;

import java.util.Scanner;

public class Elephant617A {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in) ;
        int distance = Integer.parseInt(input.nextLine().trim()) ;
        int steps = 0 ;
        int covered = 0 ;
        int rem = distance ;
        for(int counter = 5 ; counter>=1 ; counter--){
            if(rem>=counter){
                steps +=  rem/counter ;
                covered+= steps * counter ;
                rem-= covered ;
                if(covered==distance){
                    break ;
                }
            }
        }

        System.out.println(steps);
    }
}
