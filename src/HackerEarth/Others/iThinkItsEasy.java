package HackerEarth.Others ;
import java.util.* ;

class iThinkItsEasy{

    public static void merge(String[] array , int left , int right , int middle){

        int leftArrSize = middle - left + 1;
        int rightArrSize= right - middle ;

        String[] leftArray = new String[leftArrSize] ;
        String[] rightArray = new String[rightArrSize] ;

        int i = 0 , j = 0 , k = left ; // why k = left ???
        // copying elements
        while(i<leftArrSize && j < rightArrSize){

            if(leftArray[i].length()<= rightArray[j].length()){
                array[k] = array[i] ;
                i++ ;

            }else{
                array[k] = rightArray[j] ;
                j++ ;
            }
            k++ ;
        }

        // copying the rest of the elements ;
        while(i<  leftArrSize){
            array[k] = leftArray[i] ;
            i++ ;
            k++ ;
        }
        while(j<rightArrSize){
            array[k] = rightArray[j] ;
            j++ ;
            k++ ;
        }

    }

    public static void sort(String[] array, int left , int right){
        if(left < right){
            int middle = (left+right)/2 ;
            iThinkItsEasy.sort(array , left , middle)  ;
            iThinkItsEasy.sort(array, middle+1 , right) ;

            iThinkItsEasy.merge(array , left , right , middle) ;
        }
    }

    public static void main(String args[]){

        Scanner input = new Scanner(System.in) ;
        try{
            int numberOfIterations = Integer.parseInt(input.nextLine().trim()) ;

            while(numberOfIterations>0){

                String[] allStrings = input.nextLine().trim().split(" ") ;
                iThinkItsEasy.sort(allStrings,0, allStrings.length -1);

                for(String str: allStrings){
                    System.out.print(str+" ") ;

                }
                System.out.println() ;

                numberOfIterations-- ;
            }



        }catch(NumberFormatException e){
            System.out.println(e+" is not a number") ;
        }
    }
}