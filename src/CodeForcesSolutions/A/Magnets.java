//package CodeForcesSolutions.A;

import java.util.Scanner;

public class Magnets {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int numberOfMagnets = Integer.parseInt(input.nextLine().trim());
        int[] magArr = new int[numberOfMagnets];
        for (int counter = 0; counter < magArr.length; counter++) {
            magArr[counter] = Integer.parseInt(input.nextLine().trim());
        }
        int groupCount = 0;
        if (magArr.length == 1) {
            System.out.println(1);
        } else if(magArr.length==2){
            if(magArr[0]==magArr[1]){
                System.out.println(1);
            }else{
                System.out.println(2);
            }

        }else {

            for (int counter = 0; counter < magArr.length - 1; counter++) {
                for (int counter2 = counter + 1; counter2 < magArr.length; counter2++) {
                    if (magArr[counter] == magArr[counter2]) {
                        continue;
                    }
                    groupCount += 1;
                    counter = counter2 - 1;
                }
            }

            System.out.println(groupCount);
        }
    }
}

