package CodeForcesSolutions.A;
import java.util.Scanner;
public class Shovel732A {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in) ;
        String[] inStr = input.nextLine().trim().split("\\s") ;
        int priceOfShovel = Integer.parseInt(inStr[0]) ;
        int valueOfCoin   = Integer.parseInt(inStr[1]) ;
        int count = 0 ;
        int multiplierValue = priceOfShovel ;
        boolean stillCounting = true ;
        while(stillCounting){
            count+= 1  ;
            multiplierValue = priceOfShovel * count ;
            if(((multiplierValue%10 )== 0 ) || ((multiplierValue+valueOfCoin) %(priceOfShovel) ==0) ||  (multiplierValue-valueOfCoin)%10==0){
               stillCounting = false ;
            }

        }
        System.out.println(count);
    }
}
