package CodeForcesSolutions.A;

import java.util.Scanner;

public class BeautifulMatrix263A {
    static int row = 0 ;
    static int column = 0 ;
    static int x = 3 , y = 3 ;

    public static void main(String args[]){
        int numberOfIterations = 0;
        Scanner input = new Scanner(System.in) ;
        while(numberOfIterations<5){

            String inStr = input.nextLine().trim() ;
            boolean containsOne = inStr.contains("1") ;
            if(containsOne){
                row = numberOfIterations+1 ;
                String[] toBeProcessed =  inStr.split("\\s") ;
                int counter = 0 ;
                while(counter< toBeProcessed.length){
                    if(toBeProcessed[counter].equals("1")){
                        break ;
                    }
                    counter++ ;
                }
                column= counter+ 1 ;
            }

            numberOfIterations++ ;
        }

        int numberOfOperations = (Math.abs(x-column) + Math.abs(y-row)) ;
        System.out.println(numberOfOperations);

    }
}
