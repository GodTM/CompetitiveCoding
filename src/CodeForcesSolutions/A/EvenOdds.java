package CodeForcesSolutions.A;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
public class EvenOdds {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in) ;
        String[] inputs = in.nextLine().trim().split("\\s") ;
        BigInteger limit = new BigInteger(inputs[0]) ;
        BigInteger position = new BigInteger(inputs[1]) ;
        BigInteger answer = null ;
        if( position.compareTo( limit.add(new BigInteger("1")).divide(new BigInteger("2")))<=0){
            System.out.println((position.multiply(new BigInteger("2")).subtract(new BigInteger("1"))));
        }
        else{
            System.out.println( position.subtract( (limit.add(new BigInteger("1"))).divide(new BigInteger("2"))).multiply(new BigInteger("2"))) ;
        }

    }
}
