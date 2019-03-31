//package CodeForcesSolutions.A;

import java.util.Scanner;

public class AntonDanik {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in) ;
        int numberOfGames = Integer.parseInt(input.nextLine().trim());
        String[] inputs = input.nextLine().trim().split("") ;
        int antonCount = 0 ;
        int danikCount = 0 ;
        for(String s: inputs){
            if(s.equals("A")){ antonCount+=1 ; }
            else{ danikCount+=1 ; }
        }

        if(antonCount>danikCount){
            System.out.println("Anton");
        }else if(danikCount>antonCount){
            System.out.println("Danik");
        }else{
            System.out.println("Friendship");
        }
    }
}
