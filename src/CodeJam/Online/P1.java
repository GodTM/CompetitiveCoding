package CodeJam.Online;

import java.util.Scanner;

public class P1 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in) ;
        int testCases  = Integer.parseInt(input.nextLine().trim() );
        boolean validBoundaries =  (testCases>=1 && testCases<=100) ;
        if(validBoundaries){
            while (testCases>0){
                String inStr =  input.nextLine().trim() ;
                int position =  0 ;
                if(inStr.contains("4")){
                    position = inStr.indexOf("4") ;
                }
                int pow = inStr.length() - position  ;
                long currentA = (long) Math.pow(10 , pow);
                long currentB =  Long.parseUnsignedLong( inStr) - currentA ;
                while(String.valueOf(currentA).contains("4") || String.valueOf(currentB).contains("4")){
                    currentA = currentA - 1;
                    currentB = currentB+ 1 ;
                }
                System.out.print(currentA + " " + currentB);
                //long in =  Long.parseUnsignedLong(input.nextLine().trim()) ;


                testCases-- ;
            }
        }

    }
}
