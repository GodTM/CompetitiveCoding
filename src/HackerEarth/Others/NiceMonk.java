package HackerEarth.Others ;
import java.util.* ;

class NiceMonk{

    public static void main(String args[]){

        Scanner input = new Scanner(System.in) ;
        int numberOfInputs = Integer.parseInt(input.nextLine().trim()) ;

        String[] allCases = new String[numberOfInputs] ;
        int[] values = new int[numberOfInputs] ;

        // taking in all the inputs
        for(int counter = 0; counter<numberOfInputs ; counter++){
            allCases[counter] = input.nextLine().trim() ; // taking in the inputs
        }
        // now to process
        for(int currentElement = 0 ; currentElement< numberOfInputs ; currentElement++){
            int value  = 0 ;
            String key  = allCases[currentElement] ;
            int counter = currentElement ;

            while(counter>= 0){

                if(key.compareTo(allCases[counter])>0){
                    value ++ ;
                }
                counter -- ;
            }

            values[currentElement] = value;
            value = 0 ;
        }

        for(int counter:values){
            System.out.println(counter) ;
        }
    }
}
