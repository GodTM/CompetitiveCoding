package HackerEarth.Others ;
import java.util.* ;

class VampiresZombies{

    public static void main(String args[]){
        String[] inputs = {} ;
        int[]evens  , odds  ;
        Scanner input = new Scanner(System.in) ;
        try{
            int evenQuantity = 0  , oddQuantity = 0 ;

            inputs = (input.nextLine().trim()).split(" ") ;

            int[] allInputsInts = new int[inputs.length] ;

            // using insertion sort to sort the elements out
            for(int counter = 0 ; counter < inputs.length ; counter++){

                if(Integer.parseInt(inputs[counter])%2 ==0){evenQuantity++ ; }
                else{oddQuantity++ ; }
            }
            evens = new int[evenQuantity] ; odds= new int[oddQuantity] ;

            // separating the even and odd inputs
            for(int counter = 0 ; counter<inputs.length ; counter++){
                int evenCounter = 0 , oddCounter = 0 ;
                if(Integer.parseInt(inputs[counter])%2 ==0){
                    evens[evenCounter] = Integer.parseInt(inputs[counter]) ;
                    evenCounter++ ;
                }
                else{
                    odds[oddCounter] = Integer.parseInt(inputs[counter]) ;
                    oddCounter++ ;
                }
            }

            // Using insertion sort to sort both the even and odd arrays

            for(int nextElement = 1; nextElement<evens.length ; nextElement++){
                int key = evens[nextElement] ;
                int currentElement = nextElement - 1;
                while(currentElement>=0 && evens[currentElement]>key){
                    evens[currentElement+1] = evens[currentElement] ;
                    currentElement-= 1;
                }
                evens[currentElement+1] = key ;
            }

            // running insertion sort on the second array
            for(int nextElement = 1; nextElement<odds.length ; nextElement++){
                int key = odds[nextElement] ;
                int currentElement = nextElement -1 ;

                while(currentElement>=0 && odds[currentElement]>key){
                    odds[currentElement+1] = odds[currentElement] ;
                    currentElement-- ;
                }
            }
            int[] resultArray = new int[evenQuantity + oddQuantity +2 ] ;
            int sum = 0 ;
            for(int counter=0 ; counter<evens.length ; counter++){
                sum+= evens[counter] ;
                resultArray[counter] = evens[counter] ;
            }
            resultArray[evens.length] = sum ;

            sum = 0 ;
            for(int counter = 0 ; counter<odds.length ; counter++){
                sum+= odds[counter] ;
                resultArray[evens.length+1+counter] = odds[counter] ;
            }
            resultArray[resultArray.length-1] = sum ;

            for(int counter = 0 ; counter<resultArray.length; counter++){
                System.out.print(resultArray[counter]+" ") ;
            }



        }catch(NumberFormatException e){
            System.out.println(e+" is not a number") ;
        }

    }
}