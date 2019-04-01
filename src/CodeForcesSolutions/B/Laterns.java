/**
 * Incomplete solution
 *
 *
 *
 * */

package CodeForcesSolutions.B;

import java.math.BigInteger;
import java.util.Scanner;

public class Laterns {

    public static void insertionSort(int[] array){
        for(int nextElement= 1 ; nextElement< array.length ; nextElement++){
            int key = array[nextElement] ;
            int current = nextElement - 1;
            while(current>= 0 && array[current]>key){
                array[current+1] = array[current] ;
                current-=1 ;
            }
            array[current+1] = key ;
        }
    }

    public static void mergeSort(int[] array , int left , int right){
        if(left< right){
            int middle=  (left+ right)/2;
            Laterns.mergeSort(array, left , middle);
            Laterns.mergeSort(array, middle+1 , right);
            Laterns.merge(array , left , right ,middle);
        }
    }


    public static  void merge(int[] array , int left , int right , int middle){
        int leftArraySize = middle - left + 1;
        int rightArraySize = right - middle ;
        int[] leftArr = new int[leftArraySize] ;
        int[] rightArr= new int[rightArraySize] ;
        for(int counter = 0 ; counter< leftArraySize; counter++){
            leftArr[counter] = array[counter+ left] ;
        }
        for(int counter = 0 ; counter< rightArraySize ; counter++){
            rightArr[counter] = array[middle+1 + counter] ;
        }

        int i = 0,  j= 0 , k = left ;
        while(i<leftArraySize && j< rightArraySize){

            if(leftArr[i]<= rightArr[j]){
                array[k]  = leftArr[i] ;
                i++ ;
            }
            else{
                array[k] = rightArr[j] ;
                j++ ;
            }
            k++ ;
        }

        // copying the rest of the elements

        while(i<leftArraySize){
            array[k]  = leftArr[i] ;
            i++ ;
            k++ ;
        }

        while(j<rightArraySize){
            array[k] = rightArr[j] ;
            j++ ;
            k++ ;
        }

    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in) ;
        String[] inputs = input.nextLine().trim().split("\\s") ;
        int numberOfLaterns = Integer.parseInt(inputs[0]) ;
        BigInteger distance = new BigInteger(inputs[1]) ;
        int[] distances = new int[numberOfLaterns] ;
        if(numberOfLaterns>=1 && numberOfLaterns<=1000){
            String[] dStr = input.nextLine().trim().split("\\s") ;
            if(dStr.length == distances.length){
                for(int counter = 0 ;  counter< distances.length ; counter++){ distances[counter]= Integer.parseInt(dStr[counter].trim()) ; }
            }
            Laterns.mergeSort(distances , 0 , distances.length-1);

            int maxDistance= 0 ;
            for(int counter = 0 ; counter< distances.length -1; counter++){
                int diff = distances[counter+1] - distances[counter] ;
                if(diff>maxDistance){
                    maxDistance = diff  ;
                }
            }
            BigInteger maxDifferrence= new BigInteger(String.valueOf(maxDistance)) ;

            // side case for end
            if(distance.subtract(
                    new BigInteger(String.valueOf(distances[distances.length-1])))
                    .compareTo(new BigInteger(String.valueOf(maxDistance)))>=0){
                maxDifferrence = distance.subtract(new BigInteger(String.valueOf(distances[distances.length-1]))) ;
            }

            // side case for start
            if(maxDifferrence.compareTo(
                new BigInteger(String.valueOf(distances[0])).subtract()
                )<0)

            {


            }

        }
    }
}
