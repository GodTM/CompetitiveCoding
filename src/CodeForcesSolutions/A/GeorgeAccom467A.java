package CodeForcesSolutions.A;
import java.util.Scanner;
public class GeorgeAccom467A {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in) ;
        int numberOfRooms = Integer.parseInt(input.nextLine().trim()) ;
        int counter = 0 ;
        int num = 0 ;
        if(numberOfRooms>=1 && numberOfRooms<=100) {
            while (num < numberOfRooms) {
                String[] in = input.nextLine().trim().split("\\s");
                int currentCap = Integer.parseInt(in[0]);
                int maxCap = Integer.parseInt(in[1]);
                if (maxCap >= currentCap && maxCap >= 0 && maxCap <= 100 && currentCap <= 100 && currentCap >= 0 ) {
                    if (maxCap - currentCap >= 2) {
                        counter += 1;
                    }
                }
             num+= 1 ;
            }

            System.out.println(counter);
        }


    }
}
