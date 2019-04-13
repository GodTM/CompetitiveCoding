package CodeForcesSolutions.A;

import java.util.Collections;
import java.util.Scanner;

public class BrainPhoto707A {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in) ;
        String[] sizesStr  = input.nextLine().trim().split("\\s") ;
        boolean isColored = false ;
        int row = Integer.parseInt(sizesStr[0]) ;
        int col = Integer.parseInt(sizesStr[1]) ;
        String[][] array= new String[row][col] ;
        for(int counter = 0 ; counter< row ; counter++){
            String[] strings = input.nextLine().trim().split("\\s") ;
            String[] temp = new String[strings.length] ;
            for(int c = 0; c< temp.length ; c++){temp[c] = strings[c] ; }
            for(int cols = 0 ; cols<col ; cols++){
                array[counter][cols] = temp[cols] ;
                if(temp[cols].equals("Y") || temp[cols].equals("M")|| temp[cols].equals("C")){ isColored = true ; break ; }
            }
            if(isColored){break ;}
        }
        if(isColored){System.out.println("#Color");}
        else{System.out.println("#Black&White");}


    }
}
