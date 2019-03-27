package CodeForcesSolutions.A;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class ChatRoom {

    public static void main(String args[]){

        LinkedList<String> toBeProcessed = new LinkedList<String>() ;
        Scanner input = new Scanner(System.in) ;
        String[] inStr = input.nextLine().trim().split("") ;
        for(int counter= 0 ; counter<inStr.length ; counter++){
            if(counter==0){
                if(!inStr[counter].equals(inStr[counter+1])){
                    toBeProcessed.add(inStr[counter]) ;
                    continue;
                }
            }
            //end element
            else if(counter == inStr.length - 1){
                if(! inStr[counter].equals(inStr[counter-1])){
                    toBeProcessed.add(inStr[counter]) ;
                    continue;
                }
            }
            // middle element
            else{
                if(( inStr[counter].equals(inStr[counter+1]) || inStr[counter].equals(inStr[counter-1]))){
                    if(! toBeProcessed.contains(inStr[counter])){
                        toBeProcessed.add(inStr[counter]) ;
                    }
                }
                else{
                    toBeProcessed.add(inStr[counter]) ;
                }
            }
        }

        String processing ="" ;
        Iterator<String> iterator = toBeProcessed.listIterator() ;
        while(iterator.hasNext()){
            String s = iterator.next() ;
            processing = processing.concat(s) ;
        }

        if(processing.contains("helo")){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }


    }
}
