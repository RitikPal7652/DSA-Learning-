package DSA.Graph;
import java.util.*;
public class cycleDetectionInUndirectedGraph {
    public static class Edge{
        int src;
        int dest;
        //Constructor.
        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }
    public static void create_Graph(ArrayList<Edge> graph[]){
        //Place empty arraylist at each index of array
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        //Undirected graph is there so we make like this.
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,4));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));
        //graph[1].add(new Edge(1,4));

        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,2));

        graph[4].add(new Edge(4,0));
        //graph[4].add(new Edge(4,1));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,4));
    }
    public static boolean cycleDetection(ArrayList<Edge> graph[],boolean[] visit,int curr,int parent){
        visit[curr]=true;
        //Go on all the neighbours
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);  //e.destination means neighbour.
            if(visit[e.dest]==true && parent!=e.dest)   return true;//Is my neighbour visited?
            else if(!visit[e.dest]){    //then we visited on it.
                if(cycleDetection(graph,visit,e.dest,curr)==true)   return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int V=6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        create_Graph(graph);

        boolean[] visit=new boolean[V];

        System.out.println(cycleDetection(graph,visit,0,-1));
        //Initialize parent as -1.
    }
}
