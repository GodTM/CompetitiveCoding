package CodeForcesSolutions;

import java.util.Scanner;

public class WordCapitilization281A {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in) ;
        String[] inStr = input.nextLine().trim().split("") ;
        inStr[0] = inStr[0].toUpperCase() ;
        String out = "" ;
        for(String s: inStr){
            out = out.concat(s) ;
        }
        System.out.println(out);
    }

}
