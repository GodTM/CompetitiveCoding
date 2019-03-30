package CodeForcesSolutions.A;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Puzzles377A {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in) ;
        String[] limits = input.nextLine().trim().split("\\s") ;
        int numberOfStudents = Integer.parseInt(limits[0]) ;
        int maxNumberOfPuzzles = Integer.parseInt(limits[1]) ;
        String[] inputs = input.nextLine().trim().split("\\s") ;
        int[] inputStr = new int[inputs.length] ;

        for(int c = 0; c< inputStr.length ; c++){
            inputStr[c] = Integer.parseInt(inputs[c]) ;
        }
        Arrays.sort(inputStr);
        LinkedList<Integer> list = new LinkedList<>() ;

        if(inputStr.length== maxNumberOfPuzzles)
        {

            for(int counter =0 ; counter< inputStr.length ; counter++){
                if(counter + numberOfStudents <= inputStr.length){

                    int current = counter ;
                    int limit = current+ numberOfStudents ;
                    int lowest = Integer.MAX_VALUE ;
                    int max = 0 ;
                    while(current<limit){
                        if(inputStr[current]<lowest){
                            lowest = inputStr[current] ;
                        }
                        if(inputStr[current]>max){
                            max = inputStr[current] ;
                        }
                        current++ ;
                    }
                    int diff = max - lowest ;
                    list.add(diff) ;
                }

            }

            int totalDiffMin = Integer.MAX_VALUE ;
            for(int c = 0 ; c< list.size() ; c++){
                if(list.get(c)<totalDiffMin){
                    totalDiffMin = list.get(c) ;
                }
            }

            System.out.println(totalDiffMin);
        }

    }
}
