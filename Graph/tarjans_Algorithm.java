package DSA.Graph;

import java.util.ArrayList;

public class tarjans_Algorithm {
    public static class Edge{
        int src;
        int dest;
        int wt;
        //Constructor.
        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
            //this.wt=w;
        }
    }
    public static void create_Graph(ArrayList<Edge>[] graph){
        //Placing an empty arraylist at each index of array
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
        //graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,3));
        //graph[4].add(new Edge(4,5));

        //graph[5].add(new Edge(5,3));
        //graph[5].add(new Edge(5,4));
    }
    public static void dfs(ArrayList<Edge>[] graph,int curr,boolean[] vis,
                int[] disCvPnt,int[] lowDisCvPnt,int time,int parent){
        vis[curr]=true;
        disCvPnt[curr]=lowDisCvPnt[curr]=++time;

        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);

            if(e.dest==parent) {
                continue;
            }
            else if(!vis[e.dest]){
                dfs(graph,e.dest,vis,disCvPnt,lowDisCvPnt,time,curr);

                lowDisCvPnt[curr]=Math.min(lowDisCvPnt[curr],lowDisCvPnt[e.dest]);
                //Check if bridge is present or not.
                if(disCvPnt[curr]<lowDisCvPnt[e.dest]){
                    System.out.println("Bridge is: "+curr +"----->"+e.dest);
                }
            }else{
                lowDisCvPnt[curr]=Math.min(lowDisCvPnt[curr],disCvPnt[e.dest]);
            }
        }
    }
    public static void tarjanAlgo(ArrayList<Edge>[] graph,int V){
       int[] disCvPnt=new int[V];
       int[] loDisCvPnt=new int[V];
       boolean[] vis=new boolean[V];
       int time=0;

       //May be our graph in our components
        for(int i=0;i<V;i++){
            if(!vis[i]){
                dfs(graph,i,vis,disCvPnt,loDisCvPnt,time,-1);
            }
        }
        //It is just a helper function main function is our dfs functionn.
    }
    public static void main(String[] args) {
        int V=6;
        ArrayList<Edge>[] graph=new ArrayList[V];
        create_Graph(graph);

        tarjanAlgo(graph,V);
    }
}
