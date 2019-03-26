package CodeForcesSolutions.A;

import java.util.*;

public class BoyGirl236A {

    public static String YES = "CHAT WITH HER!" ;
    public static String NO  = "IGNORE HIM!"  ;
    public static void main(String args[]) {
        boolean isDuplicate = false;
        int count = 0;
        Scanner input = new Scanner(System.in);
        char[] inputStr = input.nextLine().trim().toLowerCase().toCharArray();
        Arrays.sort(inputStr);

        LinkedList<Character> list = new LinkedList<>() ;
        LinkedList<Character> out = new LinkedList<>() ;

        if (inputStr.length <= 100) {


            /*

            for (int counter = 0; counter < inputStr.length; counter++) {
                for (int counter2 = counter + 1; counter2 < inputStr.length - 1; counter2++) {

                    if (inputStr[counter] == inputStr[counter2]) {
                        isDuplicate = true;
                        list.add(inputStr[counter]) ;

                    }

                    else {
                        break;
                    }
                }
                if (isDuplicate) {
                    count++;
                    isDuplicate = false;
                }

            }





            int duplicatesCount = 0 ;
            for(char c :list){
                for(int counter = 0 ; counter<inputStr.length ; counter++){
                    if(c == inputStr[counter]){
                        duplicatesCount++ ;
                    }
                }
            }

            int distinct = inputStr.length - duplicatesCount + list.size() ;


            if (distinct % 2 == 0) {
                System.out.println(YES);

            } else {
                System.out.println(NO);
            }

            */

            Set<Character> set = new HashSet<>() ;
            for(char c: inputStr){
                set.add(c) ;
            }
            if(set.size()%2 ==0){
                System.out.println(YES);
            }else{
                System.out.println(NO);
            }




        }
    }
}
