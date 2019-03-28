package HackerEarth.March19;

import java.math.BigInteger;
import java.util.Scanner;

public class Problem1 {


    // don't use this as JVM has a set call stack size.. There is too much recursion
    /*
    public static BigInteger factorial(BigInteger n){
        if(n.equals(new BigInteger("1")) || n.equals(new BigInteger("0"))){
            return new BigInteger("1") ;
        }
        BigInteger one = new BigInteger("1") ;
        return n.multiply(factorial(new BigInteger(String.valueOf(n.subtract(one))))) ;
    }*/

    public static BigInteger factorial(BigInteger n) {
        BigInteger result = BigInteger.ONE;
        while (!n.equals(BigInteger.ZERO)) {
            result = result.multiply(n);
            n = n.subtract(BigInteger.ONE);
        }

        return result;
    }
    public static BigInteger summation(BigInteger n){
        BigInteger sum = new BigInteger("0") ;
        for(BigInteger counter = BigInteger.valueOf(1L) ; counter.compareTo(n)<=0 ; counter = counter.add(BigInteger.ONE))
        { sum = sum.add(counter) ; }
        return sum ;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        try {
            int testCases = Integer.parseInt(input.nextLine().trim());
            if (testCases > 0 && testCases <= 100) {
                while (testCases > 0) {
                    BigInteger n = new BigInteger(input.nextLine().trim());

                    if (n.compareTo(new BigInteger("0"))>0  && n.compareTo(new BigInteger("1000000000"))<=0) {
                        BigInteger P = Problem1.factorial(n);
                        BigInteger s = Problem1.summation(n);
                        if (P.mod(s).equals( BigInteger.ZERO)) {
                            System.out.println("YES");
                        } else {
                            System.out.println("NO");
                        }
                    }

                    testCases--;
                }
            }

        }catch (NumberFormatException e){
            //System.out.println("Exception");
            return ;
        }
    }
}
