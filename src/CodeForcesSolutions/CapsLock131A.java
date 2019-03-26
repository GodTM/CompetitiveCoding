package CodeForcesSolutions;

import java.util.Scanner;

public class CapsLock131A {

    public static String allButStartCaps(String str){
        /*
        boolean firstUpper = false;
        String[] ins = s.split("\\s") ;
        if(ins[0].equals(ins[0].toUpperCase())){
            firstUpper = true ;
        }
        */

        String out = "" ;
        String[] ins = str.split("") ;


        for(int counter = 0 ; counter< ins.length ; counter++){
            ins[counter] = ins[counter].toLowerCase() ;
        }

        ins[0] = ins[0].toUpperCase() ;
        for(String t: ins){
            out = out.concat(t) ;
        }

        return out ;
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in) ;
        String in = input.nextLine().trim() ;
        if(in.length()>=1 && in.length()<=100) {
            System.out.println(CapsLock131A.allButStartCaps(in));
        }
    }
}
