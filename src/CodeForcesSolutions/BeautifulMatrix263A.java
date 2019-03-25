package CodeForcesSolutions;

import java.util.Scanner;

public class BeautifulMatrix263A {
    static int row = 0 ;
    static int column = 0 ;

    public static void main(String args){
        int numberOfIterations = 0;
        Scanner input = new Scanner(System.in) ;
        int[][] array = new int[5][5] ;
        while(numberOfIterations<5){
            String[] inputStr = input.nextLine().trim().split("") ;
            for(int counter = 0 ; counter< array.length ; counter++){
               array[numberOfIterations][counter] = Integer.parseInt(inputStr[counter]) ;
            }
            numberOfIterations++ ;
        }

        for(int r = 0 ; r< array.length ; r++){
            for(int col= 0 ; col< array[r].length ; col++){
                if(array[r][col]==1){
                    row = r ;
                    column = col ;
                }
            }
        }




    }
}
