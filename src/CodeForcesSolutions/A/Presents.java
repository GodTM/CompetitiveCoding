package CodeForcesSolutions.A;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Presents {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in) ;
        LinkedList<Integer> list = new LinkedList<>() ;
        int size = Integer.parseInt(input.nextLine().trim()) ;
        String[] numbersStr = input.nextLine().trim().split("\\s") ;
        int[] numbers = new int[numbersStr.length]  ;
        for(int counter = 0 ; counter< numbersStr.length ; counter++){
            numbers[counter] = Integer.parseInt(numbersStr[counter]) ;
        }

        HashMap<Integer , Integer> map = new HashMap<>() ;

        for(int counter = 0 ; counter< numbers.length ; counter++){
            map.put(counter+1 , numbers[counter]) ;
        }
        int[] answer = new int[map.size()] ;
        for(Map.Entry<Integer,Integer> entrySet : map.entrySet()){
            answer[entrySet.getValue() -1]= entrySet.getKey() ;
        }

        for(int i:answer){
            System.out.print(i+" ");
        }







    }
}
