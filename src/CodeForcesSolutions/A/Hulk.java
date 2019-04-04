//package CodeForcesSolutions.A;

import java.util.Scanner;

public class Hulk {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String m1 = "I hate ";
        String m2 = "I love " ;

        int in = Integer.parseInt(input.nextLine()) ;
        String out = "" ;
        String[] o = new String[in] ;

        for(int counter = 0 ; counter< o.length ; counter++){
            if(counter %2 ==0){
                o[counter] = m1 ;
            }
            else{
                o[counter] = m2 ;
            }
        }
        for(int counter = 0 ; counter<o.length ; counter++){

            if(counter!=o.length-1) {
                out = out.concat(o[counter]);
                out = out.concat("that ");
            }
            else{
                out = out.concat(o[counter]) ;
            }
        }

        out = out.concat("it") ;
        System.out.println(out);




    }
}
