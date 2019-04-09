package CodeForcesSolutions.A;
import java.util.Scanner;
public class NewYear723A {

    public static void insertionSort(int[] arr){
        for(int nextElement = 1 ; nextElement< arr.length ; nextElement++){
            int key = arr[nextElement] ;
            int current = nextElement - 1;
            while(current>=0 && arr[current]> key){
                arr[current+1] = arr[current] ;
                current-=1 ;
            }
            arr[current+1] = key ;
        }
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String[] inStr = in.nextLine().trim().split("\\s");
        int[] array = new int[inStr.length] ;
        for(int c = 0 ; c< array.length ; c++){ array[c] = Integer.parseInt(inStr[c]) ; }
        NewYear723A.insertionSort(array);
        int min = Integer.MAX_VALUE ;
        for(int counter = array[0] ; counter<= array[2] ; counter++){
            int diff  = Math.abs(array[0]-counter) + Math.abs(array[1] - counter) + Math.abs(array[2]-counter) ;
            if(diff< min){
                min = diff ;
            }
        }

        System.out.print(min);
    }
}
