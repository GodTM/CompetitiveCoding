package CodeForcesSolutions.A;

import java.util.LinkedList;
import java.util.Scanner;

public class StonesOnTable266A {
    public static int count = 0 ;
    public static void main(String args[]){
        Scanner input = new Scanner(System.in) ;
        int size = Integer.parseInt(input.nextLine().trim()) ;
        String[] inputStrArr = input.nextLine().trim().split("") ;
        if(size== inputStrArr.length && size>=1 && size<=50) {
            for (int counter = 0; counter < inputStrArr.length; counter++) {
                if (counter != inputStrArr.length - 1) {
                    if (inputStrArr[counter].equals(inputStrArr[counter + 1])) {
                        count += 1;
                    }
                }
            }

            System.out.println(count);
        }

    }
}
