package CodeForcesSolutions.A;

import java.util.LinkedList;
import java.util.Scanner;

public class Presents {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in) ;
        LinkedList<Integer> list = new LinkedList<>() ;
        int size = Integer.parseInt(input.nextLine().trim()) ;
        String[] numbersStr = input.nextLine().trim().split("\\s") ;
        int[] numbers = new int[numbersStr.length]  ;
        for(int counter = 0 ; counter< numbersStr.length ; counter++){
            numbers[counter] = Integer.parseInt(numbersStr[counter]) ;
        }

        for(int counter = 0 ; counter< numbers.length ; counter++){
            for ( int counter2 = 0 ; counter2<numbers.length ; counter2++){

            }
        }







    }
}
