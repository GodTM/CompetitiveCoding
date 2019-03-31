package CodeForcesSolutions.A;

import java.util.Scanner;

public class GravityFlip {
    public static int[] insertionSort(int[] array){
        int[] a = array ;
        for(int nextElement = 1 ; nextElement< array.length ; nextElement++){
            int key = array[nextElement] ;
            int currentElement = nextElement - 1;
            while(currentElement>=0 && array[currentElement]>key){
                array[currentElement+1] = array[currentElement] ;
                currentElement-= 1 ;
            }
            array[currentElement+1] = key ;

        }
        return  a ;
    }

    public static void main(String args[]){


        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine().trim()) ;
        String[] inpStr = input.nextLine().trim().split("\\s") ;
        int[] arr = new int[inpStr.length] ;
        for(int c = 0 ; c< arr.length ; c++){
            arr[c]= Integer.parseInt(inpStr[c]) ;
        }
        int[] out = GravityFlip.insertionSort(arr) ;
        for(int i: out){
            System.out.print(i+" ");
        }

    }
}
