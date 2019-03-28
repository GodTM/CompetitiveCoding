package HackerEarth.Others ;
import java.util.* ;

class Jhool{

    public static void main(String args[]){
        Scanner input = new Scanner(System.in) ;
        try{
            String[] inputStr = (input.nextLine().trim().split(""));
            int[] mainArr = new int[inputStr.length] ;
            for(int counter=0; counter<inputStr.length ; counter++){
                mainArr[counter] = Integer.parseInt(inputStr[counter]) ;
            }
            int iterator = 0 ;
            int consecutive  = 0;
            boolean luck = true ;
            int currentVar = -1  , prevVar = -1;

            while(iterator < mainArr.length){
                currentVar = mainArr[iterator] ;
                if(iterator!=0) {
                    prevVar = mainArr[iterator - 1];

                    if (prevVar == currentVar) {
                        consecutive += 1;
                        if (consecutive >= 6) {
                            luck = false;
                        }
                    } else if (prevVar != currentVar) {
                        consecutive = 0;
                    }
                }
                iterator+= 1 ;
            }
            if(luck){
                System.out.println("Good luck!") ;
            }else{
                System.out.println("Sorry, sorry!") ;
            }


        }catch(NumberFormatException e){
            System.out.println(e+" is not a number") ;
        }
    }
}