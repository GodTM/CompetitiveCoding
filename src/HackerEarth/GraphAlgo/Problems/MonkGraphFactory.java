package HackerEarth.GraphAlgo.Problems;

import java.util.Scanner;

/*
Tree is connected and has no cycles while graphs can have cycles.
        Tree has exactly n-1 edges while there is no such constraint for graph.
        It is given that the input graph is connected. We need at least n-1 edges to connect n nodes.
        If we take the sum of all the degrees, each edge will be counted twice. Hence, for a tree with n vertices and n – 1 edges, sum of all degrees should be 2 * (n – 1).

*/
public class MonkGraphFactory {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in) ;
        int numberOfVertices = Integer.parseInt(input.nextLine().trim()) ;
        String[] degreesStr = input.nextLine().trim().split("\\s") ;
        int[] degrees = new int[degreesStr.length] ;
        int sum = 0 ;
        for(int counter = 0 ; counter< degrees.length ; counter++){ degrees[counter] = Integer.parseInt(degreesStr[counter]) ; sum+= degrees[counter] ; }

        if(sum== 2*(numberOfVertices - 1)){ System.out.print("Yes");}
        else{System.out.print("No");}

    }
}
