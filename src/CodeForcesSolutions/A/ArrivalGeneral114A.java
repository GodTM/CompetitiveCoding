package CodeForcesSolutions.A;

import java.util.Scanner;

public class ArrivalGeneral114A {

    static int bubbleSort(int arr[])
    {   int[] ar = arr ;
        int swaps = 0 ;
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[i]
                    swaps+=1 ;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

        return swaps ;
    }


    public static void main(String args[]){
        Scanner input  = new Scanner(System.in) ;
        int numberOfSoldiers = Integer.parseInt(input.nextLine().trim()) ;
        String[] inStrings = input.nextLine().trim().split("\\s") ;
        int[] numbers = new int[inStrings.length] ;
        for(int c = 0; c< numbers.length ; c++){
            numbers[c] = Integer.parseInt(inStrings[c]) ;
        }
        int max = 0 ;
        int min = Integer.MAX_VALUE ;

        for(int counter = 0 ;counter< numbers.length ; counter++){
            if(numbers[counter]>max){
                max = numbers[counter] ;
            }
            if(numbers[counter]< min){
                min = numbers[counter] ;
            }
        }
        int maxIndex = 0 ;
        int minIndex = 0 ;
        if(max==min){
            System.out.print(0);
        }else{
            int swaps =  0  ;
            // get the first instance of the max number and the last instance of the minimum number
            for(int counter = 0 ; counter< numbers.length ;counter++ ){ if(numbers[counter]==max){ maxIndex = counter ;break ; } }
            for(int counter = maxIndex ; counter> 0  ; counter--){
                if(numbers[counter]>numbers[counter-1]){
                    int temp = numbers[counter] ;
                    numbers[counter] = numbers[counter-1] ;
                    numbers[counter-1] = temp ;
                    swaps+= 1;
                }
            }


            for(int counter = 0 ; counter< numbers.length ;counter++ ){ if(numbers[counter]==min){ minIndex = counter ; } }
            for(int counter = minIndex ; counter< numbers.length -1 ; counter++){
                if(numbers[counter]<numbers[counter+1]){
                    int temp = numbers[counter] ;
                    numbers[counter] = numbers[counter+1] ;
                    numbers[counter+1] = temp ;
                    swaps+= 1;
                }
            }
            //int swaps = maxIndex + (numbers.length - minIndex-1) ;
            System.out.print(swaps);



        }
    }
}
