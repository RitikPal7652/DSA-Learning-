package DSA.Graph;

import java.util.ArrayList;

public class printAllPaths {
    public static class Edge{
        int src;
        int dest;

        //constructor.
        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }
    public static void create_Graph(ArrayList<Edge> graph[]){
        //First of all place empty ArrayList at each index of array.
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
    public static void printPaths(ArrayList<Edge>[] graph,int curr,boolean[] visit,String path,int target){
        //Base Case.
        if(curr==target){
            System.out.println(path);
            return;
        }
        //Traversing on all the neighbours.
        for(int i=0;i<graph[curr].size();i++) {
            Edge e = graph[curr].get(i);
            if (visit[e.dest]==false) {//If my neighbour is unvisited.
                visit[curr]=true;
                printPaths(graph,e.dest,visit,path+"->"+e.dest,target);
                visit[curr]=false;
            }
        }
        //Time Complexity : O(V^V).
    }
    public static void main(String[] args) {
        int V=7;
        ArrayList<Edge>[] graph=new ArrayList[V];
        create_Graph(graph);

        boolean[] visit=new boolean[V];
        int s=0;
        int d=5;
        printPaths(graph,0,visit,"0",d);
    }
}
