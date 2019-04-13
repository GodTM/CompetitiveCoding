package CodeForcesSolutions.A;
import java.util.LinkedList;
import java.util.Scanner;
public class GrasshopperString733A {
    public static boolean vowelFound(String s){ return (s.equals("A") || s.equals("E")|| s.equals("I")|| s.equals("O") || s.equals("U") || s.equals("Y")) ; }
    public static boolean containsVowel(String s){ return (s.contains("A") ||s.contains("E") || s.contains("I")|| s.contains("O") || s.contains("U") || s.contains("Y")) ;  }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in) ;
        String string = input.nextLine().trim() ;
        String[] inStr = string.split("") ;
        LinkedList<Integer> indexes = new LinkedList<>() ;
        if(GrasshopperString733A.containsVowel(string)) {
            for(int counter = 0 ; counter< inStr.length ; counter++){ if(GrasshopperString733A.vowelFound(inStr[counter])){ indexes.add(counter) ;} }
            int maxDistance = 0 ;
            int continuous = 0 ;
            for(int counter = 0 ; counter< indexes.size() ;counter++){
                if(counter== 0||counter== indexes.size()-1  ){
                    if(counter==0) {
                        continuous = 1 + indexes.get(counter);
                        if (continuous> maxDistance){ maxDistance = continuous ;  continuous=0 ; }
                    }
                    if(counter== indexes.size()-1){
                        continuous = (inStr.length   - indexes.get(counter)) ;
                        if (continuous> maxDistance){ maxDistance = continuous ;  continuous=0 ; }
                    }
                    if (continuous> maxDistance){ maxDistance = continuous ;  continuous=0 ; }
                }
                if(counter< indexes.size()-1){
                   continuous = Math.abs(indexes.get(counter)  - indexes.get(counter+1)) ;
                   if(continuous> maxDistance){maxDistance = continuous ;  continuous=0 ;}
                }

            }
            System.out.println(maxDistance);

        }
        else{
            System.out.println(string.length() + 1 );
        }

    }

}
