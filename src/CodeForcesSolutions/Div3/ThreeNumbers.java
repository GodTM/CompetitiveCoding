package CodeForcesSolutions.Div3.Apr16;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Scanner;

public class ThreeNumbers {
    public static void main(String args[]){
        Scanner input =  new Scanner(System.in) ;
        String[] inStr = input.nextLine().trim().split("\\s") ;
        BigInteger[] numbers = new BigInteger[inStr.length] ;
        for(int counter = 0 ; counter< numbers.length ; counter++){ numbers[counter] = new BigInteger(inStr[counter]) ; }
        BigInteger theSum = new BigInteger("0") ;
        for(BigInteger i : numbers){ if(i.compareTo(theSum)>0){ theSum = i ; } }
        LinkedList<BigInteger> actual = new LinkedList<>()  ;
        for(BigInteger i : numbers){ if(i.compareTo(theSum)==0){continue;} actual.add(theSum.subtract(i)) ; }
        for(BigInteger i: actual){
            System.out.print(i+" ");
        }
    }
}
