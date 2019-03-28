package HackerEarth.Others ;
import java.util.* ;

class PuchiLuggage{


    public static void main(String args[]){

        Scanner input = new Scanner(System.in) ;

        try{
            int numberOfIterations = Integer.parseInt(input.nextLine().trim()) ;

            while(numberOfIterations>0){
                int numberOfFriends = Integer.parseInt(input.nextLine().trim()) ;
                int[] numWeights = new int[numberOfFriends] ;
                int[] answerArr = new int[numberOfFriends] ;

                for(int counter = 0 ; counter<numWeights.length ; counter++){
                    numWeights[counter] = Integer.parseInt(input.nextLine().trim()) ;
                }
                for(int counter = 0 ; counter<numWeights.length-1 ;counter++){
                    int currentElement = numWeights[counter] ;
                    int sum = 0 ;
                    for(int counter2= counter+1 ; counter2<numWeights.length ; counter++){
                        if(numWeights[counter2]< currentElement){
                            sum+= 1 ;
                        }
                    }
                    answerArr[counter] = sum ;
                }

                for(int s: answerArr){
                    System.out.print(s+" ") ;
                }
                numberOfIterations-- ;
            }

        }catch(NumberFormatException e){
            System.out.println(e+" is not a number") ;
        }
    }
}