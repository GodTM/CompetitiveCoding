package CodeForcesSolutions.A;

import java.util.Scanner;

public class NearlyLuckyNumber110A {
    public static String four = "4" ;
    public static String seven= "7" ;
    public static int count = 0;

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String[] strings = input.nextLine().trim().split("") ;
        boolean pureLucky = true ;
        for(int counter = 0; counter< strings.length ; counter++){
            if( !(strings[counter].equals(four) || strings[counter].equals(seven)) ){
                pureLucky = false ;
            }
            if(strings[counter].equals(four) || strings[counter].equals(seven)){
                count+= 1 ;
            }
        }
        if(pureLucky && !(count==4 || count==7)){
            System.out.println("NO");
        }
        else{
            if(count==4 || count==7){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }

    }
}
