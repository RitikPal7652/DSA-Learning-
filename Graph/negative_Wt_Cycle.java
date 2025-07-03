package DSA.Graph;

import java.util.ArrayList;

public class negative_Wt_Cycle {
    public static class Edge{
        int src;
        int dest;
        int wt;
        //Constructor.
        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    public static void create_Graph(ArrayList<Edge>[] graph){
        //Placing an empty arraylist at each index of array
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,2,-4));

        graph[2].add(new Edge(2,3,2));

        graph[3].add(new Edge(3,4,4));

        graph[4].add(new Edge(4,1,-1));
    }
    public static void bellman_Ford(ArrayList<Edge>[] graph, int V, int src){
        int dist[]=new int[V];
        //Placing infinity at each index of array rather than 0th index.
        for(int i=0;i<V;i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }
        for(int k=0;k<V-1;k++){ //For looping/or run V-1 times.
            for(int i=0;i<V;i++){   //To travel on nodes.
                for(int j=0;j<graph[i].size();j++){// To find neighbours.
                    Edge e=graph[i].get(j);//To find edge.
                    int u=e.src;
                    int v=e.dest;

                    if(dist[u]!=Integer.MAX_VALUE  && dist[u]+e.wt<dist[v]){
                        dist[v]=dist[u]+e.wt;
                    }
                }
            }
        }
        for(int i=0;i<V;i++){
            for(int j=0;j<graph[i].size();j++){
                Edge e=graph[i].get(j);
                int u=e.src;
                int v=e.dest;

                if(dist[u]!=Integer.MAX_VALUE && dist[u]+e.wt<dist[v]) {
                    //dist[v] = dist[u] + e.wt;
                    System.out.println("Negative weight cycle");
                }
            }
        }
        //Print distance array
        for(int i=0;i<V;i++){
            System.out.print(dist[i]+"  ");
        }
    }
    public static void main(String[] args) {
        int V=5;
        ArrayList<Edge>[] graph=new ArrayList[V];
        create_Graph(graph);

        bellman_Ford(graph,V,0);
    }
}
