//package CodeForcesSolutions;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
/*
    The String only contains Uppercase and lowerCase letters

    // checklist:
    check whether the string is of appropriate length  and verify that it is not a blank string
    //
*/
public class StringTask {

    public static boolean containsOnlyAlpha(String s){

        return (s.matches("[a-zA-Z]+")
                ) ;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String sample = input.nextLine().trim();

        if (sample != null) {
            String[] inputArr = sample.trim().split("");
            String[] vowels = "aeiouy".trim().split("");

            // check whether the length of the string is optimum
            if (inputArr.length >= 1 && inputArr.length <= 100 /*&& !sample.equals("")*/) {
                boolean onlyAlpha = StringTask.containsOnlyAlpha(sample);

                if (onlyAlpha) {
                    LinkedList<String> list = new LinkedList<String>();
                    for (int counter = 0; counter < inputArr.length; counter++) {
                        inputArr[counter] = inputArr[counter].trim();
                        // Z is the last ASCII character at 90
                        if (inputArr[counter].charAt(0) <= 90) {
                            inputArr[counter] = inputArr[counter].toLowerCase();

                        }
                        list.add(inputArr[counter]) ;

                    }

                    String out = "" ;
                    Iterator<String> iterator = list.listIterator() ;
                    while(iterator.hasNext()){
                        String nextStr = iterator.next() ;
                        for(String v:vowels){
                            if(v.equals(nextStr)){
                                iterator.remove() ;
                            }
                        }

                    }
                    for(String s: list){
                        out =  out.concat(s) ;
                    }
                    //System.out.println(out);
                    int externalCount = 0 ;
                    String output = "" ;
                    String[] newList = new String[list.size()*2] ;
                    for(int counter = 0 ; counter< newList.length ; counter++){
                        if(counter%2==0){
                            newList[counter]= "." ;
                        }
                        else{
                            newList[counter] = list.get(externalCount) ;
                            externalCount++ ;

                        }
                        output = output.concat(newList[counter]) ;
                    }
                    System.out.println(output);
                }
            }

        }
    }
}
