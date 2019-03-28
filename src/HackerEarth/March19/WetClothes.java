package HackerEarth.March19;

import java.util.Scanner;

public class WetClothes {

    public static boolean check(int n){return n>=1 && n<=100 ; }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in) ;
        String[] inputs= input.nextLine().trim().split("\\s") ;
        // min 2 as we are t = 1
        int numberOfTimesRain = Integer.parseInt(inputs[0]) ;
        int numberOfClothes   = Integer.parseInt(inputs[1]) ;
        int noOfTimesOut      = Integer.parseInt(inputs[2]) ;
        if(numberOfTimesRain>=2 && numberOfTimesRain<=100){
            if(WetClothes.check(noOfTimesOut) && WetClothes.check(numberOfClothes)){

            }
        }
    }
}
