package HackerEarth.Others ;
import java.util.* ;

class Toggle{

    public static String toggle(String sentence){

        StringBuilder toggled = new StringBuilder(sentence.length()) ;
        for(char c : sentence.toCharArray()){
            if(Character.isUpperCase(c)){
                c = Character.toLowerCase(c) ;
            }
            else if(Character.isLowerCase(c)){
                c = Character.toUpperCase(c) ;
            }
            toggled.append(c) ;
        }
        return toggled.toString()    ;
    }
    public static void main(String args[]){

        Scanner input = new Scanner(System.in) ;
        String toBeToggled = input.nextLine().trim();

        String toggled = Toggle.toggle(toBeToggled) ;
        System.out.println(toggled) ;
    }
}