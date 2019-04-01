package CodeForcesSolutions.A;

import java.util.Arrays;
import java.util.Scanner;

public class Games{

    public static void main(String args[]){
        Scanner input  = new Scanner(System.in) ;
        int numberOfTeams = Integer.parseInt(input.nextLine().trim()) ;
        int[] homeUniforms = new int[numberOfTeams] ;
        int[] awayUniforms = new int[numberOfTeams] ;
        int answer = 0 ;
        if(numberOfTeams>=2 && numberOfTeams<= 30){

            for(int counter = 0 ; counter< numberOfTeams ; counter++){
                String[] inStr = input.nextLine().trim().split("\\s") ;
                homeUniforms[counter] = Integer.parseInt(inStr[0]) ;
                awayUniforms[counter]= Integer.parseInt(inStr[1]) ;
             }
            //Arrays.sort(homeUniforms) ;
            //Arrays.sort(awayUniforms);

             for(int counter = 0 ; counter< homeUniforms.length ; counter++){
                 for(int counter2 = 0 ; counter2< awayUniforms.length ; counter2++){
                     if(homeUniforms[counter]==awayUniforms[counter2]){
                         answer++ ;
                     }
                 }
             }

             System.out.println(answer);
        }
    }
}
