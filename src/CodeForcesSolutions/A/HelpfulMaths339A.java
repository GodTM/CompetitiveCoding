package CodeForcesSolutions.A;

import java.util.Scanner;

public class HelpfulMaths339A {


    public static int[] insertionSort(int[] ar){
        int[] arr = ar ;
        for(int nextElement = 1 ; nextElement< arr.length ; nextElement++){

            int key = arr[nextElement] ;
            int currentElement = nextElement - 1;
            while(currentElement>= 0 && arr[currentElement]>key){
                arr[currentElement+1] = arr[currentElement] ;
                currentElement-=1 ;
            }
            arr[currentElement+1] = key ;
        }
        return arr ;
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in) ;
        String[] numberStrings = input.nextLine().trim().split("\\+") ;
        int[] numbers = new int[numberStrings.length] ;
        for(int counter = 0 ; counter< numbers.length ; counter++){
            numbers[counter] = Integer.parseInt(numberStrings[counter]) ;
        }
        if(numbers.length<=100){

            int[] outPut = HelpfulMaths339A.insertionSort(numbers) ;
            for(int c= 0 ; c< outPut.length ; c++){
                if(c!= outPut.length-1) {
                    System.out.print(outPut[c]+"+");
                }else{
                    System.out.print(outPut[c]);
                }
            }

        }
    }
}
