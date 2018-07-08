import java.util.* ;

// to be solved
class HolidaySeason{

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        int lengthOfString = -1 ;
        try{
            // the length of the string
            lengthOfString = Integer.parseInt(input.nextLine().trim());
            int allPossibilities = 0 ;
            // the string to be inspected
            String toBeInspected = input.nextLine().trim() ;
            if(toBeInspected.length() != lengthOfString){
                System.out.println("String of invalid length") ;
                System.exit(-1) ;
            }
            else{

                // the length of the string
                int  a =-1, b =-1, c =- 1 , d = -1 ;

                for(int counter = 0 ; counter<lengthOfString ; counter++){
                    a = counter ;
                    b = counter+1 ;
                    c = counter+2 ;
                    d = counter+3 ;

                    while(d<lengthOfString){
                            if ((toBeInspected.charAt(a) == toBeInspected.charAt(c)) && (toBeInspected.charAt(b)== toBeInspected.charAt(d))) {
                                allPossibilities++;
                            }

                            b++ ;
                            c++ ;
                            d++ ;


                    }
                }
            }

            System.out.println(allPossibilities) ;

        }catch(NumberFormatException e ){
            System.out.println(e+" is not a number") ;
        }



    }
}