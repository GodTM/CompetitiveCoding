package CodeForcesSolutions.A;

import java.util.Scanner;

public class YoungPhy69A {
    static int add(int[]arr){
        int sum = 0 ;
        for(int s:arr){
            sum+= s ;
        }
        return  sum;
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in) ;
        int numberOfCoords = Integer.parseInt(input.nextLine().trim()) ;
        int[] x , y , z ;
        x = new int[numberOfCoords] ;
        y = new int[numberOfCoords] ;
        z = new int[numberOfCoords] ;
        int counter =0;
        while(numberOfCoords>0){
            String[] in = input.nextLine().trim().split("\\s") ;
            x[counter] = Integer.parseInt(in[0]) ;
            y[counter] = Integer.parseInt(in[1]) ;
            z[counter] = Integer.parseInt(in[2]) ;
            counter++ ;
            numberOfCoords-- ;
        }

        if(YoungPhy69A.add(x)==0 && YoungPhy69A.add(y)==0 && YoungPhy69A.add(z)==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
