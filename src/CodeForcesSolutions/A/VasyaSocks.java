package CodeForcesSolutions.A;
/*
* not finished
* */
import java.util.Scanner;

public class VasyaSocks {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String[] inStr = input.nextLine().trim().split("\\s");
        int numberOfPairs = Integer.parseInt(inStr[0]);
        int dayOfShopping = Integer.parseInt(inStr[1]);

        if (numberOfPairs < dayOfShopping) {
            System.out.print(numberOfPairs);
        }
        else {
            int answer = 0;
            boolean check = true ;
            for(int counter = numberOfPairs ; counter>= 0 ; counter--){
                answer+=1 ;
                if(counter%dayOfShopping==0 && counter!=0){
                    counter+= 1 ;
                }

            }

            System.out.print(answer);
        }
    }
}