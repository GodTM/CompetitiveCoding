package HackerEarth.GraphAlgo;

import java.util.Arrays;
import java.util.LinkedList;
/**
 * Explanation of Algorithm :
 *  In each subsets array, The subset objects are arranged by their ranks
 *  the Union-Find Algorithm is used to detect cycles in the individual subsets,
 *
 * */

public class Kruskal {
    int V , E ;
    int[][] AdjArray ;
    LinkedList[] adjList ;
    Edge[] edges ;
    public Kruskal(int V , int E){
        this.E = E ; this.V = V ;
        this.adjList = new LinkedList[V] ;
        for(LinkedList list: adjList){ list = new LinkedList() ; }
        AdjArray = new int[V][V] ;
        this.edges = new Edge[this.E] ;
        for(Edge e: edges){e = new Edge(); }
     }

    public class Edge implements Comparable<Edge>{
        int source, destination, weight ;
        @Override
        public int compareTo(Edge o) { return this.weight - o.weight ; }
    }

    public class Subset{ int parent, rank;}

    // returns the parent of the current Node
    int find(Subset sets[] , int i){
        if(sets[i].parent!= i)
            sets[i].parent = find(sets , sets[i].parent) ;
        return  sets[i].parent ;
    }

    void Union(Subset set[], int x , int y){
        int xRoot = find(set , x) ;
        int yRoot = find(set, y) ;
        if(set[xRoot].rank< set[yRoot].rank){
            set[xRoot].parent = yRoot ;
        }else if( set[xRoot].rank > set[yRoot].rank){
            set[yRoot].parent = xRoot ;
        }
        else{
            set[yRoot].parent  = xRoot ;
            set[xRoot].rank+=1 ;
        }
    }


    public void Kruskal(){
        // this is the result set of edges visited in the MST
        Edge[] result = new Edge[this.V] ;
        int counter = 0 , e = 0 ;
        for(counter = 0; counter< this.V ; counter++){ result[counter]  = new Edge() ; }
        Arrays.sort(edges);

        // allocate memory for creating V subsets
        Subset[] sets = new Subset[this.V] ;
        for(counter = 0 ; counter<V ; counter++){
            sets[counter] = new Subset();
            sets[counter].rank= 0 ;
            sets[counter].parent = counter ;
        }

        // number of edges in the MST have to be MST for the MST to be Acyclic
        int i = 0 ;
        while(e<this.V-1) {
            Edge nextEdge = edges[i++];
            int x = find(sets , nextEdge.source) ;
            int y = find(sets , nextEdge.destination);
            // x!= y suggests that the
            if(x!=y){
                result[e++] = nextEdge ;
                Union(sets , x , y );
            }
        }

    }

    public  static  void main(String args[]){

        int V = 4;  // Number of vertices in graph
        int E = 5;  // Number of edges in graph
        Kruskal graph = new Kruskal(V, E);

        // add edge 0-1
        graph.edges[0].source = 0;
        graph.edges[0].destination = 1;
        graph.edges[0].weight = 10;

        // add edge 0-2
        graph.edges[1].source = 0;
        graph.edges[1].destination = 2;
        graph.edges[1].weight = 6;

        // add edge 0-3
        graph.edges[2].source = 0;
        graph.edges[2].destination = 3;
        graph.edges[2].weight = 5;

        // add edge 1-3
        graph.edges[3].source = 1;
        graph.edges[3].destination = 3;
        graph.edges[3].weight = 15;

        // add edge 2-3
        graph.edges[4].source = 2;
        graph.edges[4].destination = 3;
        graph.edges[4].weight = 4;

    }


}
