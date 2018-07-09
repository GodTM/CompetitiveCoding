import java.util.* ;

class Factorial{

    public static void main(String args[]){

        Scanner input = new Scanner(System.in) ;
        int number = 0 , answer =  1 ;
        try{
            number = Integer.parseInt(input.nextLine().trim()) ;
            if(number ==0){
                answer = 1 ;
            }else if(number>0){
                for(int counter = number ; counter>0 ; counter--){
                    answer*= counter;
                }

            }else{
                System.out.println("Negative number error ") ;
                System.exit(1) ;
            }

            System.out.println(answer);

        }catch(NumberFormatException e){
            System.out.println(e+"is not a number") ;
        }

    }
}