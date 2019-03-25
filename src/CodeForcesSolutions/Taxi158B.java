package CodeForcesSolutions;
/*
* After sorting the array, look for the sums of begininng entries and the last entries as a CLUE
*
*
*
*
*
*
* */
import java.util.Scanner;

public class Taxi158B {
    static boolean filled = false ;
    public static int[] insertionSort(int[] arr){
        int[] toBeReturned ;

        for(int counter = 1 ; counter< arr.length ; counter++){
            int nextElement = arr[counter] ;
            int current = counter - 1 ;
            while(current>=0 && arr[current]> nextElement){
                arr[current+1]= arr[current] ;
                current-= 1;
            }
            arr[current+1] = nextElement ;
        }
        toBeReturned = arr ;
        return  arr ;
    }



    public static void main(String args[]){
        Scanner input = new Scanner(System.in) ;
        int strArrLength = Integer.parseInt(input.nextLine().trim())  ;
        String[] inStrs = input.nextLine().trim().split("\\s") ;
        if(inStrs.length == strArrLength && strArrLength>0) {
            int[] toBeProcessed = new int[inStrs.length];
            for (int counter = 0; counter < toBeProcessed.length; counter++) {
                toBeProcessed[counter] = Integer.parseInt(inStrs[counter]);
            }
            toBeProcessed = Taxi158B.insertionSort(toBeProcessed);





            int counter = 0;
            int sum = 0;
            int count = 0;
            /*
            while (sum <= 4 && counter <= toBeProcessed.length) {
                if(counter<toBeProcessed.length) {
                    sum += toBeProcessed[counter];
                }
                if (sum == 4) {
                    count++;
                    // reset the sum
                    sum = 0;
                } else if (sum > 4) {
                    // increase the count , reset the sum , and then include this entry in a new taxi
                    count++;
                    sum = 0;
                    sum += toBeProcessed[counter];
                }
                /*
                int sum2 = 0 ;
                if(counter>0) {
                    sum2 = toBeProcessed[counter] + toBeProcessed[counter - 1];
                }
                if(counter == toBeProcessed.length-1 && sum2>=4 &&(toBeProcessed[counter-1]!=4)){
                    count++ ;
                    sum= 0 ;
                    sum+= toBeProcessed[counter];
                }
                */
            /*
                counter++;
            }
            */


            int HighCounter , LowCounter , Counter   , SpaceLeft;

            for(HighCounter= inStrs.length-1 , Counter=0 ,  LowCounter= 0 ; LowCounter<= HighCounter;){
                if(LowCounter==HighCounter){
                    Counter+=1 ;
                    break ;
                }
                SpaceLeft = 4 - toBeProcessed[HighCounter] ;
                if(toBeProcessed[LowCounter]<= SpaceLeft){
                    toBeProcessed[HighCounter]+= toBeProcessed[LowCounter];
                    LowCounter++ ;
                }
                else{
                    HighCounter-- ;
                    Counter++ ;
                }

            }



            System.out.println(Counter);
        }


    }
}
