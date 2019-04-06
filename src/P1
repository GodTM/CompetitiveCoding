/*

Code Jam problem 1 

*/

import java.math.BigInteger;
import java.util.Scanner;

 class P1 {
     
    public static void main(String args[]){
        Scanner input = new Scanner(System.in) ;
        int testCases  = Integer.parseInt(input.nextLine().trim() );
        boolean validBoundaries =  (testCases>=1 && testCases<=100) ;
        if(validBoundaries){
            while (testCases>0) {
                String inStr = input.nextLine().trim();
                int position = 0;
                if (inStr.contains("4")) {
                    position = inStr.indexOf("4");

                    int pow = inStr.length() - position - 1;
                    long currentA = (long) Math.pow(10, pow);
                    BigInteger A = new BigInteger(String.valueOf(new BigInteger("10").pow(pow)));
                    BigInteger B = new BigInteger(String.valueOf(new BigInteger(inStr).subtract(A)));
                    //long currentB =  Long.parseUnsignedLong( inStr) - currentA ;
                    while (String.valueOf(A).contains("4") || String.valueOf(B).contains("4")) {
                        //currentA = currentA - 1;
                        //currentB = currentB+ 1 ;
                        A = A.subtract(new BigInteger("1"));
                        B = B.add(new BigInteger("1"));
                    }
                    //System.out.println(currentA + " " + currentB);
                    System.out.println(A + " " + B);
                    //long in =  Long.parseUnsignedLong(input.nextLine().trim()) ;



                }
                testCases--;
            }
        }

    }
}
