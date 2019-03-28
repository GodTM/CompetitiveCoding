package HackerEarth.Others ;
import java.util.*;
class ArrayInsert{

    public static void main(String args[]){

        Scanner input = new Scanner(System.in) ;
        try{
            String[] inputs =  (input.nextLine().trim().split(" ")) ;
            int arrSize = Integer.parseInt(inputs[0].trim()) ;// size of the array
            int numberOfQueries = Integer.parseInt(inputs[1].trim()) ;
            String[] arrElements = input.nextLine().trim().split(" ") ;
            int[] array = new int[arrSize]  ;
            ArrayList<Integer> sums = new ArrayList<Integer>() ;

            if(arrSize!= arrElements.length){
                System.out.println("Incorrect Array or Declared size") ;
                System.out.println(1) ;
            }
            // how

            for(int counter = 0 ; counter<arrElements.length ; counter++){
                array[counter]  = Integer.parseInt(arrElements[counter]) ;
            }

            while(numberOfQueries>0){
                String[] insStrArr = input.nextLine().split(" ") ;
                int[] insArr = new int[ insStrArr.length ] ;

                for(int counter= 0 ; counter<insStrArr.length ; counter++){
                    insArr[counter] = Integer.parseInt(insStrArr[counter]) ;
                }
                if(insArr[0]==1){
                    array[insArr[1]] = insArr[2];

                }else if(insArr[0]==2){
                    int sum  = 0 ;
                    for(int counter= insArr[1]; counter<= insArr[2] ; counter++){
                        sum+= array[counter] ;
                    }
                    sums.add(sum) ;
                }
                numberOfQueries-=1 ;
            }

            for(int s:sums){
                System.out.println(s) ;
            }
        }catch(NumberFormatException e){
            System.out.println(e+" is not a number") ;
        }


    }


}