package HackerEarth.Others ;
import java.lang.reflect.Array;
import java.util.* ;

class SimpleSearch{

    public static void main(String args[]){
        // taking input
        Scanner input = new Scanner(System.in) ;
        int numberOfElements = -1,elementToBeSearched = -1 ;
        try{
            // number of elements in the array
            numberOfElements = Integer.parseInt(input.nextLine().trim()) ;
        }catch(NumberFormatException e){
            System.out.println(e+" is not a number") ;
        }
        int[] numberArray = new int[numberOfElements] ;
        // list of elements
        String elements = input.nextLine().trim() ;
        String [] elementArray = elements.split(" ") ;

        /*
        if(elements.length != numberOfElements){
            System.out.println("Invalid number of elements.") ;
            System.exit(1) ;
        }*/



        // converting all the strings to integers
        for(int counter = 0 ; counter<elementArray.length ; counter++){
            numberArray[counter] = Integer.parseInt(elementArray[counter]) ;
        }
        // element to be searched
        try{
            elementToBeSearched = Integer.parseInt(input.nextLine()) ;
        }catch(NumberFormatException e){
            System.out.println(e+" is not a number") ;
        }
        // catch the
        for(int counter = 0 ; counter< numberArray.length ; counter++){
            if(numberArray[counter]== elementToBeSearched){
                System.out.println(counter);
            }
        }

    }
}