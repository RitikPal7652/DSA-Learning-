package DSA.Graph;
import java.util.ArrayList;

public class dfs_Traversal {
    public static class Edge{
        int src;
        int dest;
        //int wt;
        //Constructor
        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
            //this.wt=w;
        }
    }
    public static void create_Graph(ArrayList<Edge>[] graph){
        //To place non-empty ArrayList at each index of array.
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(3,2));
        graph[4].add(new Edge(3,3));
        graph[4].add(new Edge(3,5));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));

        graph[6].add(new Edge(6,5));
    }
    public static void dfsTraversal(ArrayList<Edge>[] graph,int curr,boolean[] vis){
        if(vis[curr]==true) return; //Base Case
        System.out.print(curr+" ");
        vis[curr]=true;

        //Find Neighbours
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            dfsTraversal(graph,e.dest,vis); //Recursive Call.
        }
    }
    public static void main(String[] args) {
        int V=7;
        ArrayList<Edge>[] graph=new ArrayList[V];
        create_Graph(graph);
        boolean[] vis=new boolean[V];

        System.out.println("Depth First Search is: ");
        dfsTraversal(graph,0,vis);

    }
}
