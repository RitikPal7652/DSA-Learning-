package DSA.Graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class dijkstras_Algorithm {
    public static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    public static class Pair implements Comparable<Pair>{
        /*
        Koi bhi class hoti hai or usme mujhe soting krani hoti hai or decide
        krna hota hai ki sorting kis base pe honi chahiye to mai comparavle
        class kaa use krta hu.
         */
        int node;
        int dist;
        //Constructor.
        public Pair(int n,int d){
            this.node=n;
            this.dist=d;
        }

        //We are overriding bcoz we have to sort on the basis of distance.
        /*
        1. If compare function return -1 means this pair value is negative.
        2. If compare function return 0 means both value are equal.
        3. If compare function return 1 means our this pair value is greater.
         */
        @Override
        public int compareTo(Pair p) {
            return this.dist-p.dist;
        }
    }
    public static void create_Graph(ArrayList<Edge>[] graph){
        //Creating an empty arraylist at each index of array.
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,7));

        graph[2].add(new Edge(2,4,3));

        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,3,2));
        graph[4].add(new Edge(4,5,5));
    }

    public static void Dijkstras_Algo(ArrayList<Edge>[] graph,int src,int V) {
        /*
        Time-Complexity: O(E + E*logV)
         */

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int[] dist=new int[V];
        //Placing infinity at each index of array.
        for(int i=0;i<V;i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }

        boolean[] visit=new boolean[V];
        //Add first pair in priority queue.
        pq.add(new Pair(0,0));

        while(!pq.isEmpty()) { //Loop run till pq is not empty.
            Pair curr = pq.remove();//shortest
            if (!visit[curr.node]) { //means it is false.
                visit[curr.node] = true;
                //Neighbours.
                for (int i = 0; i < graph[curr.node].size(); i++) {
                    Edge e = graph[curr.node].get(i);
                    int u = e.src;
                    int v = e.dest;

                    if (dist[u] + e.wt < dist[v]) {  //Relaxation
                        dist[v] = dist[u] + e.wt;
                        pq.add(new Pair(v,dist[v]));
                    }
                }
            }
        }
        for(int i=0;i<V;i++){
            System.out.print(dist[i]+" ");
        }
        System.out.println();
}
    public static void main(String[] args) {
        int V=6 ;
        ArrayList<Edge>[] graph=new ArrayList[V];
        create_Graph(graph);

        Dijkstras_Algo(graph,0,V);
    }
}
