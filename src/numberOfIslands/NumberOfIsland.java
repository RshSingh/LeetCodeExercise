package numberOfIslands;

public class NumberOfIsland {

  public static void main(String[] args) {

    char[][] grid = {{'1','1','0'},{'0','1','0'}};
    System.out.println(numberOfIslands(grid));
  }

  public static int numberOfIslands(char[][] grid) {

    if(grid == null || grid.length == 0) return 0;
    int m = grid.length, n = grid[0].length;
    int result= 0;
    for(int i = 0; i < m; i ++) {
      for(int j = 0; j < n; j ++) {
        if(grid[i][j] == '1') {
          result ++;
          checkDfs(grid, i, j, m, n);
        }
      }
    }
    return result;
  }

  public static void checkDfs(char[][] grid, int i, int j, int m, int n) {
    if(i < 0 || i >= m || j < 0 || j >= m || grid[i][j] == '0' ) return;
    grid[i][j] = '0';
    checkDfs(grid, i -1 , j, m, n);
    checkDfs(grid, i +1 , j, m, n);
    checkDfs(grid, i  , j - 1, m, n);
    checkDfs(grid, i , j + 1, m, n);
  }
}
