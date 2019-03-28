package CodeForcesSolutions.A;

import java.util.Scanner;

public class DominoPiling {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in) ;
        String[] inputs = input.nextLine().trim().split("\\s") ;
        int dim1 = Integer.parseInt(inputs[0].trim()) ;
        int dim2 = Integer.parseInt(inputs[1].trim()) ;
        int numberOfDomino = 0 ;
        if(dim1>=1 && dim2>=1  && dim1<=16 && dim2<=16){
           int out = (dim1* dim2) / 2 ;
           System.out.println(out);
        }


    }
}
