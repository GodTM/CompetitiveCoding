package CodeForcesSolutions.A;

import java.util.Scanner;

public class BeautifulYear271A {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in) ;
        int currentYear = Integer.parseInt(input.nextLine().trim());
        if(currentYear>=1000 && currentYear<=9000){
            int year = currentYear ;
            boolean found = false ;
            while(!found){
                year++ ;
                boolean allDistinct = true ;
                String[] toBeProcessed = String.valueOf(year).split("")  ;
                for(int counter = 0 ; counter< toBeProcessed.length-1 ; counter++){
                    for(int counter2 = counter+1 ; counter2< toBeProcessed.length;counter2++){
                        if(toBeProcessed[counter].equals(toBeProcessed[counter2])){
                            allDistinct = false ;
                        }
                    }
                }

                if(allDistinct){
                    found = true ;
                }

            }

            System.out.println(year);

        }

    }
}
