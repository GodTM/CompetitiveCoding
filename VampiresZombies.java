import java.util.* ;

class VampiresZombies{

    public static void main(String args[]){

        Scanner input = new Scanner(System.in) ;
        try{
            // number of inputs
            int numberOfElements = Integer.parseInt(input.nextLine().trim()) ;
            String[] inputStrings = input.nextLine().trim().split(" ") ;
            int[] allNumInputs = new int[numberOfElements] ;

            for(int counter = 0 ; counter<numberOfElements;counter++){
                allNumInputs[counter] = Integer.parseInt(inputStrings[counter].trim()) ;
            }
            int evenCount = 0, oddCount= 0 ;
            for(int counter : allNumInputs){
                if(counter%2==0){
                    evenCount+= 1 ;
                }
                else{
                    oddCount +=1 ;
                }
            }

            int[] allEvens = new int[evenCount] ;
            int[] allOdds =  new int[oddCount] ;
            int even = 0 , odd = 0 ;

            for(int element:  allNumInputs){
                if(element%2==0){
                    allEvens[even] = element ;
                    even+=1 ;
                }
                else{
                    allOdds[odd] = element ;
                    odd+=1 ;
                }
            }

            // run insertion sort on both the arrays
            // all EVENS
            for(int nextElement=1 ; nextElement<allEvens.length ; nextElement++){

                int key = allEvens[nextElement] ;
                int currentElement = nextElement-1 ;

                while(currentElement>=0 &&allEvens[currentElement]>key){
                    allEvens[currentElement+1] = allEvens[currentElement] ;
                    currentElement-= 1;
                }
                allEvens[currentElement+1] = key ;
            }
            // ALL ODDS
            for(int nextElement=1 ; nextElement<allOdds.length ; nextElement++){

                int key = allOdds[nextElement] ;
                int currentElement = nextElement -1 ;

                while(currentElement>=0 &&allOdds[currentElement]>key){
                    allOdds[currentElement+1] = allEvens[currentElement] ;
                    currentElement -= 1 ;
                }
                allOdds[currentElement+1] = key ;
            }

            // calculating sums
            int evenSum = 0 , oddSum = 0 ;
            for(int counter : allEvens){evenSum+=counter ; }
            for(int counter : allOdds){oddSum+=counter ; }
            int[] finalArr = new int[evenCount+oddCount+2] ;
            int secCount = 0 ;
            for(int counter = 0 ; counter<finalArr.length ; counter++){
                if(counter<allEvens.length ){
                    finalArr[counter] = allEvens[counter] ;
                }
                else if(counter ==allEvens.length ){
                    finalArr[counter] = evenSum ;
                }
                else if(counter>allEvens.length && counter<finalArr.length -1){

                    finalArr[counter] = allOdds[secCount] ;
                    secCount +=1 ;
                }
                finalArr[finalArr.length-1] = oddSum ;
            }

            for(int counter:finalArr){
                System.out.print(counter+" ") ;
            }

        }catch(NumberFormatException e){
            System.out.println(e+" is not a number") ;
        }

    }
}