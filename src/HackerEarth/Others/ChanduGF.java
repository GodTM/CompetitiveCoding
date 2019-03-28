package HackerEarth.Others ;
import java.util.*;

class ChanduGF{


    // merge
    public static void merge(long[] array ,int left , int right , int middle){

        int leftArrSize = middle - left + 1;
        int rightArrSize= right - middle ;

        long[] leftArray = new long[leftArrSize];
        long[] rightArray = new long[rightArrSize];

        // copy data
        for(int counter = 0 ; counter<leftArrSize;counter++){
            leftArray[counter]  =  array[left+ counter] ;
        }
        for(int counter = 0; counter< rightArrSize ; counter++){
            rightArray[counter] = array[middle+1+counter];
        }

        int i= 0  , j = 0 , k = left ;
        while(i < leftArrSize && j < rightArrSize){

            if(leftArray[i]<= rightArray[j]){

                array[k] = leftArray[i] ;
                i++ ;
            }else{
                array[k] = rightArray[j] ;
                j++ ;
            }
            k++ ;
        }
        // copying the rest of the elements
        while(i<leftArrSize){
            array[k] = leftArray[i] ;
            i++ ; k++ ;
        }
        while(j<rightArrSize){
            array[k] = rightArray[j] ;
            j++  ; k++ ;
        }

    }

    public static void sort(long[] array , int left , int right ){
        if(left<right){
            int middle = (left+right)/2 ;
            ChanduGF.sort(array , left , middle) ;
            ChanduGF.sort(array, middle+1 , right) ;

            ChanduGF.merge(array, left , right , middle) ;
        }

    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in) ;
        try{
            int numberOfIterations = Integer.parseInt(input.nextLine().trim()) ;
            while(numberOfIterations>0){
                int arrSize = Integer.parseInt(input.nextLine().trim());
                String[] inputStrs = input.nextLine().trim().split(" ") ;
                //
                if(inputStrs.length != arrSize){
                    System.out.println("the size of the array ENTERED is incorrect") ;
                    System.exit(1) ;
                }
                else{
                    long[] arrayToBeSorted=  new long[arrSize] ;
                    for(int counter = 0 ; counter<inputStrs.length ; counter++){
                        arrayToBeSorted[counter] = Integer.parseInt(inputStrs[counter].trim() );
                    }
                    ChanduGF.sort(arrayToBeSorted , 0 , arrayToBeSorted.length -1) ;
                    for(int counter = arrayToBeSorted.length -1 ; counter>=0 ; counter--){
                        System.out.print(arrayToBeSorted[counter]+" ") ;
                    }
                    System.out.println() ;
                }
                numberOfIterations-- ;
            }

        }catch(NumberFormatException e){
            System.out.println(e+" is not an exception") ;
        }
    }
}