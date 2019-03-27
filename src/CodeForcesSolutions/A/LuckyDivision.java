package CodeForcesSolutions.A;


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
                if(in%luckyFour==0 || in%luckySeven==0){
                    System.out.println(Y);
                }


                // check division by the rest of the numbers
                else{
                    for(int counter = 8 ; counter<= in/2 ; counter++){

                        if(in % counter ==0){
                            String[] toBeProcessed = String.valueOf(counter).split("") ;
                            for(String s:toBeProcessed){
                                if(!(s.equals("4") || s.equals("7"))){
                                    partialLuckCheck = false ;
                                }
                            }
                            if(partialLuckCheck){
                                System.out.println(Y);
                            }

                        }
                    }


                }

                if(!partialLuckCheck){
                    System.out.println(N);
                }

            }
        }
    }
}
