//package CodeForcesSolutions.B;

import java.util.Scanner;

public class Drinks {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in) ;
        int numberOfDrinks = Integer.parseInt(input.nextLine().trim()) ;
        String[] strIn = input.nextLine().trim().split("\\s") ;

        if(numberOfDrinks== strIn.length) {
            double[] i = new double[strIn.length];
            double count = 0;
            for (int c = 0; c < i.length; c++) {
                i[c] = Double.parseDouble(strIn[c]);
                i[c] = i[c] / i.length;
                count += i[c];
            }
            System.out.println(count);
        }
    }
}
