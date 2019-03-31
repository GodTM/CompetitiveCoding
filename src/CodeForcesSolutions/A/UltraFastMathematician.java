package CodeForcesSolutions.A;

import java.util.Scanner;

public class UltraFastMathematician {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in) ;
        String[] firstNumber = input.nextLine().trim().split("") ;
        String[] secondNumber= input.nextLine().trim().split("") ;
        String outNumber   = "" ;
        if(firstNumber.length == secondNumber.length && firstNumber.length<=100){
            for(int counter= 0 ; counter<firstNumber.length ; counter++){
                if(firstNumber[counter].equals(secondNumber[counter])){ outNumber= outNumber.concat("0")  ; }
                else{ outNumber = outNumber.concat("1") ; } }
        }
        System.out.print(outNumber);
    }
}
