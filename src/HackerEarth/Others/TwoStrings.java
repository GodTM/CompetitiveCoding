package HackerEarth.Others ;
import java.util.*;

class TwoStrings{

    public static void main(String args[]){
        Scanner input = new Scanner(System.in) ;

        try{
            int numberOfTests = Integer.parseInt(input.nextLine().trim()) ;
            boolean[] answers = new boolean[numberOfTests] ;
            for(int counter = 0; counter<answers.length ; counter++){
                answers[counter] = true ;
            }
            while(numberOfTests>0){

                String[] inputStrings =input.nextLine().trim().split(" ") ;
                String original = inputStrings[0] ;
                String possiblePermutation = inputStrings[1];
                char[] originalArr = original.toCharArray() ;
                char[] permutationArr = possiblePermutation.toCharArray() ;



                // if the length is different .. save computation time
                if(original.length() != possiblePermutation.length()){
                    answers[numberOfTests-1] = false ;
                    continue ;
                }
                // sorting original array
                for(int nextElement =1 ; nextElement<originalArr.length; nextElement++){
                    char key = originalArr[nextElement] ;
                    int currentElement =  nextElement -1 ;
                    while(currentElement>=0 && originalArr[currentElement]>key){
                        originalArr[currentElement+1] = originalArr[currentElement] ;
                        currentElement-=1 ;
                    }
                    originalArr[currentElement+1] = key ;
                }

                // sorting the permutation string
                for(int nextElement = 1 ; nextElement<permutationArr.length;nextElement++){
                    char key = permutationArr[nextElement] ;
                    int currentElement = nextElement - 1 ;
                    while(currentElement>=0 && permutationArr[currentElement]>key){
                        permutationArr[currentElement+1] = permutationArr[currentElement] ;
                        currentElement-= 1 ;
                    }
                    permutationArr[currentElement+1] = key ;
                }



            for(int counter = 0 ; counter<originalArr.length ; counter++){
                    if(originalArr[counter]!= permutationArr[counter]){answers[numberOfTests-1] = false ; }
            }
            numberOfTests-- ;


            }
            /*
            for(boolean value: answers){
                if(value){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO") ;
                }
            } */

            for(int counter = answers.length-1 ; counter>= 0 ; counter--){
                if(answers[counter]){
                    System.out.println("YES") ;
                }
                else{
                    System.out.println("NO") ;
                }
            }
        }catch(NumberFormatException e){
            System.out.println(e+"is not an integer") ;
        }

    }


}
