package CodeForcesSolutions;

import java.util.Scanner;

public class PetyaStrings {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String string1 = input.nextLine().trim().toLowerCase() ;
        String string2 = input.nextLine().trim().toLowerCase() ;
        int comparision = string1.compareTo(string2) ;
        if(comparision<0){
            System.out.println(-1);
        }else if(comparision>0){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }

}
