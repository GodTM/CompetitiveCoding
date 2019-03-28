package HackerEarth.Others ;
import java.util.* ;

class NumbersPlay{

    public static void main(String args[]){

        Scanner input = new Scanner(System.in) ;

        String[] details = input.nextLine().trim().split(" ") ;

        try{
            int numberOfElements = Integer.parseInt(details[0].trim())  ;
            int numberOfIterations = Integer.parseInt(details[1].trim());

            String[] allIntegers = input.nextLine().trim().split(" ") ;
            if(allIntegers.length != numberOfElements){
                System.out.println("Define the array again !") ;
                System.exit(0) ;
            }
            else{

                int[] mainArr = new int[numberOfElements] ;
                for(int counter = 0 ; counter<mainArr.length ; counter++){
                    mainArr[counter] = Integer.parseInt(allIntegers[counter]) ;
                }

                int[] averages = new int[numberOfIterations];
                int[] indices = new int[2] ;
                while(numberOfIterations>0){

                    String[] indicesStr = input.nextLine().trim().split(" ") ;
                    for(int counter = 0 ; counter < indices.length ;counter++){
                        indices[counter] = Integer.parseInt(indicesStr[counter]) ;
                    }

                    int leftIndex = indices[0] , rightIndex = indices[1] ;
                    int sum =0 ;
                    for(int counter = leftIndex-1 ; counter<=rightIndex-1 ; counter++){
                        sum+= mainArr[counter] ;
                    }
                    averages[numberOfIterations -1]= sum/((rightIndex-leftIndex)+1)  ;

                    numberOfIterations -=1 ;
                }
                // reverse loop
                for(int counter = averages.length -1; counter>=0 ; counter--){
                    System.out.println(averages[counter]) ;
                }
            }
        }catch(NumberFormatException e){
            System.out.println(e +" is not a number") ;
        }

    }

}
