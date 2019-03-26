package CodeForcesSolutions.A;

import java.util.Scanner;

public class Tram116A {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int numberOfIterations = Integer.parseInt(input.nextLine().trim()) ;

        int currentNumber = 0 , maxNumber = 0 ;

        while(numberOfIterations>0){
            String[] inputs = input.nextLine().trim().split("\\s") ;
            int[] inputsNumbers  = new int[inputs.length] ;
            inputsNumbers[0] = Integer.parseInt(inputs[0]) ;
            inputsNumbers[1] = Integer.parseInt(inputs[1]) ;

            if(currentNumber> maxNumber){
                maxNumber = currentNumber ;
            }
            currentNumber -= inputsNumbers[0] ;
            currentNumber += inputsNumbers[1] ;


            numberOfIterations-- ;
        }

        System.out.println(maxNumber);
    }
}
