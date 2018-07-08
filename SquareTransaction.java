import java.util.* ;

class SquareTransaction{

    public static void main(String args[]){

        int numberOfTransactions = -1 ;
        Scanner input = new Scanner(System.in) ;
        try{
            // number of transactions
            numberOfTransactions = Integer.parseInt(input.nextLine().trim()) ;
        }catch(NumberFormatException e){
            System.out.println(e + " is not a number") ;
        }
        String[] allTransactions = input.nextLine().trim().split(" ") ;
        if(allTransactions.length != numberOfTransactions){
            System.out.println("Invalid number of transactions") ;
            System.exit(1) ;
        }
        // array of all transactions done by
        int[] valueOfEachTrans = new int[allTransactions.length] ;

        for(int counter = 0 ; counter<allTransactions.length ; counter++){
            valueOfEachTrans[counter] = Integer.parseInt(allTransactions[counter]) ;
        }
        // taking in the number of queries
        int numberOfQueries = -1 ;
        int[] dailyTargets = {}  ;
        try{
            numberOfQueries = Integer.parseInt(input.nextLine().trim()) ;
            // number of daily targets to be completed
            dailyTargets = new int[numberOfQueries] ;

            for(int counter = 0; counter<dailyTargets.length ;counter++){
                // taking inputs for the daily targets
                dailyTargets[counter] = Integer.parseInt(input.nextLine().trim()) ;
            }

        }catch(NumberFormatException e){
            System.out.println(e+" is not a number") ;
        }
        int sum = 0 ;
        int[] requiredTransactions = new int[numberOfQueries] ;
        // now processing
        for(int counter = 0 ; counter<dailyTargets.length ; counter++){
            int length = 0 ;
            while(length < valueOfEachTrans.length){
                sum += valueOfEachTrans[length] ;

                if(sum>=dailyTargets[counter]){
                    requiredTransactions[counter] = length+1 ;
                    break ;
                }
                else if(sum<dailyTargets[counter] && length== valueOfEachTrans.length -1){
                    requiredTransactions[counter] = -1;
                }
                length ++  ;
            }
            sum = 0 ;
        }
        /* printing the number of transactions it will take to complete the daily
         target*/
        for(int counter = 0 ; counter<requiredTransactions.length ; counter++){
            System.out.println(requiredTransactions[counter]);
        }



    }
}