package CodeForcesSolutions.A;

import java.util.Scanner;

public class Twins160A {

    public static int[] insertionSort(int[] ar){
        int[] arr = ar ;
        for(int nextElement = 1 ; nextElement< arr.length ; nextElement++){

            int key = arr[nextElement] ;
            int currentElement = nextElement - 1;
            while(currentElement>= 0 && arr[currentElement]>key){
                arr[currentElement+1] = arr[currentElement] ;
                currentElement-=1 ;
            }
            arr[currentElement+1] = key ;
        }
        return arr ;
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in) ;
        int numberOfCoins = Integer.parseInt(input.nextLine().trim());
        String[] allCoins = input.nextLine().trim().split("\\s");
        int[] normalArr = new int[allCoins.length] ;
        for(int counter = 0; counter < normalArr.length;counter++){
            normalArr[counter] = Integer.parseInt(allCoins[counter])  ;
        }
        if(allCoins.length==numberOfCoins){
            int totalValue = 0 ;
            for(int counter =0 ; counter< allCoins.length;counter++){ totalValue+= Integer.parseInt(allCoins[counter].trim()) ; }
            int remValue = totalValue ;
            int[] sorted = Twins160A.insertionSort(normalArr) ;
            boolean minTaken = false;
            int taken = 0 ;
            int numCoinsTaken = 0 ;
            while(!minTaken){
                for(int counter = sorted.length-1 ; counter>=0 ; counter--){
                    taken+= sorted[counter] ;
                    remValue -= sorted[counter] ;
                    numCoinsTaken+=1 ;
                    if(taken>remValue){
                        minTaken = true ;
                        break ;
                    }
                }
            }

            System.out.println(numCoinsTaken);

        }
    }
}
