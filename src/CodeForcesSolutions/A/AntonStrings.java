package CodeForcesSolutions.A;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AntonStrings {
    public static void  main(String args[]){
        Scanner input  = new Scanner(System.in) ;
        String[] inStr = input.nextLine().trim().split("") ;
        Set<String>set = new HashSet<>() ;
        for(String s: inStr){
            if(s.equals("}") || s.equals("{") || s.equals(",")|| s.equals(" ")){
                continue;
            }
            else{
                set.add(s) ;
            }
        }

        System.out.println(set.size()) ;
    }

}
