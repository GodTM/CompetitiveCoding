package CodeForcesSolutions.A;

import java.util.Scanner;

public class WaterMelon {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        double w = Integer.parseInt(input.nextLine().trim());
        if(w<=2){
            System.out.println("NO");
            System.exit(0);
        }
        double division = w%2 ;

        if(division==0){
            System.out.println("YES");
        }
        else{
            double i = 0 , j = 0;
            boolean evenlyDivided = false ;
            for(int counter = 1; counter<division; counter++){
                i = counter;
                j = division - counter ;
                if(i%2 == 0  && j%2 == 0){
                    evenlyDivided = true ;
                }
            }
            if(evenlyDivided){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
