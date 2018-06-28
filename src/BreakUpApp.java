import java.util.* ;
// to be solved
class BreakUpApp{

    public static void main(String args[]){

        Scanner input = new Scanner(System.in) ;
        int numberOfLines = 0 ;
        try{
            numberOfLines = Integer.parseInt(input.nextLine());
        }catch(NumberFormatException e ){
            System.out.println(e+"is not a number") ;
        }
        String[] linesOfConversation = new String[numberOfLines] ;
        for(int counter=0 ; counter<numberOfLines; counter++){
            linesOfConversation[counter] = input.nextLine().trim();
        }

        int[] days = new int[30] ;
        for(int counter=0; counter<days.length ; counter++){
            days[counter]= 0;
        }


        /**GF's message is on an even line
         M's message is on an odd line*/
        // iterating over the lines
        int otherScore, score19, score20 ;
        for(int counter = 0 ; counter<linesOfConversation.length ; counter++){
            // gf's message
            if(counter%2==0){
                String[] tempMessage = linesOfConversation[counter].split("//s") ;
                for(String word:tempMessage){
                    if(word.matches(".*\\d+.*")){
                        days[(Integer.parseInt(word)) -1] +=2 ;
                    }
                }

            }else{// m's Message
                String[] tempMessage = linesOfConversation[counter].split("//s") ;
                for(String word: tempMessage){
                    if(word.matches(".*\\d+.*")){
                        days[(Integer.parseInt(word) -1)] += 1 ;
                    }
                }
            }
        }

        int max = 0 , day = 0 , collisions = 0 ;
        for(int counter = 0 ; counter<days.length; counter++){
            if(days[counter]>max){
                max = days[counter]  ;
                day = counter +1 ;
            }
        }

        // checking for repititions of max values
        for(int counter = 0 ; counter<days.length ; counter++){
            if (days[counter]== max){
                collisions ++ ;
            }
        }

        if(collisions==0 && (day==19 || day==20)){
            System.out.println("Date") ;
        }
        else{
            System.out.println("No Date") ;
        }

    }

}