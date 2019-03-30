package CodeForcesSolutions.A;

import java.util.Scanner;

public class Dubstep {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String[] inStr = input.nextLine().trim().split("WUB") ;
        for(String s: inStr){
            if(s.equals("")){
                continue;
            }
            else{
                System.out.print(s+" ");
            }
        }
    }
}
