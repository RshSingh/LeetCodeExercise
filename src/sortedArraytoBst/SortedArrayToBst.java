package sortedArraytoBst;

import Node.TreeNode;

public class SortedArrayToBst {

  public static void main(String[] args) {
    Integer[] arr = new Integer[] {-10,-3,0,5,9};
    convertoToBst(arr);
  }

  public static TreeNode convertoToBst(Integer[] arry) {

    return arrayToBst(arry, 0, arry.length-1);
  }

  public static TreeNode arrayToBst(Integer[] arr, int l, int h) {
    if(l > h) return null;

    if(l == h) return new TreeNode(arr[l]);
    int mid = (l + h)/2;
    TreeNode root = new TreeNode(arr[mid]);
    root.left = arrayToBst(arr, l, mid -1);
    root.right = arrayToBst(arr, mid +1, h);

    return root;
  }

}
