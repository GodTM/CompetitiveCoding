import java.util.* ;

class CountDivisors{

    public static void main(String args[]){

        Scanner input = new Scanner(System.in) ;
        try{
            String[] inputStrs = input.nextLine().trim().split(" ") ;
            int lower = 0 , upper = 0 , numberToBeChecked =  0 , numberOfDivisors = 0 ;
            lower = Integer.parseInt(inputStrs[0].trim()) ;
            upper = Integer.parseInt(inputStrs[1].trim()) ;
            numberToBeChecked = Integer.parseInt(inputStrs[2].trim()) ;

            for(int counter= lower ; counter<=upper ; counter++){
                if(counter%numberToBeChecked ==0){
                    numberOfDivisors+= 1 ;
                }
            }

            System.out.println(numberOfDivisors) ;

        }catch(NumberFormatException e){
            System.out.println(e+" is not a number") ;
        }
    }
}