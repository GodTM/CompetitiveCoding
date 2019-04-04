//package CodeForcesSolutions.A;
import java.util.Scanner;
public class Fox510A {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in) ;
        String[] inStr = input.nextLine().trim().split("\\s") ;
        String[][] table = new String[Integer.parseInt(inStr[0])][Integer.parseInt(inStr[1])] ;

        boolean toggle = true ;
        for(int row = 0 ; row< table.length ; row++){
            for(int col = 0 ; col< table[row].length ; col++){
                if(row%2==0){ table[row][col]= "#" ; }
                else{
                    table[row][col] ="." ;
                    if(toggle) { table[row][table[row].length - 1] = "#"; }
                    else{ table[row][0] = "#" ; }
                }
            }

            if(row%2!=0) { toggle = !(toggle); }
        }


        for(int row = 0 ; row< table.length ; row++){
            for(int col = 0 ; col<table[row].length ; col++){
                System.out.print(table[row][col]);
            }
            System.out.println();
        }

    }
}
