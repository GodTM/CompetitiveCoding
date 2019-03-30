package CodeForcesSolutions.A;

/**
 *
 * Partially solved
 *
 *
 * */
import java.math.BigInteger;
import java.util.Scanner;

public class KefaFirstSteps580A {
    static int max = 0;
    static int current = 0;

    public static void main(String args[]){
        Scanner input = new Scanner(System.in) ;
        int numberOfDigits = Integer.parseInt(input.nextLine().trim());
        if(numberOfDigits>=1 && numberOfDigits<=100000) {

            String[] inputStrings = input.nextLine().trim().split("\\s");
            BigInteger[] inputNumbers = new BigInteger[inputStrings.length];
            for (int c = 0; c < inputNumbers.length; c++) {
                inputNumbers[c] = new BigInteger(inputStrings[c]);
            }
            if (inputNumbers.length == 1) {
                System.out.println(1);
            } else {
                for (int counter = 0; counter < inputNumbers.length; ) {
                    boolean running = true;
                    int comparing = 0;
                    while (running) {

                        if (counter != inputNumbers.length - 1 && inputNumbers[counter].compareTo(inputNumbers[counter + 1]) <= 0) {
                            current += 1;
                            counter++;

                            if (current > max) {
                                max = current;
                            }
                            if (current > comparing) {
                                comparing = current;
                            }
                        } else {
                            running = false;
                            current = 0;
                        }

                        if (!running && counter!=0) {
                            if (inputNumbers[counter].compareTo(inputNumbers[counter - 1]) >= 0) {
                                comparing += 1;
                                if (comparing > max) {
                                    max = comparing;
                                    comparing = 0;
                                }
                            }
                        }

                    }

                    counter++;
                }

                System.out.println(max);
            }
        }
    }




}
