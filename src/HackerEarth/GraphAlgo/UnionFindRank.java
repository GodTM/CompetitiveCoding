package HackerEarth.GraphAlgo;

public class UnionFindRank {
    int V , E ;
    Edge[] edges ;
    class Edge{ int src , destination ;}
    public UnionFindRank(int V , int E){
        this.V = V ; this.E = E ;
        for(int counter = 0; counter< E ; counter++){ edges[counter] = new Edge() ; }
    }
    class Subsets{ int parent , rank ; }

    public int find(Subsets[] subsets , int i){
        if(subsets[i].parent!= i){
            subsets[i].parent = find(subsets , subsets[i].parent) ;
        }
        return  subsets[i].parent ;
    }

    public void Union(Subsets[] subsets , int x , int y){
        int xRoot = find(subsets , x) ;
        int yRoot = find(subsets , y) ;
        if(subsets[xRoot].rank> subsets[yRoot].rank)
        {
            subsets[yRoot].parent = xRoot ;
        }

        else if(subsets[xRoot].rank< subsets[yRoot].rank)
        {
            subsets[xRoot].parent = yRoot ;
        }
        else
            {
                subsets[xRoot].parent = yRoot ;
                subsets[yRoot].rank+=1 ;
            }
    }

    public int isCyclic(UnionFindRank u){
        int V = u.V ;
        int E = u.E ;
        Subsets[] sets = new Subsets[V] ;
        for(int counter = 0 ; counter< V ; counter ++){
            sets[counter] = new Subsets() ;
            sets[counter].rank = 0 ;
            sets[counter].parent = counter ;
        }

        for(int e = 0 ; e< E ; e++){
            int srcRoot = find(sets, u.edges[e].src) ;
            int destRoot = find(sets , u.edges[e].destination) ;
            if(srcRoot==destRoot){ return  1 ; }
            Union(sets , srcRoot , destRoot);
        }
        return  0 ;
    }
}
