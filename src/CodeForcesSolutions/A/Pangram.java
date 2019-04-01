package CodeForcesSolutions.A;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangram {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in) ;
        int stringLength = Integer.parseInt(input.nextLine().trim()) ;
        String[] inStr = input.nextLine().trim().toLowerCase().split("") ;
        Set<String> set = new HashSet<>() ;
        for(String s: inStr){
            set.add(s) ;
        }
        if(set.size()==26){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
