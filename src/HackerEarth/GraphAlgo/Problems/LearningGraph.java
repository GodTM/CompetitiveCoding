package HackerEarth.GraphAlgo.Problems;
import java.sql.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
public class LearningGraph {
    public class Graph{
        int V ,  E ;
        LinkedList[] adjList ;
        Graph(int V , int E){
            this.V = V ; this.E = E ;
            adjList = new LinkedList[this.V] ;
            for(LinkedList l: adjList){ l= new LinkedList() ; }
        }
        public void addEdge(int src , int destination){this.adjList[src].add(destination) ; }
        public void arrange(){
            for(int counter = 1 ; counter< adjList.length ; counter++) {
                if (adjList[counter].size() != 0) {
                    // arrange in ascending because of self loop
                    //if(adjList[counter].contains(counter)){ Collections.sort(adjList[counter]); }
                    // arrange is desc order
                    Collections.sort(adjList[counter], Collections.reverseOrder());
                }
            }
        }
    }
    public static void main(String args[]){
        Scanner input= new Scanner(System.in) ;
        String[] ins = input.nextLine().trim().split("\\s") ;
        int numberOfVertices = Integer.parseInt(ins[0]) ;
        int edges = Integer.parseInt(ins[1]) ;
        int iThElement = Integer.parseInt(ins[2]) ;
        String[] nodeStr = input.nextLine().trim().split("\\s") ;
        int[] nodes = new int[nodeStr.length] ;
        int max = 0 ;
        for(int c = 0 ; c< nodes.length ; c++){nodes[c] = Integer.parseInt(nodeStr[c]) ; if(nodes[c]> max){max = nodes[c] ; }}
        LearningGraph g = new LearningGraph() ;
        LearningGraph.Graph mainGraph = g.new Graph(max , edges) ;
        while(edges>0){
            String[] edgeStr = input.nextLine().trim().split("\\s") ;
            int src = Integer.parseInt(edgeStr[0]) ;
            int dest= Integer.parseInt(edgeStr[1]) ;
            mainGraph.addEdge(src , dest);
            edges-- ;
        }
        mainGraph.arrange();


    }
}
