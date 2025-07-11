import java.util.*;
//creating graph usinh Arrayist
public class classRoom{
    static class Edge{
        int source;
        int destination;
        
        public Edge(int s , int d){
            this.source = s;
            this.destination = d;
        }
    }
    
    public static void createGraph(ArrayList<Edge> graph[]){
    //these are required for removing null value and inserting emply arraylist 
        for(int i=0;i<graph.length;i++){   
            graph[i] = new ArrayList<Edge>();
        }
        
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,3));
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,2));
    }
    public static void main(String[] args) {
      int V=4;
      ArrayList<Edge>[] graph=new ArrayList[V];
      createGraph(graph);
      for(int i=0;i<graph[1].size();i++){
          Edge e=graph[1].get(i);
          System.out.println(e.destination);
      }
    }
}
