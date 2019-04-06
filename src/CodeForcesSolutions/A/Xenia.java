package CodeForcesSolutions.A;

import java.util.Scanner;

public class Xenia {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in) ;
        boolean incomplete = true ;
        String[] inSt = input.nextLine().trim().split("\\s") ;
        long numberOfHouses = Long.parseLong(inSt[0]);
        long numberOfTasks  =  Long.parseLong(inSt[1]) ;
        String[] inTasks  = input.nextLine().trim().split("\\s") ;
        long[] tasks  = new long[inTasks.length] ;
        for(int c = 0 ; c<inTasks.length ; c++){
            tasks[c] = Long.parseUnsignedLong(inTasks[c]) ;
        }


        int time = 0 ;
        long count = 0 ;
        /*
        while(incomplete){
            for(int counter = 1 ; counter<= numberOfHouses ; counter++){
                for(int c2 =  0 ; c2< tasks.length ; c2++){
                    if(count< tasks[c2]){
                        count = c2 ;
                        time+=1 ;
                    }
                    else{
                        time+= numberOfHouses- ;
                        break ;
                    }
                }
            }
        }
        */
        boolean completed = false ;
        for(int counter  = 0 ; counter< numberOfTasks ; counter++){
            if(counter!= 0 && tasks[counter]> tasks[counter+1] && !completed){

                completed = true ;
            }
        }

    }
}
