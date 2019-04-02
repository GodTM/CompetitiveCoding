package HackerEarth.GraphAlgo;
/*
*  The Union and find complexity are linear O(n)
* */


public class UnionFindNaive {
    int V , E ;
    Edge[] edges ;

    public class Edge{ int src , destination ;}
    public UnionFindNaive(int V , int E){
        this.V = V ; this.E = E ;
        edges = new Edge[E] ;
        for(Edge e:edges){ e = new Edge() ; }
    }

    public int find(int[] parent , int i){
        if(parent[i]==-1){
            return i ;
        }
        return find(parent , parent[i]) ;
    }

    public void Union(int[] parent , int x , int y){
        int xRoot = find(parent , x) ;
        int yRoot = find(parent , y) ;
        parent[xRoot] = yRoot ;
    }

    int isCycle(UnionFindNaive u){
        int[] parent = new int[u.V] ;

        // initialize all parents as -1 ;
        for(int counter = 0 ; counter< parent.length ; counter++){ parent[counter]=-1 ; }

        for(int counter = 0 ; counter< u.E ; counter++)

        {
            int srcRoot  = find( parent , u.edges[counter].src) ;
            int destRoot = find(parent , u.edges[counter].destination) ;
            if(srcRoot==destRoot)
            {
                return 1 ;
            }
            u.Union(parent , srcRoot, destRoot);
        }

        return  0;

    }


}
