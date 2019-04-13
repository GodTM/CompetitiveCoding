package CodeForcesSolutions.A;
import java.util.HashMap;
import java.util.Scanner;
public class Lecture499B {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in) ;
        String[] inStr = input.nextLine().split("\\s") ;
        int n = Integer.parseInt(inStr[0]) ;
        int m = Integer.parseInt(inStr[1]) ;
        HashMap< HashMap<String , String> , Integer> map =  new HashMap< HashMap<String, String>, Integer>() ;
        HashMap<String , String> newMap = new HashMap<>()  ;
        for(int counter = 0 ; counter< m ; counter++){
            String[] inputStrings=  input.nextLine().trim().split("\\s") ;
            newMap.put(inputStrings[0] , inputStrings[1]) ;
            map.put(newMap, inputStrings[0].length() - inputStrings[1].length());
        }

        String[] words = input.nextLine().trim().split("\\s") ;
        String out = "" ;
        for(int counter = 0 ; counter< words.length ; counter++){
            String key = newMap.get(words[counter]) ;
            if(key.length() - words[counter].length() >0){
                out = out.concat(words[counter]+" ") ;
            }
            else if(key.length() - words[counter].length() <0){
                out = out.concat(key+" ") ;
            }
            else{
                out= out.concat(words[counter]+" ") ;
            }
        }

        System.out.println(out);


    }
}
