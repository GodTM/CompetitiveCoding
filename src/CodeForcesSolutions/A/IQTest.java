package CodeForcesSolutions.A;

import java.util.Scanner;

public class IQTest {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in) ;
        int numberOfElements = Integer.parseInt(input.nextLine().trim()) ;
        int evenNumbers = 0 , oddNumbers = 0 ;
        String[]inStr = input.nextLine().trim().split("\\s") ;
        int[] numbers = new int[inStr.length] ;
        for(int counter = 0 ; counter< numbers.length ; counter++){ numbers[counter] = Integer.parseInt(inStr[counter])  ; }
        for(int counter = 0 ; counter<numbers.length ; counter++){
            if(numbers[counter]%2==0){
                evenNumbers++ ;
            }
            else{
                oddNumbers++ ;
            }
        }
        int index = - 1 ;
        if(evenNumbers>oddNumbers){
            for(int counter = 0 ; counter<numbers.length ; counter++){
                if(numbers[counter]%2!=0){
                    index = counter + 1 ;
                }
            }
        }else{
            for(int counter = 0 ; counter<numbers.length ; counter++){
                if(numbers[counter]%2==0){
                    index = counter + 1 ;
                }
            }
        }

        System.out.print(index);
    }
}
