package CodeForcesSolutions.A;
import java.math.BigInteger;

public class Solution {

    public static BigInteger fibonacci(BigInteger number){
        BigInteger f[] = new BigInteger[number.intValue() + 2] ;
        f[0] = new BigInteger("0") ;
        f[1] = new BigInteger("1") ;

        BigInteger counter = null ;
        for(counter = new BigInteger("2") ; counter.compareTo(number)<= 0 ; counter = counter.add(new BigInteger("1"))){
            f[counter.intValue()] = f[counter.intValue() - 1].add(f[counter.intValue() - 2 ]) ;
        }
        return f[counter.intValue()] ;
    }
    public static void main(String args[]){
        BigInteger start = new BigInteger("1") ;
        boolean found = false ;
        BigInteger answer = null ;
        while(!found){
            answer = Solution.fibonacci(start) ;
            String answerString = answer.toString() ;
            if(answerString.length()>=1000){ found = true ; }
            answer = answer.add(new BigInteger("1")) ;
        }

        System.out.println(answer);


    }

}

