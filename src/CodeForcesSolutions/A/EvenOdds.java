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
        LinkedList<BigInteger> list = new LinkedList<>() ;
        // add all numbers
        for(BigInteger c = BigInteger.ONE ; c.compareTo(limit)<=0 ; c = c.add(BigInteger.ONE)){
            if(! c.mod(new BigInteger("2")).equals(BigInteger.ZERO)){
                list.add(c);
            }
        }

        for(BigInteger c = BigInteger.ONE ; c.compareTo(limit)<=0 ; c = c.add(BigInteger.ONE)){
            if( c.mod(new BigInteger("2")).equals(BigInteger.ZERO)){
                list.add(c);
            }
        }
        BigInteger answer =null ;
        BigInteger counter = new BigInteger("0") ;
        Iterator<BigInteger> i = list.listIterator() ;
        while(i.hasNext()){
            BigInteger integer = i.next() ;

            if(counter.equals(position.subtract(BigInteger.ONE))){
                answer = integer ;
            }

            counter = counter.add(BigInteger.ONE) ;

        }
        System.out.println(answer);


    }
}
