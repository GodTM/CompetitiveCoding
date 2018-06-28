import java.util.* ;

class PrimeNumber{
    public static void main(String args[]){

        int limitingInt = - 1 ;
        int[] possiblePrimes ;
        Scanner input = new Scanner(System.in) ;
        try{
            // integer input
            limitingInt = Integer.parseInt(input.nextLine().trim()) ;
            possiblePrimes = new int[limitingInt] ;

            if(limitingInt>=2){
                for(int counter=2 ;counter<limitingInt; counter++){

                    int sqrRoot = (int) Math.floor(Math.sqrt(counter)) ;
                    for(int counter2 = 1 ; counter2<sqrRoot ; counter2++){
                        if(counter2==1){
                            possiblePrimes[2] = 2 ;
                            possiblePrimes[3] = 3 ;
                            continue ;
                        }
                        else if(counter!=1 && counter2%counter ==0){
                            break ;
                        }

                        if(counter2==sqrRoot-1){
                            possiblePrimes[counter] = counter ;
                        }
                    }
                }

            }
            for(int counter =0 ; counter<possiblePrimes.length; counter++){
                if(possiblePrimes[counter]!= 0){
                    System.out.print(counter+" ");
                }
            }

        }catch(NumberFormatException e){
            System.out.println(e+" is not a number") ;
        }
    }
}
