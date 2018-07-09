import java.util.* ;

class Palindrome{

    public static void main(String args[]){
        Scanner input = new Scanner(System.in) ;

            String toBeProcessedStr = input.nextLine().trim();
            char[] toBeProcessed = toBeProcessedStr.toCharArray() ;
            boolean answer = true  ;


            for(int counter = 0 ; counter<toBeProcessed.length; counter++){

                if(toBeProcessed[counter]!= toBeProcessed[toBeProcessed.length -counter -1]){
                    answer = false ;
                }
            }
            if(answer){
                System.out.println("YES") ;
            }
            else{
                System.out.println("NO");
            }


        }
    }
