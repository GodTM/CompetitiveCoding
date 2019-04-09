//package CodeForcesSolutions.A;
import java.util.Scanner;
public class NewYear750A {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in) ;
        String[] inStr = in.nextLine().trim().split("\\s") ;
        int timeTaken = Integer.parseInt(inStr[1]) ;
        int numberOfProblems = Integer.parseInt(inStr[0]) ;
        int maxMins= 240 ;
        int count = 0 ;
        for(int c = 0 ; c< numberOfProblems ; c++){
            int solving= 5*(c+1) ;
            if(maxMins- solving< timeTaken){
                break ;
            }
            else{
                maxMins-= solving ;
                count+=1 ;
            }
        }
        System.out.print(count);


    }
}
