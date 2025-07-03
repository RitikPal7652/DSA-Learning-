package DSA.Graph;

import java.util.ArrayList;
import java.util.Stack;

public class kosarajus_Algorithm {
    public static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
            //this.wt=w;
        }
    }
    public static void create_Graph(ArrayList<Edge>[] graph,int V){
        //Placing an empty arraylist at each index of array.
        for(int i=0;i<V;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));

        graph[1].add(new Edge(1,0));

        graph[2].add(new Edge(2,1));

        graph[3].add(new Edge(3,4));
    }
    public static void topSort(ArrayList<Edge>[] graph,int curr,boolean[] vis,Stack<Integer> st){
        //visited
        vis[curr]=true;
        //find neighbour
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                topSort(graph,e.dest,vis,st);
            }
        }
        st.push(curr);
    }
    public static void dfs(ArrayList<Edge>[] graph,int curr,boolean[] vis){
        vis[curr]=true;
        System.out.print(curr+" ");
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph,e.dest,vis);
            }
        }
    }
    public static void kosaraju_Algo(ArrayList<Edge>[] graph,int V){
        //Do perform topological sorting.
        //Step 1: - O(V+E)
        boolean[] vis=new boolean[V];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<V;i++){
            if(!vis[i]){
                topSort(graph,i,vis,st);
            }
        }

        /*
        At this time stack is full with all vertices by topSort.
        and all index of visited is also true.

        so either we make another visited array or again make all
        indexes false.
         */


        //Step 2: - O(V+E)
        ArrayList<Edge>[] transpose=new ArrayList[V];
        //place an empty arraylist at each index of arraylist.
        for(int i=0;i<graph.length;i++){
            vis[i]=false;//For step 3.
            transpose[i]=new ArrayList<>();
        }
        for(int i=0;i<V;i++){//Go on each vertex of graph.
            for(int j=0;j<graph[i].size();j++){
                Edge e=graph[i].get(j);//e.src->e.dest
                transpose[e.dest].add(new Edge(e.dest,e.src));
            }
        }

        //Step 3: - O(V+E)
        while(!st.isEmpty()){
            int curr=st.pop();
            //Do dfs on transpose graph
            if(!vis[curr]){
                dfs(transpose,curr,vis);
                System.out.println();
            }
        }

        //Overall time complexity: O(V+E)
    }
    public static void main(String[] args) {
        int V=5;
        ArrayList<Edge>[] graph=new ArrayList[V];
        create_Graph(graph,V);
        kosaraju_Algo(graph,V);
    }
}
