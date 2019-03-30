package CodeForcesSolutions.A;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Expression {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in) ;
        int one  = Integer.parseInt(input.nextLine().trim()) ;
        int two  = Integer.parseInt(input.nextLine().trim()) ;
        int three= Integer.parseInt(input.nextLine().trim()) ;

        LinkedList<Integer> list = new LinkedList<>() ;
        int[] array = {one , two , three} ;
        //Arrays.sort(array);
        list.add(array[0] + array[1] * array[2]) ;
        list.add(array[0]* (array[1]+ array[2])) ;
        list.add(array[0] * array[1] * array[2]) ;
        list.add((array[0] + array[1]) * array[2]) ;
        list.add(array[0] + array[1] + array[2]) ;


        int max = 0 ;
        for(int counter = 0 ; counter< list.size() ; counter++){
            if(list.get(counter)> max){
                max = list.get(counter) ;
            }
        }
        System.out.println(max);

    }
}
