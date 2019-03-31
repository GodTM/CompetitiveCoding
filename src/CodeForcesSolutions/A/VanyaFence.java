package CodeForcesSolutions.A;

import java.util.Scanner;

public class VanyaFence {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String[] inputStr = input.nextLine().trim().split("\\s") ;
        int numberOfPeople= Integer.parseInt(inputStr[0]) ;
        int maxHeight = Integer.parseInt(inputStr[1]) ;
        String[] heights = input.nextLine().trim().split("\\s") ;
        int exceeding = 0 ;
        int inLimit = 0;
        for(String s: heights){
            if(Integer.parseInt(s)>maxHeight){
                exceeding+= 1 ;
            }
            else{
                inLimit+=1 ;
            }
        }
        System.out.println(exceeding*2 + inLimit);
    }
}
