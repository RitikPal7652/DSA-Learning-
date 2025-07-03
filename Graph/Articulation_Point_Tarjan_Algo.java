package DSA.Graph;
import java.util.ArrayList;
public class Articulation_Point_Tarjan_Algo {
    public static class Edge{   //User defined data type
        int src;
        int dest;
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
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));

        graph[3].add(new Edge(3,0));
        graph[3].add(new Edge(3,4));

        graph[4].add(new Edge(4,3));
    }
    public static void Articulation_Point(ArrayList<Edge> graph[],int V){
        boolean[] vis=new boolean[V];
        int dt[]=new int[V];//discovery time.
        boolean[] articu=new boolean[V];
        int low[]=new int[V];
        int time=0;

        //Call for connected components
        for(int i=0;i<V;i++){
            if(!vis[i]){
                Tarjan_Dfs(graph,i,vis,-1,dt,low,time,articu);
            }
        }
        //Traverse on articulation array and check that which is articulation point
        for(int i=0;i<V;i++){
            if(articu[i]){
                System.out.println("Articulation Point is: "+i);
            }
        }
    }

    private static void Tarjan_Dfs(ArrayList<Edge>[] graph, int curr, boolean[] vis, int parent, int[] dt, int[] low,
                                   int time,boolean[] articulation) {
            vis[curr]=true;
            dt[curr]=low[curr]=++time;
            int children=0;

            //Find neighbours
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            int neigh=e.dest;
            if(parent==neigh){
                continue;
            }else if(vis[neigh]){  //If my neighbour is visited
                low[curr]=Math.min(low[curr],dt[neigh]);
            }else{
                Tarjan_Dfs(graph,neigh,vis,curr,dt,low,time,articulation);
                //Update neighbour
                low[curr]=Math.min(low[curr],low[neigh]);
                //Check is it Articulation Point
                if(dt[curr]<=low[neigh] && parent!=-1){
                    articulation[curr]=true;
                }
                children++;
            }
        }
        //Check Articulation Point for corner nodes
        if(parent==-1 && children>1){
            articulation[curr]=true;
        }
    }
    public static void main(String[] args) {
        int V=5;
        ArrayList<Edge> graph[]=new ArrayList[V];
        create_Graph(graph);

        Articulation_Point(graph,V);
    }
}
