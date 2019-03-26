package CodeForcesSolutions.A;

import java.util.Scanner;


public class Football {
    static int playerCount = 0 ;
    static boolean isTrue= false;
    public static void main(String args[]){
        Scanner input = new Scanner(System.in) ;
        String test = input.nextLine().trim() ;

        if(test.contains("0000000") || test.contains("1111111")){
            System.out.println("YES");

        }
        else{
            System.out.println("NO");
        }
        /*
        int counter = 0 ;
        while(counter< test.length){
            String current = test[counter] ;
            for(int x = counter ; counter<test.length ; counter++){
                if(test[x].equals(current)){
                    playerCount++ ;
                    if(playerCount>=7){ isTrue = true;  break;}
                }
                else{ break ; }
            }

            playerCount= 0 ;
            counter++ ;
        }
        if(isTrue){ System.out.println("YES"); }
        else{ System.out.println("NO"); }
        */
    }
}
