package CodeForcesSolutions;

import java.util.Scanner;

public class WayTooLongStrings {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in) ;
        int testCases = Integer.parseInt(input.nextLine().trim()) ;
        if(testCases>=1 && testCases<=100 ) {


            while (testCases > 0) {
                char[] stringInput = input.nextLine().trim().toCharArray();
                if (stringInput.length > 10) {
                    int length = stringInput.length - 2;
                    String out = (Character.toString(stringInput[0]) + length + Character.toString(stringInput[stringInput.length - 1]));
                    System.out.println(out);
                } else {
                    String out = new String(stringInput);
                    System.out.println(out);
                }
                testCases--;
            }
        }

    }
}
