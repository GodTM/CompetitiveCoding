package CodeForcesSolutions.A;
import java.math.BigInteger;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
public class BankAccount313A {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in) ;
        String in= input.nextLine().trim() ;
        String[] toBeProcessed = in.split("") ;
        BigInteger number = new BigInteger(in) ;
        if(number.compareTo(BigInteger.ZERO)>=0){ System.out.println(number); }
        else{
            LinkedList<String> list = new LinkedList<>() ;
            Collections.addAll(list , toBeProcessed) ;
            String exceptSecondLast = "" ;
            String exceptLast = "" ;
            for(int c = 1  ; c < list.size() ; c++){
                if( c!= list.size()-1){ exceptLast = exceptLast.concat(list.get(c)) ; }
                if(c!= list.size() -2){ exceptSecondLast = exceptSecondLast.concat(list.get(c)) ; }
            }
            BigInteger excpetLastNumber = new BigInteger(exceptLast) ;
            BigInteger exceptSecondLastNumber = new BigInteger(exceptSecondLast) ;
            excpetLastNumber = excpetLastNumber.negate() ;
            exceptSecondLastNumber = exceptSecondLastNumber.negate() ;
            if(exceptSecondLastNumber.compareTo(excpetLastNumber)>0){ System.out.println(exceptSecondLastNumber.toString()); }
            else if(exceptSecondLastNumber.compareTo(excpetLastNumber)<0){ System.out.println(excpetLastNumber.toString()); }
            else{System.out.println(excpetLastNumber);}// can print either one of them


        }
    }
}
