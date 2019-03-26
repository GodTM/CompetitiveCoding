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




    public static boolean conditionCheck(String string){
        boolean allCaps  = false ;
        boolean restCaps = false ;

        String[] in  = string.split("") ;
        if(in[0].equals(in[0].toUpperCase())) {
            boolean check = true ;
            for (int counter = 1; counter < string.length(); counter++) {
                if(! in[counter].equals(in[counter].toUpperCase())){
                    check  = false ;
                    break ;
                }
            }
            allCaps = check ;

        }else{
            boolean rest= true ;
            int counter = 1 ;
            while(rest && counter<in.length){
                if(! in[counter].equals(in[counter].toUpperCase())){
                    rest = false ;
                    break ;
                }
                counter++ ;
            }
            restCaps  = rest ;
        }

        if(in.length ==1){
            return  true ;
        }

        return allCaps || restCaps ;
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in) ;
        String in = input.nextLine().trim() ;
        if(in.length()>=1 && in.length()<=100) {
            if(conditionCheck(in)) {
                //System.out.println(CapsLock131A.allButStartCaps(in));
                String[] toBeProcessed = in.split("") ;
                String out = "" ;
                for(int counter = 0 ; counter< toBeProcessed.length ; counter++){
                        if(toBeProcessed[counter].equals(toBeProcessed[counter].toUpperCase())){
                            toBeProcessed[counter] = toBeProcessed[counter].toLowerCase() ;
                            out = out.concat(toBeProcessed[counter]) ;
                        }
                        else{
                            toBeProcessed[counter] = toBeProcessed[counter].toUpperCase() ;
                            out = out.concat(toBeProcessed[counter])  ;
                        }
                }

                System.out.println(out);
            }
            else{
                System.out.println(in);
            }
        }
    }
}
