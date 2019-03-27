package CodeForcesSolutions.A;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class LuckyDivision {
    public static final int luckyFour = 4 ;
    public static final int luckySeven= 7 ;
    public static boolean isFullLucky = true ;

    public static final String Y = "YES" ;
    public static final String N = "NO" ;


    public static void main(String args[]){
        Scanner input = new Scanner(System.in) ;
        String inputStr = input.nextLine().trim() ;

        boolean partialLuckCheck= true ;
        int  in = Integer.parseInt(inputStr) ;
        String[] inStr = inputStr.split("") ;

        if(in>=1 && in<= 1000) {
            for (String s : inStr) {
                if (!(s.equals("4") || s.equals("7"))) {
                    isFullLucky = false;
                }
            }
            if (isFullLucky) {
                System.out.println(Y);

            }

            // check whether an integer is divisible by

            else {

                //check division by 7 or 4
                LinkedList<String> list = new LinkedList<>();
                if (in % luckyFour == 0 || in % luckySeven == 0) { System.out.println(Y); }
                // check division by the rest of the numbers
                else{
                    boolean isDivisible = false;
                    for (int counter = 8; counter <= in / 2; counter++) {

                        if (in % counter == 0) {
                            list.add(String.valueOf(counter));
                            isDivisible = true;
                        }
                    }

                    Iterator<String> i = list.listIterator();
                    boolean[] allDivs = new boolean[list.size()];
                    for (int counter = 0 ; counter< allDivs.length ; counter++) { allDivs[counter] = true; }

                    int counter = 0;
                    while (i.hasNext()) {
                        String nextInt = i.next().trim();
                        String[] intArr = nextInt.split("");
                        for (String s : intArr) {
                            if (!(s.equals("4") || s.equals("7"))) {
                                partialLuckCheck = false;
                                allDivs[counter] = false;
                            }
                        }
                        counter++ ;
                    }
                    boolean found = false ;
                    for (boolean b : allDivs) {
                        if (b && isDivisible) {
                            System.out.println(Y);
                            found= true;
                        }
                    }
                    if(!found && isDivisible){
                        System.out.println(N);
                    }
                    else if (!isDivisible) {
                        System.out.println(N);
                    }




                }
            }










        }
    }
}
