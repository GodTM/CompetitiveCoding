package HackerEarth.Others ;
import java.util.* ;

class MaxSum {


    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int sizeOfArr = Integer.parseInt(input.nextLine().trim());

        String[] allNumStrings = input.nextLine().trim().split(" ");
        int[] allNumbers = new int[sizeOfArr];

        // parse
        for (int counter = 0; counter < sizeOfArr; counter++) {
            allNumbers[counter] = Integer.parseInt(allNumStrings[counter]);
        }

        // run insertion sort

        for (int nextElement = 1; nextElement < allNumbers.length; nextElement++) {

            int key = allNumbers[nextElement];
            int currentElement = nextElement - 1;

            while (currentElement >= 0 && allNumbers[currentElement] > key) {
                // exchange
                allNumbers[currentElement + 1] = allNumbers[currentElement];
                currentElement -= 1;
            }
            allNumbers[currentElement + 1] = key;
        }
        int sum = 0;
        int subarrCount = 0;
        // sorted array ;
        boolean allNonZeros = true;
        boolean positive = false;
        /*
        for(int counter = 0 ;  counter<allNumbers.length ; counter++){


            if(allNumbers[counter]>=0){
                sum+= allNumbers[counter] ;
                subarrCount+= 1 ;
            }

        }*/
        int counting = 0;
        for (int counter = 0; counter < allNumbers.length; counter++) {
            if (allNumbers[counter] <= 0) {
                counting += 1;
            }
            if (allNumbers[counter] == 0) {
                allNonZeros = false;
            }
            if (allNumbers[counter] > 0) {
                positive = true;
            }

        }

        // array contains all negative numbers
        if (counting == allNumbers.length - 1 && allNonZeros && !positive) {
            sum = allNumbers[allNumbers.length - 1];
            subarrCount = 1;

        } else if (counting == allNumbers.length - 1 && !allNonZeros && !positive) {

            for (int counter = allNumbers.length - 1; counter >= 0; counter--) {
                if (allNumbers[counter]==0){
                    subarrCount += 1;
                } else if (allNumbers[counter] < 0) {
                    subarrCount += 1;
                    sum = allNumbers[counter];
                    break;
                }

            }
        }
        else if (positive && allNonZeros) {
            for (int counter = 0; counter < allNumbers.length; counter++) {


                if (allNumbers[counter] > 0) {
                    sum += allNumbers[counter];
                    subarrCount += 1;
                }
            }
        }
        else if (positive && !allNonZeros) {
                for (int counter = 0; counter < allNumbers.length; counter++) {


                    if (allNumbers[counter] >= 0) {
                        sum += allNumbers[counter];
                        subarrCount += 1;
                    }
                }
            }

                System.out.println(sum + " " + subarrCount);



    }
}