
package HackerEarth.Others ;
import java.util.*;

class EasyGoing{

    public static void main(String args[]){

        Scanner input = new Scanner(System.in) ;

        int numberOfTests = Integer.parseInt(input.nextLine().trim());

        int counter = numberOfTests ;
        // this program will run a given number of times
        while(counter>0){

            String[] inputs = input.nextLine().trim().split(" ") ;
            // inputs[0] = size of the array
            // M number to be subtracted

            int sizeOfArray = Integer.parseInt(inputs[0]) ;
            int toBeSubtracted = Integer.parseInt(inputs[1]) ;

            String[] allElementsOfArray = input.nextLine().trim().split(" ") ;


            int[] allElements = new int[allElementsOfArray.length] ;
            for(int num = 0 ; num<allElementsOfArray.length ; num++){
                allElements[num] = Integer.parseInt(allElementsOfArray[num])  ;
            }

            // use bubble sort to sort the array

            for(int counter2 = 0 ; counter2<allElements.length-1 ; counter2++){
                for(int counter3 = allElements.length-1 ; counter3>=counter2+1; counter3--){

                    if(allElements[counter3]<allElements[counter3-1]){
                        // exchanging elements ;
                        int exchange = allElements[counter3] ;
                        allElements[counter3] = allElements[counter3 -1] ;
                        allElements[counter3 -1] = exchange ;
                    }
                }
            }

            // now calculating the min and the max of the array

            int maxSum = 0 , minSum = 0 ;

            for(int counter5 = 0 ; counter5<allElements.length  ; counter5++){

                if(counter5<allElements.length - toBeSubtracted){
                    minSum+= allElements[counter5] ;
                }

                if(counter5>= toBeSubtracted){
                    maxSum+= allElements[counter5] ;
                }

            }

            int diff = maxSum - minSum ;
            System.out.println(diff) ;


            counter -- ;
        }

    }
}