package CodeForcesSolutions.A;

import java.util.Scanner;

public class SoldierBanana546A {

    public static long APsum(long firstTerm , long numberOfTerms){
        long totalSum = 0 ;
        // first term = common diff
        for(int counter = 1 ; counter<= numberOfTerms ; counter++){
            totalSum += counter*firstTerm ;
        }
        return  totalSum ;
    }

    public boolean properBounds(Long a , Long b){

        return (a>=1 && b >=1 && a<=1000 && b<=1000) ;
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in) ;
        String[] inStr = input.nextLine().trim().split("\\s") ;
        long costOffirst= Long.parseUnsignedLong(inStr[0]) ;
        long currentMoney = Long.parseUnsignedLong(inStr[1]) ;
        long numberOfBanana = Long.parseUnsignedLong(inStr[2]) ;
        long amountNeeded = SoldierBanana546A.APsum(costOffirst , numberOfBanana) ;
        if(currentMoney>=amountNeeded){
            System.out.println(0);
        }
        else{
            System.out.println(Math.abs(currentMoney-amountNeeded));
        }



    }
}
