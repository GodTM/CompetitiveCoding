package HackerEarth.GraphAlgo.Problems;
import java.util.LinkedList;
import java.util.Scanner;
public class MonkRealEstate {
    public static void main(String args[]){
     Scanner input = new Scanner(System.in) ;
     int testCases = Integer.parseInt(input.nextLine().trim()) ;
     while(testCases>0){
         int numberOfEdges = Integer.parseInt(input.nextLine().trim()) ;
         LinkedList<Integer> list= new LinkedList<>() ;
         for(int counter = 0 ; counter< numberOfEdges ; counter++) {
             String[] edges = input.nextLine().trim().split("\\s");
             int start = Integer.parseInt(edges[0]);
             int end = Integer.parseInt(edges[1]);
             if (!(list.contains(start))) {
                 list.add(start);
             }
             if (!(list.contains(end))) {
                 list.add(end);
             }
         }
         System.out.println(list.size());
         testCases-- ;
     }
    }
}
