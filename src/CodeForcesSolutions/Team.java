package CodeForcesSolutions;

import java.util.Scanner;

public class Team {

    public static int numberOfMembers(String[] array){
        int[] integerInputs = new int[array.length] ;
        int count = 0 ;
        for(int counter = 0 ; counter< array.length ; counter++){
            integerInputs[counter]= Integer.parseInt(array[counter].trim());
            if(integerInputs[counter]==1){
                count++ ;
            }
        }
        return  count ;
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int numberOfTestCases = Integer.parseInt(input.nextLine().trim());
        if (numberOfTestCases >= 1 && numberOfTestCases <= 1000) {
            int numberOfProblemsSolved = 0;

            while (numberOfTestCases > 0) {
                String[] inputStr = input.nextLine().trim().split("\\s");
                if(Team.numberOfMembers(inputStr)>=2){
                    numberOfProblemsSolved++ ;
                }
                numberOfTestCases--;
            }

            System.out.println(numberOfProblemsSolved);

        }
    }
}
