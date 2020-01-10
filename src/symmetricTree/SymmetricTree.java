package symmetricTree;

import Node.TreeNode;
import java.util.Deque;
import java.util.LinkedList;

public class SymmetricTree {

  public static void main(String[] args) {

    TreeNode root = new TreeNode(2);
    root.left = new TreeNode(1);
    root.left.left = new TreeNode(1);
    root.right = new TreeNode(3);

    System.out.println(symmetricTree(root));
    System.out.println(symmetricTreeIterative(root));

    root = new TreeNode(2);
    root.left = new TreeNode(1);
    root.right = new TreeNode(1);

    System.out.println(symmetricTree(root));
    System.out.println(symmetricTreeIterative(root));
  }

  public static boolean symmetricTree(TreeNode root) {

    if(root == null) return true;

    return compareSymmetric(root.left, root.right);
  }

  public static boolean compareSymmetric(TreeNode left, TreeNode right) {
    if(left == null && right == null) return true;
    if((left == null && right != null) || (left != null && right == null)) return false;

    return left.val == right.val
            && compareSymmetric(left.left, right.right)
            && compareSymmetric(left.right, right.left);
  }

  public static boolean symmetricTreeIterative(TreeNode root) {
    if(root == null || (root.left == null && root.right == null)) return true;

    Deque<TreeNode> queue1 = new LinkedList<>();
    Deque<TreeNode> queue2 = new LinkedList<>();

    queue1.offer(root);
    queue2.offer(root);

    while(!queue1.isEmpty() && !queue2.isEmpty()) {
      if(queue1.size() != queue2.size()) return false;
      int size = queue1.size();
      for(int i = 0; i < size; i++) {
        TreeNode p = queue1.poll();
        TreeNode q = queue2.poll();
        if(p == null && q == null){
          continue;
        }else if(p == null || q == null){
          return false;
        }
        if(p.val != q.val) return false;

        queue1.offer(p.left);
        queue1.offer(p.right);
        queue2.offer(q.right);
        queue2.offer(q.left);

      }
    }

    if(!queue1.isEmpty() || !queue2.isEmpty()) return false;


    return true;

  }
}


