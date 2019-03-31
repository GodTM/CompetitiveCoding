package CodeForcesSolutions.A;
/**
 * to be Solved
 * */
import java.util.Scanner;

public class GameSticks {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in) ;
        String[] dimenStr = input.nextLine().trim().split("\\s") ;
        int dim1 = Integer.parseInt(dimenStr[0]) ;
        int dim2 = Integer.parseInt(dimenStr[1]) ;
        int aTurns = 0 , bTurns = 0 ;
        int max= dim1 * dim2 ;
        int counter = 0 ;
        while(counter< max){
            if(counter%2 ==0){ aTurns++ ; }
            else{ bTurns++; }
            counter ++ ;
        }
        if(aTurns>bTurns){
            System.out.print("Akshat");
        }
        else if(bTurns>aTurns){
            System.out.print("Malvika");
        }
    }
}
