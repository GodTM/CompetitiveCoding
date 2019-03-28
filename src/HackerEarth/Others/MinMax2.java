package HackerEarth.Others ;
import java.util.*;

class MinMax2{

    public static void main(String args[]){

        Scanner input = new Scanner(System.in) ;
        String[] allInputStr = (input.nextLine().trim().split(" ")) ;
        long[] allInputs = new long[allInputStr.length] ;

        for(int counter=0 ; counter<allInputStr.length ; counter++){
            allInputs[counter] = Long.parseLong(allInputStr[counter]) ;
        }

        // run Insertion sort
        for(int nextElement = 1 ; nextElement< allInputs.length ;nextElement++){
            long key = allInputs[nextElement] ;
            int currentElement = nextElement -1 ;

            while(currentElement>= 0 && allInputs[currentElement]>key){
                allInputs[currentElement+1] = allInputs[currentElement] ;
                currentElement-- ;
            }
            allInputs[currentElement + 1] = key  ;
        }

        // finding min
        long min = 0 ;
        for(int counter = 0 ; counter<allInputs.length - 1 ; counter++ ){
            min+= allInputs[counter] ;
        }
        // finding max
        long max= 0;
        for(int counter = 1; counter<allInputs.length ; counter++){
            max+= allInputs[counter]  ;
        }

        System.out.println(min+" "+max) ;

        input.close() ;
    }

}

