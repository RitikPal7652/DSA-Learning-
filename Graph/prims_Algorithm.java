package DSA.Graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class prims_Algorithm {
    public static class Edge{
        int src;
        int dest;
        int wt;
        //Constructor
        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    public static void create_Graph(ArrayList<Edge> graph[]){
        //Place empty arraylist at each index of array.
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,10));
        graph[0].add(new Edge(0,2,15));
        graph[0].add(new Edge(0,3,30));

        graph[1].add(new Edge(1,0,10));
        graph[1].add(new Edge(1,3,40));

        graph[2].add(new Edge(2,0,15));
        graph[2].add(new Edge(2,3,50));

        graph[3].add(new Edge(3,0,30));
        graph[3].add(new Edge(3,1,40));
        graph[3].add(new Edge(3,2,50));
    }
    public static class Pair implements Comparable<Pair>{
        int node;
        int cost;
        //Constructor.
        public Pair(int n,int c){
            this.node=n;
            this.cost=c;
        }
        @Override
        public int compareTo(Pair p2){
            return this.cost-p2.cost;
        }
    }
    public static void prims_Algo(ArrayList<Edge>[] graph,int V){
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        boolean vis[]=new boolean[V];

        //First add (0,0) in priority queue so that we can do our work.
        pq.add(new Pair(0,0));
        int mstCost=0;

        while(!pq.isEmpty()){
            Pair curr=pq.remove();
            if(!vis[curr.node]) { //If element is not visited in the array.
                vis[curr.node]=true;
                mstCost+=curr.cost;
                //Find neighbour.
                for(int i=0;i<graph[curr.node].size();i++){
                    Edge e=graph[curr.node].get(i);

                    if(!vis[e.dest]){
                        pq.add(new Pair(e.dest,e.wt));
                    }
                }
            }
        }
        System.out.println("Minimum cost of mst: "+mstCost);
    }
    public static void main(String[] args) {
        int V=4;
        ArrayList<Edge> graph[] =new ArrayList[V];
        create_Graph(graph);

        prims_Algo(graph,V);
    }
}
