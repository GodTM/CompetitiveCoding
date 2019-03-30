package CodeForcesSolutions.A;

import java.util.Scanner;

public class Translation41A {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in)  ;
        String[] normal = input.nextLine().trim().split("") ;
        String[] reversed = input.nextLine().trim().split("") ;
        if(normal.length!= reversed.length){
            System.out.println("NO");
        }
        else {
            boolean right = true;
            for (int counter = 0; counter < normal.length ; counter++){

                if(!(normal[counter].equals(reversed[reversed.length-counter-1]))){
                    right = false ;
                }
            }

            if(right){
                System.out.println("YES");
            }
            else
                {
                    System.out.println("NO");
                }
        }
    }
}
