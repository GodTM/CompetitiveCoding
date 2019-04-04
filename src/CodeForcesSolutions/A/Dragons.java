package CodeForcesSolutions.A;

import java.util.Arrays;
import java.util.Scanner;

public class Dragons implements Comparable<Dragons> {

    int energyConsumed , energyAwarded ;

    public Dragons(int a , int b){
        this.energyConsumed= a ;
        this.energyAwarded = b ;
    }

    public int compareTo(Dragons d){ return  this.energyConsumed - d.energyConsumed ; }

    public static void insertionSort(int[] array){

        for(int nextElement = 1 ; nextElement< array.length ; nextElement++){

            int key = array[nextElement] ;
            int current = nextElement  - 1;

            while(current>=0 && array[current]>key){
                array[current+1] = array[current];
                current -= 1 ;
            }
            array[current+1] = key ;
        }
    }


    public static void mergeSort(int[] arr , int left , int right){
        int middle = (left+right)/2 ;
        if(left<right){
            Dragons.mergeSort(arr , left , middle);
            Dragons.mergeSort(arr, middle+1 , right);
            Dragons.merge(arr , left ,right , middle) ;
        }
    }

    public static void merge(int[] array , int left , int right , int middle){
        int leftArrSize = middle - left + 1 ;
        int rightArrSize= right - middle ;
        int[] leftArray = new int[leftArrSize] ;
        int[] rightArray= new int[rightArrSize] ;

        for(int counter = 0 ; counter< leftArrSize  ; counter++){
            leftArray[counter] = array[left+counter] ;
        }
        for(int counter = 0 ; counter< rightArrSize ; counter++){
            rightArray[counter] = array[middle+counter+1] ;
        }

        int x = 0 , y = 0 , k = left ;

        while(x< leftArrSize && y < rightArrSize){
            if(leftArray[k]<= rightArray[k]){
                array[k] = leftArray[x] ;
                x++ ;
            }
            else{
                array[k] = rightArray[y] ;
                y++ ;
            }
            k++ ;
        }

        // copying the rest of the elements

       while(x<leftArrSize){
           array[k]  = leftArray[x] ;
           x++ ; k++ ;
       }
       while (y<rightArrSize){
           array[k] = rightArray[y] ;
           y++ ; k++ ;
       }

    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in) ;
        String[] inStr = input.nextLine().trim().split("\\s")    ;
        int baseStrength = Integer.parseInt(inStr[0]) ;
        int numberOfDragons = Integer.parseInt(inStr[1]) ;
        int counter = 0;
        int[] allDifferences = new int[numberOfDragons] ;
        Dragons[] dragons = new Dragons[numberOfDragons]  ;
        while(counter< numberOfDragons){
            String[] fightIn = input.nextLine().trim().split("\\s") ;
            int energyTaken = Integer.parseInt(fightIn[0]) ;
            int bonus       = Integer.parseInt(fightIn[1]) ;
            int difference  = bonus - energyTaken ;
            allDifferences[counter] = difference ;
            dragons[counter] = new Dragons(energyTaken , bonus) ;
            counter++ ;
        }

        Arrays.sort(dragons);
        boolean win = true ;
        int add= baseStrength ;

        for(int counter2 = 0 ; counter2 < numberOfDragons ; counter2++){
            if(dragons[counter2].energyConsumed>= add){
                win= false ;
                break ;
            }
            //add-= dragons[counter2].energyConsumed ;
            add+= dragons[counter2].energyAwarded ;

        }

        System.out.println(win?"YES": "NO");

    }
}
