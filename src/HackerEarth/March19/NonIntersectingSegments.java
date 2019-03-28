package HackerEarth.March19;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Scanner;

public class NonIntersectingSegments {

    public class CoordPair {
        BigInteger x1 , x2 , y1 , y2;
        public CoordPair(BigInteger a , BigInteger b , BigInteger y1 , BigInteger y2){
            this.x1 = a ;
            this.x2 = b ;
            this.y1 = y1 ;
            this.y2 = y2 ;
        }


    }

    public static BigInteger slope(BigInteger x1 , BigInteger y1 , BigInteger x2 , BigInteger y2){
        BigInteger differenceX = x2.subtract(x1) ;
        BigInteger differenceY = y2.subtract(y1) ;
        // if diffX is 0 , then denominator is 0.. the slope is undefined
        if(differenceX.equals(BigInteger.ZERO))
            return null ;
        return   differenceY.divide(differenceX) ;
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in) ;
        HashMap<BigInteger,CoordPair> map = new HashMap<>() ;

        // initialising to
        NonIntersectingSegments o1 = new NonIntersectingSegments();

        long numberOfIterations = Long.parseUnsignedLong(input.nextLine().trim()) ;

        if(numberOfIterations>=1 && numberOfIterations<=100000){
            while(numberOfIterations>0){
                String[] coordinates = input.nextLine().trim().split("\\s") ;
                BigInteger x1 = new BigInteger(coordinates[0]) ;

                NonIntersectingSegments.CoordPair c =
                        o1.new CoordPair(

                                new BigInteger(coordinates[0]),
                                new BigInteger(coordinates[1]),
                                new BigInteger(coordinates[2]),
                                new BigInteger(coordinates[3])
                        ) ;


                numberOfIterations-- ;
            }
        }
    }
}
