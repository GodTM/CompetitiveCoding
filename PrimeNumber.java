import java.util.* ;

class PrimeNumber{

    public static boolean isPrime(int num){
        if(num<2){
            return false ;
        }
        else if(num==2){
            return true;
        }
        if(num>2 && num%2==0){
            return false ;
        }
        int upperLimit = (int) Math.floor(Math.sqrt(num)) + 1 ;
        for(int counter = 3; counter< upperLimit; counter++){
            if(num%counter ==0){
                return false ;
            }
        }
        return true;

    }
    public static void main(String args[]){

        Scanner input = new Scanner(System.in) ;
        try{
            int toBeProcessed = Integer.parseInt(input.nextLine().trim()) ;
            ArrayList<Integer> array = new ArrayList<Integer>() ;
            for(int counter=2 ; counter<= toBeProcessed ; counter++){
                if(isPrime(counter)){
                    array.add(counter) ;
                }
            }
            for(int element: array){
                System.out.print(element+" ") ;
            }
        }catch(NumberFormatException e){
            System.out.println(e+" is not a number") ;
        }


    }
}