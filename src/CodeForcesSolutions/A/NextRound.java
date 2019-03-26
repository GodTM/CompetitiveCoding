package CodeForcesSolutions.A;

import java.util.Scanner;

public class NextRound {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String[] inputs = input.nextLine().trim().split("\\s") ;
        int n = 0 , k = 0 ;
        n= Integer.parseInt(inputs[0].trim()) ;
        k= Integer.parseInt(inputs[1].trim()) ;
        boolean sameElement = false;
        int noToNextRound = 0 ;
        if(n>= k && (n>=1 && n<=50) && (k>=1 && k<=50)){
            String[] intInputs = input.nextLine().trim().split("\\s") ;
            int[] scores = new int[intInputs.length] ;
            for(int counter = 0 ; counter< intInputs.length ; counter++){
                scores[counter] = Integer.parseInt(intInputs[counter].trim()) ;
            }

            int limit = scores[k-1] ;
            for(int counter=0 ; counter<scores.length;counter++){
                if(counter != k-1 && scores[counter]== limit){
                    sameElement= true;
                }
            }

            for (int counter = 0 ; counter < intInputs.length ; counter++){
                 if(scores[counter]>= limit && scores[counter]>0){
                     noToNextRound++ ;
                 }
            }

            System.out.println(noToNextRound);


        }





    }
}
