//package CodeForcesSolutions.Div3;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in) ;
        int numberOfTrials  = Integer.parseInt(input.nextLine().trim()) ;
        if(numberOfTrials>=1 && numberOfTrials<=100) {
            while (numberOfTrials > 0) {
                boolean allDistinct = true;
                String inputStr = input.nextLine().trim() ;
                String[] inputStrings= inputStr.split("") ;
                char[] charArr = inputStr.toCharArray() ;
                Arrays.sort(charArr);

                if(inputStrings.length==1){
                    System.out.println("YES");
                }
                else {
                    boolean correctPlacement = true;
                    for (int counter = 0; counter < inputStrings.length - 1; counter++) {
                        if (!( ((charArr[counter]+1) ==  charArr[counter+1]) || charArr[counter]== charArr[counter+1])) {
                            correctPlacement = false;
                        }
                    }

                    if (correctPlacement) {

                        for (int counter = 0; counter < inputStrings.length - 1; counter++) {
                            for (int counter2 = counter + 1; counter2 < inputStrings.length; counter2++) {
                                if (inputStrings[counter].equals(inputStrings[counter2])) {
                                    allDistinct = false;
                                    break;
                                }
                            }
                        }
                        if (allDistinct) {
                            System.out.println("YES");
                        } else {
                            System.out.println("NO");
                        }


                    }


                    else{
                        System.out.println("NO");
                    }
                }

                numberOfTrials-- ;
            }

        }




    }
}
