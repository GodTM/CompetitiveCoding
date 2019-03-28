package HackerEarth.Others ;
import java.util.*  ;

class theGreatKian{

    public static void main(String args[]){

        Scanner input = new Scanner(System.in) ;

        int arrSize = Integer.parseInt(input.nextLine().trim());
        String[] inputStrs = (input.nextLine().trim().split(" ")) ;
        if(inputStrs.length!= arrSize){
            System.out.println("Incorrect size or input array") ;
            System.exit(1) ;
        }
        int[] mainArr = new int[arrSize] ;

        for(int counter = 0 ;counter<inputStrs.length; counter++){
            mainArr[counter] = Integer.parseInt(inputStrs[counter].trim());
        }
        int sum1 = 0 , sum2 = 0 , sum3 = 0 ;

        for(int counter = 0 ; counter<mainArr.length ; counter++){
            int firstNum = 1 , secondNum = 2 ;

            if(counter+3<mainArr.length){
                sum1+= mainArr[counter] ;
            }
            if(counter+firstNum<mainArr.length){
                sum2+= mainArr[counter+firstNum] ;
            }
            if(counter+secondNum< mainArr.length){
                sum3 += mainArr[counter+secondNum] ;
            }
        }
        System.out.println(sum1+" "+sum2+" "+sum3) ;


    }
}
