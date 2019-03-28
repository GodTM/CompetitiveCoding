package HackerEarth.Others ;
import java.util.* ;
class RestInPeace{

    public static void main(String args[]){

        Scanner input = new Scanner(System.in) ;
        int[] allInputs ;
        // number of queries ;
        try{
            int numberOfQueries = Integer.parseInt(input.nextLine().trim()) ;
            allInputs = new int[numberOfQueries]  ;
            boolean[] yesNo = new boolean[numberOfQueries] ;
            for(int counter= 0 ; counter<yesNo.length ; counter++){
                yesNo[counter]= true ;
            }

            for(int counter = 0 ; counter< numberOfQueries ; counter++){
                allInputs[counter] = Integer.parseInt(input.nextLine().trim()) ;
                if(allInputs[counter]%21 == 0){
                    yesNo[counter] = false ;
                }
            }

            for(int counter = 0 ; counter<numberOfQueries ; counter++){
                if(!yesNo[counter]){
                    continue ;
                }else{
                    String numberToBeChecked =  Integer.toString(allInputs[counter]) ;
                    if(numberToBeChecked.contains("21")){
                        yesNo[counter] = false ;
                    }
                }
            }

            for(int counter=0 ; counter<yesNo.length ; counter++){
                if(yesNo[counter]){
                    System.out.println("The streak lives still in our heart!") ;
                }
                else{
                    System.out.println("The streak is broken!") ;
                }
            }


        }catch(NumberFormatException e){
            System.out.println(e+" is not a number") ;
        }
    }
}
