package CodeForcesSolutions.A;

import java.util.Scanner;

public class Word59A {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in) ;
        String[] inputStr = input.nextLine().trim().split("") ;
        int upperCaseCount = 0 , lowerCaseCount = 0 ;
        for(String s: inputStr){
            if(s.equals(s.toUpperCase())){
                upperCaseCount++ ;
            }
            else{
                lowerCaseCount ++ ;
            }
        }
        String out = "" ;
        if(upperCaseCount>lowerCaseCount){
            for(String s: inputStr){
                out = out.concat(s.toUpperCase()) ;
            }

        }else{
            for(String s: inputStr){
                out = out.concat(s.toLowerCase()) ;
            }
        }

        System.out.println(out);
    }
}
