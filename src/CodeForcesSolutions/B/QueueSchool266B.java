package CodeForcesSolutions.B;

import java.util.Scanner;


public class QueueSchool266B {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in) ;
        String[] inputParams = input.nextLine().trim().split("\\s") ;
        int size = Integer.parseInt(inputParams[0]) ;
        int time = Integer.parseInt(inputParams[1]) ;
        int countTime = 0 ;
        String[] inputStrings = input.nextLine().trim().split("") ;
        String[] finalOut = new String[inputStrings.length] ;
        if(inputStrings.length==size){
            while(countTime <time) {

                String[] out=  new String[inputStrings.length] ;
                for (int counter = 0; counter < inputStrings.length; counter++) {

                    if (counter != inputStrings.length - 1) {
                        if (inputStrings[counter].equals("B") && inputStrings[counter + 1].equals("G")) {
                            out[counter] = inputStrings[counter + 1];
                            out[counter + 1] = inputStrings[counter];
                            counter += 1;
                        } else {
                            out[counter] = inputStrings[counter];
                        }
                    }
                }

                countTime++ ;
            }


            }






        }



    }

