package CodeForcesSolutions.A;
import java.util.Scanner;
public class Magnets {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int numberOfMagnets = Integer.parseInt(input.nextLine().trim());
        String[] magnets = new String[numberOfMagnets];
        for (int counter = 0; counter < magnets.length; counter++) {
            magnets[counter] = input.nextLine().trim();
        }
        int counter = 0;
        int numberOfGroups = 0;

        if (magnets.length == 1) {
            numberOfGroups = 1;
        } else {
            String current = magnets[0] ;
            numberOfGroups = 1 ;
            while (counter < magnets.length-1) {
                if(magnets[counter+1].equals(current)){
                    counter++ ;
                    continue;
                }
                else{
                    current = magnets[counter+1] ;
                    counter++ ;
                    numberOfGroups+=1 ;
                }
            }
        }
        System.out.println(numberOfGroups);
    }
}


