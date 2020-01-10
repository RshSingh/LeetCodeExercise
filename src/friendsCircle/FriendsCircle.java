package friendsCircle;

import java.util.LinkedList;
import java.util.Queue;

public class FriendsCircle {

  public static void main(String[] args) {

  }

  public int friendCircleNum(int[][] friends) {
    int count = 0;
    for(int i = 0; i < friends.length; i++) {
      if(friends[i][i] == 1)  {count++;
        BFS(i, friends);
      }
    }

    return count;
  }

  public void BFS(int student, int[][] friends) {
    Queue<Integer> queue = new LinkedList<>();
    queue.add(student);
    while(queue.size() > 0) {
      int queueSize = queue.size();
      for(int i = 0; i < queueSize; i ++) {
        int j = queue.poll();
        friends[j][j] = 2;
        for(int k = 0; k < friends.length; k++)
          if(friends[j][k] ==1 && friends[k][k] ==1) queue.add(k);
      }
    }
  }
}
