package CodeForcesSolutions.A;

import java.util.Scanner;


public class Football {
    static int playerCount = 0 ;
    static boolean isTrue= false;
    public static void main(String args[]){
        Scanner input = new Scanner(System.in) ;
        String test = input.nextLine().trim() ;
        if(test.contains("0000000") || test.contains("1111111")){ System.out.println("YES"); }
        else{ System.out.println("NO"); }
    }
}
