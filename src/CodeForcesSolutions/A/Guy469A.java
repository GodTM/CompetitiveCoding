package CodeForcesSolutions.A;

import java.util.*;

public class Guy469A {

    public static int[] insertionSort(int[] array){
        int[] ar= array ;

        for(int nextElement = 1; nextElement< array.length ; nextElement++){
            int key = array[nextElement] ;
            int current = nextElement - 1;
            while(current>= 0 && array[current]>key){
                array[current+1] = array[current] ;
                current-=1 ;
            }
            array[current+1] = key ;
        }
        return  ar ;
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int limit = Integer.parseInt(input.nextLine().trim()) ;
        int[] numbers = new int[limit] ;
        String[] in1 = input.nextLine().trim().split("\\s") ;
        String[] in2 = input.nextLine().trim().split("\\s") ;
        int[] in1Num = new int[in1.length - 1] ;
        int[] in2Num = new int[in2.length - 1] ;
        Set<Integer> integers = new HashSet<Integer>()  ;
        if(Integer.parseInt(in1[0])!=0) {
            for (int c = 1; c < in1.length; c++) {
                in1Num[c-1] = Integer.parseInt(in1[c]);
            }
        }
        in1Num= Guy469A.insertionSort(in1Num) ;
        if(Integer.parseInt(in2[0])!=0) {
            for (int counter = 1; counter < in2.length; counter++) {
                in2Num[counter - 1] = Integer.parseInt(in2[counter]);
            }
            in2Num = Guy469A.insertionSort(in2Num);
        }
        for(int counter = 0 ; counter< in1Num.length ; counter++){ integers.add(in1Num[counter]) ; }
        for(int counter = 0 ; counter< in2Num.length ; counter++){ integers.add(in2Num[counter]) ; }
        TreeSet<Integer> myTree = new TreeSet<>(integers) ;
        LinkedList<Integer> list = new LinkedList<>() ;
        list.addAll(myTree);

        boolean canPass = true ;
        if(list.size()!= limit){
            System.out.print("Oh, my keyboard!");
        }
        else{
            for(int counter = 0; counter< list.size()  ; counter++){
                if(counter!= list.get(counter) - 1){
                    canPass = false ;
                }
            }

            if(canPass){ System.out.print("I become the guy."); }

        }
    }
}