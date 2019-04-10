package CodeForcesSolutions.A;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class Laptops456A {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in) ;
        SortedMap<Integer, Integer> tree = new TreeMap<>() ;
        int numberOfLaptops = Integer.parseInt(in.nextLine().trim()) ;
        while(numberOfLaptops>0){
            String[] inStr = in.nextLine().trim().split("\\s") ;
            tree.put(Integer.parseInt(inStr[0]) , Integer.parseInt(inStr[1])) ;
            numberOfLaptops-- ;
        }
        boolean dimaIsRight = true ;
        int currentValue = 0 ;
        for(Map.Entry<Integer , Integer> entrySet: tree.entrySet()){
            int value = entrySet.getValue() ;
            if(currentValue<value){ currentValue = value ;}
            else{dimaIsRight = false ;}
        }

        if(dimaIsRight){ System.out.println("Poor Alex");}
        else{System.out.println("Happy Alex");}



    }

}
