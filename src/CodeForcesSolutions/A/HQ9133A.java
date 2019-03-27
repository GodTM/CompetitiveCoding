package CodeForcesSolutions.A;

import java.util.Scanner;

public class HQ9133A {
    public static void main(String args[]){

        Scanner in = new Scanner(System.in) ;
        String  input = in.nextLine().trim() ;
        if(input.contains("H")||input.contains("Q")|| input.contains("9")){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
