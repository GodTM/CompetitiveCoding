package CodeForcesSolutions.A;
/*

incomplete
*/
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AmusingJoke {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        TreeMap<String, Integer> initialMap = new TreeMap<>() ;
        String[] first = input.nextLine().trim().split("") ;
        String[] second = input.nextLine().trim().split("") ;
        // setting up counts
        for(String s: first) {
            if (!initialMap.containsKey(s)){ initialMap.put(s,1) ; }
            else{ initialMap.put(s , initialMap.get(s)+1); }
        }
        for(String s: second){
            if (!initialMap.containsKey(s)){ initialMap.put(s,1) ; }
            else{ initialMap.put(s , initialMap.get(s)+1); }
        }

        // second treemap ;
        String[] toBeCompared = input.nextLine().trim().split("") ;
        TreeMap<String , Integer> toBeComparedMap  = new TreeMap<>() ;
        for(String s: toBeCompared){
            if (!(toBeComparedMap.containsKey(s))){ toBeComparedMap.put(s,1) ; }
            else{ toBeComparedMap.put(s , toBeComparedMap.get(s)+1); }
        }

        boolean containsAll = true ;
        for(Map.Entry<String , Integer> toBeComparedEntrySet: toBeComparedMap.entrySet()) {
            if (initialMap.containsKey(toBeComparedEntrySet.getKey())) {
                int value = initialMap.get(toBeComparedEntrySet.getKey());
                int value2 = toBeComparedMap.get(toBeComparedEntrySet.getKey()) ;
                if (value == value2) {
                    continue;
                } else {
                    containsAll = false;
                    break;
                }
            } else {
                containsAll = false;
                break;
            }
        }


        for(Map.Entry<String , Integer> initialSet: initialMap.entrySet()) {
            if (toBeComparedMap.containsKey(initialSet.getKey())) {
                int value = toBeComparedMap.get(initialSet.getKey());
                int value2 = initialMap.get(initialSet.getKey()) ;
                if (value == value2) {
                    continue;
                } else {
                    containsAll = false;
                    break;
                }
            } else {
                containsAll = false;
                break;
            }
        }

        if(containsAll){System.out.println("YES");}
        else{System.out.println("NO"); }


    }
}
