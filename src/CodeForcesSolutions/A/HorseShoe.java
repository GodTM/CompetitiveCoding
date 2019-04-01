package CodeForcesSolutions.A;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HorseShoe {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in) ;
        String[] inputStr = input.nextLine().trim().split("\\s") ;
        BigInteger[] integers = new BigInteger[inputStr.length] ;
        Set<BigInteger> set = new HashSet<>() ;
        for(int counter = 0 ; counter< integers.length ; counter++){
            integers[counter]  = new BigInteger(inputStr[counter]) ;
            set.add(integers[counter]) ;
        }
        Arrays.sort(integers);
        System.out.println(4-set.size());


    }
}
