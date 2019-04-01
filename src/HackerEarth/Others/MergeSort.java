package HackerEarth.Others ;
import java.util.* ;

class MergeSort{

    public static void merge(int[] array , int left , int middle , int right ){

        int leftArraySize  = middle - left + 1 ;
        int rightArrSize = right - middle ;

        int[] leftArr = new int[leftArraySize]  ;
        int[] rightArr= new int[rightArrSize]  ;

        // copy data into temporary arrays
        for(int counter = 0 ; counter<leftArraySize ; counter++){
            leftArr[counter] = array[counter+left] ;
        }

        for(int counter = 0 ; counter<rightArrSize ; counter++){
            rightArr[counter] = array[middle+1+counter]  ;
        }

        int i = 0 ,  j = 0 ;
        int k = left ;

        while(i< leftArraySize && j <rightArrSize){

            if(leftArr[i]<=rightArr[j]){

                array[k] = leftArr[i] ;
                i+= 1 ;
            }
            else{
                array[k]= rightArr[j] ;
                j+= 1 ;
            }
            k+=1 ;
        }

        // copy the remaining elements
        while(i<leftArraySize){
            array[k] = leftArr[i] ;
            i+= 1;
            k+= 1;
        }

        while(j<rightArrSize){
            array[k] = rightArr[j]  ;
            j+= 1;
            k+= 1 ;

        }
    }

    public static void sort(int[] array , int left , int right){

        if(left< right){
            int middle = (left + right)/2 ;
            MergeSort.sort(array, left , middle) ;
            MergeSort.sort(array,middle+1 , right) ;

            MergeSort.merge(array, left ,middle, right) ;
        }
    }

    public static void printArray(int[] array){
        for(int counter : array){
            System.out.print(counter+" ") ;
        }
        System.out.println() ;
    }
    public static void main(String args[]){

        int[] array =  {12 ,11 , 13 , 5 , 6 , 7} ; // the array to be sorted
        System.out.println("Given array :") ;
        printArray(array);
        MergeSort.sort(array,  0 , array.length -1);
        System.out.println("Sorted array") ;
        printArray(array);



    }
}