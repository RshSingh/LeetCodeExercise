package Node;

import java.util.List;

public class Graph {

  public int val;
  public List<Graph> neighbors;

  public Graph() {}

  public Graph(int _val, List<Graph> _neighbors) {
    val = _val;
    neighbors = _neighbors;
  }
}
