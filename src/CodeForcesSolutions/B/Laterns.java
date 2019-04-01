/**
 * Incomplete solution
 *
 *
 *
 * */

//package CodeForcesSolutions.B;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.LinkedList;
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
        BigDecimal distance = new BigDecimal(inputs[1]) ;
        int[] distances = new int[numberOfLaterns] ;
        if(numberOfLaterns>=1 && numberOfLaterns<=1000) {
            String[] dStr = input.nextLine().trim().split("\\s");
            if (dStr.length == distances.length) {
                for (int counter = 0; counter < distances.length; counter++) {
                    distances[counter] = Integer.parseInt(dStr[counter].trim());
                }
            }
            //Laterns.mergeSort(distances , 0 , distances.length-1);
            Laterns.insertionSort(distances);

            if (!(distance.compareTo(BigDecimal.ONE)==0)) {
                BigDecimal finalPointDiff = null;
                LinkedList<Double> differencesList = new LinkedList<>();
                double firstDifference = 0;
                int diff = 0;
                for (int counter = 0; counter < distances.length - 1; counter++) {


                    if (counter == 0) {
                        firstDifference = distances[counter];
                    }
                    if (counter == distances.length - 2) {
                        finalPointDiff = distance.subtract(new BigDecimal(String.valueOf(distances[counter + 1])));
                    }

                    diff = distances[counter + 1] - distances[counter];
                    differencesList.add(diff / 2.0);
                }


                differencesList.add(firstDifference);
                double max = 0;
                Iterator<Double> iterator = differencesList.listIterator();
                while (iterator.hasNext()) {
                    double d = iterator.next();
                    if (d > max) {
                        max = d;
                    }
                }


                BigDecimal finalMax = new BigDecimal(String.valueOf(max));
                assert finalPointDiff != null;
                if (finalMax.compareTo(finalPointDiff) < 0.0) {
                    finalMax = finalPointDiff;
                }


                System.out.println(finalMax);


            }


            else{
                System.out.println(dStr[0]);
            }
        }

    }
}
