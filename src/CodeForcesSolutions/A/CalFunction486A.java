package CodeForcesSolutions.A;
import java.math.BigInteger;
import java.util.Scanner;

public class CalFunction486A {
    public static void main(String args[]) throws NumberFormatException{
        Scanner input  = new Scanner(System.in) ;
        BigInteger i =  new BigInteger(input.nextLine().trim()) ;
        if(i.mod(new BigInteger("2")).equals(new BigInteger("0"))){
            System.out.print( i.divide(new BigInteger("2")));
        }
        else{
            BigInteger j = (i.subtract(new BigInteger("1"))).divide(new BigInteger("2")) ;
            System.out.print(j.subtract(i) );
        }
    }
}
