import java.util.* ;

class InsertionSort{

    public static void main(String args[]){

        Scanner input = new Scanner(System.in) ;
        try{
            int size = Integer.parseInt(input.nextLine().trim())  ;
            String[] inputStr = input.nextLine().trim().split(" ") ;
            int[] array = new int[size] ;
            for(int counter = 0 ; counter<inputStr.length ; counter++){
                array[counter] = Integer.parseInt(inputStr[counter].trim()) ;
            }

            // running insertion sort
            for(int nextElement = 1 ; nextElement<array.length ; nextElement++){
                int key= array[nextElement] ;
                int currentElement = nextElement -1 ;
                while(currentElement>=0 && array[currentElement]>key){

                    array[currentElement+1] = array[currentElement] ;
                    currentElement-- ;
                }
                for(int counter = 0 ; counter<array.length ; counter++){
                    System.out.print(array[counter]) ;
                }
                System.out.println() ;
                array[currentElement+1] = key ;
            }
        }catch(NumberFormatException e){
            System.out.println(e+" is not a number") ;
        }
    }
}