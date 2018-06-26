import java.util.*;

class MinMax{

    public static void main(String args[]){

        Scanner input = new Scanner(System.in) ;
        String[] allInputString = {} ;
        int[] allInputs ;
        int numberOfInputs = -1 ;
        // taking in the number of elements to be added
        try{
            // number of inputs
            numberOfInputs = Integer.parseInt(input.nextLine().trim());
            // taking the input for the array
            allInputString = input.nextLine().trim().split(" ") ;

            if(numberOfInputs!= allInputString.length){
                System.out.println("Invalid number of inputs") ;
                System.exit(1) ;
            }
            allInputs = new int[allInputString.length] ;
            // converting all the inputs into a number
            for(int counter = 0 ; counter<allInputString.length ; counter++){
                allInputs[counter] =  Integer.parseInt(allInputString[counter]) ;
            }

            // runnning insertion sort
            for(int nextElement =1 ; nextElement<allInputs.length ; nextElement++){

                int key = allInputs[nextElement] ;
                int currentElement = nextElement-1 ;

                while(currentElement>=0 && allInputs[currentElement]>key ){
                    allInputs[currentElement+1] = allInputs[currentElement] ;
                    currentElement-=1 ;
                }
                allInputs[currentElement+1] = key ;
            }

            // now calculating the Min and max

            int minSum= 0 , maxSum = 0 ;
            for(int counter = 0 ; counter <allInputs.length-1 ; counter++){
                minSum +=allInputs[counter] ;
            }
            for(int counter=1 ; counter < allInputs.length ; counter++){
                maxSum+= allInputs[counter]  ;
            }

            System.out.print(minSum+" "+maxSum) ;
        }catch(NumberFormatException e ){
            System.out.println(e+"is not a number") ;
        }
    }
}
