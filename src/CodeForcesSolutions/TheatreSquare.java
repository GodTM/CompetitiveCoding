package CodeForcesSolutions;
import java.math.BigInteger;
import java.util.Scanner;

public class TheatreSquare {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in) ;
        String[] inputs = input.nextLine().trim().split("\\s") ;
        long n , m , a;
        n = Long.parseUnsignedLong(inputs[0].trim());
        m = Long.parseUnsignedLong(inputs[1].trim());
        a = Long.parseUnsignedLong(inputs[2].trim());

        if(n< 1 || m<1 || a<1){
            //System.out.println(0);
            System.exit(-1);
        }


        long rDim1= 0  ;
        long rDim2= 0  ;

        if(n%a == 0 && m%a == 0){
            rDim1 = n/a ;
            rDim2 = m/a ;
        }
        if(n%a ==0 && m%a!=0 ){
            rDim1 = n/a ;
            rDim2 = m/a + 1 ;
        }
        if(m%a==0 && n%a != 0){
            rDim1 = m/a ;
            rDim2 = n/a + 1;
        }
        if( m%a != 0 && n%a!=0){
            rDim1 = ((n/a + 1)) ;
            rDim2 = ((m/a + 1)) ;
        }
        // if the
        long counter  ;

        counter = rDim1 * rDim2 ;



        System.out.println(counter);
    }
}
