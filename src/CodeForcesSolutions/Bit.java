package CodeForcesSolutions;

import java.util.Scanner;

public class Bit {
    final static String addBefore = "++X" ;
    final static String addAfter  = "X++" ;
    final static String subBefore = "--X" ;
    final static String subAfter  = "X--" ;

    public static void main(String args[]){

        Scanner input = new Scanner(System.in) ;
        int testCases = Integer.parseInt(input.nextLine().trim()) ;
        int x= 0 ;
        if(testCases>=1 && testCases<=150) {
            while (testCases > 0) {

                String action = input.nextLine().trim() ;
                if(action.equals(addBefore)){
                    x = ++x ;

                }else if(action.equals(addAfter)){
                    x += 1 ;

                }
                else if(action.equals(subBefore)){
                    x = --x ;

                }else if(action.equals(subAfter)){
                    x -= 1 ;
                }

                testCases--;
            }

            System.out.println(x);
        }




    }



}
