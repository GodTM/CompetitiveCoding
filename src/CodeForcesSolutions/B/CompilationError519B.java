//package CodeForcesSolutions.B;
import java.util.LinkedList;
import java.util.Scanner;
public class CompilationError519B {


    public static void merge(int[] array , int left , int right , int middle){

        int leftArrSize = middle - left + 1 ;
        int rightArrSize = right - middle;

        int[] leftArray = new int[leftArrSize] ;
        int[] rightArray= new int[rightArrSize];

        // creating the left and right subArrays... takes extra O(n) space
        for(int counter = 0 ; counter <  leftArrSize; counter++){
            leftArray[counter] = array[left+counter] ;
        }
        for(int counter = 0 ; counter<rightArrSize ; counter++){
            rightArray[counter] = array[middle+1+counter] ;
        }

        int i = 0,  j= 0 , k = left ;

        while(i<leftArrSize && j< rightArrSize){

            if(leftArray[i]<= rightArray[j]){
                array[k]  = leftArray[i] ;
                i++ ;
            }
            else{
                array[k] = rightArray[j] ;
                j++ ;
            }
            k++ ;
        }

        // copying the rest of the elements

        while(i<leftArrSize){
            array[k]  = leftArray[i] ;
            i++ ;
            k++ ;
        }

        while(j<rightArrSize){
            array[k] = rightArray[j] ;
            j++ ;
            k++ ;
        }

    }

    /**
     * 2 . sort algorithm
     *
     * */

    public static void mergeSort(int[] array , int left , int right){

        if(left< right){
            int middle = (left+right)/2 ;

            CompilationError519B.mergeSort(array, left , middle);
            CompilationError519B.mergeSort(array, middle+1 , right);
            CompilationError519B.merge(array, left , right , middle);

        }
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in) ;
        int arrSize = Integer.parseInt(in.nextLine().trim()) ;
        String[] firstArrStr = in.nextLine().trim().split("\\s") ;
        String[] secArrStr   = in.nextLine().trim().split("\\s") ;
        String[] thirdArrStr = in.nextLine().trim().split("\\s") ;
        int[] firstArray = new int[firstArrStr.length] ;
        int[] secondArray = new int[secArrStr.length] ;
        int[] thirdArray = new int[thirdArrStr.length] ;
        for(int c = 0 ; c< firstArrStr.length ; c++){firstArray[c] = Integer.parseInt(firstArrStr[c]);}
        for(int c = 0 ; c< secArrStr.length ; c++) {secondArray[c] = Integer.parseInt(secArrStr[c]) ; }
        for(int c = 0 ; c< thirdArrStr.length ; c++){thirdArray[c] = Integer.parseInt(thirdArrStr[c]) ; }
        CompilationError519B.mergeSort(firstArray , 0 , firstArray.length-1);
        CompilationError519B.mergeSort(secondArray, 0 , secondArray.length -1 );
        CompilationError519B.mergeSort(thirdArray , 0 , thirdArray.length -1);
        LinkedList<Integer> list = new LinkedList<>() ;

        boolean secondCompleted = false ; boolean thirdCompleted = false;
        for(int counter = 0 ; counter<secondArray.length ;counter++){
            if(secondArray[counter]!= firstArray[counter]){
                list.add(firstArray[counter]) ;
                break ;
            }
            if(counter==secondArray.length-1){ secondCompleted = true ; }
        }
        if(secondCompleted){list.add(firstArray[firstArray.length-1]) ; }


        for(int counter = 0 ; counter<thirdArray.length ;counter++){
            if(secondArray[counter]!= thirdArray[counter]){
                list.add(secondArray[counter]) ;
                break ;
            }
            if(counter==thirdArray.length-1){ thirdCompleted = true ; }
        }
        if(thirdCompleted){list.add(secondArray[secondArray.length-1]) ; }

        for(Integer i : list){
            System.out.println(i + " ");
        }


    }

}
