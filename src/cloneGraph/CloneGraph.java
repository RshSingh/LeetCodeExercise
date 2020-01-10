package cloneGraph;

import Node.Graph;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class CloneGraph {

  public static void main(String[] args) {
    Graph graph = new Graph(1, new ArrayList<>());

    cloneGraph(graph);
  }


  public static Graph cloneGraph(Graph graph) {
    if(graph == null) return null;

    Map<Graph, Graph> map = new HashMap<>();

    Queue<Graph> queue = new LinkedList<>();
    map.put(graph, new Graph(graph.val, new ArrayList<>()));
    queue.add(graph);

    while(!queue.isEmpty()) {
      Graph temp = queue.poll();

      for(Graph ngbrs:temp.neighbors) {
        if(!map.containsKey(ngbrs)) {
          map.put(ngbrs, new Graph(ngbrs.val, new ArrayList<>()));
          queue.add(ngbrs);
        }

        map.get(temp).neighbors.add(map.get(ngbrs));
      }
    }

    return map.get(graph);
  }
}
