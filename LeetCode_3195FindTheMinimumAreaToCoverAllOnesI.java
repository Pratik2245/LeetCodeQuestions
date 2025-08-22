public class LeetCode_3195FindTheMinimumAreaToCoverAllOnesI {
    public static void main(String[] args) {
         int grid[][]={
              {0,1,0},
              {1,0,1},
      };
      int ans=minimumArea(grid);
      System.out.println(ans);
    }
public static int minimumArea(int[][] grid) {
    int minRow=grid.length,maxRow=-1;
        int minCol=grid[0].length,maxCol=-1;
        for (int i = 0; i < grid.length; i++) {
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1) {
                    maxRow=Math.max(maxRow, i);
                    minRow=Math.min(minRow, i);
                    maxCol=Math.max(maxCol, j);
                    minCol=Math.min(minCol, j);
                }
            }
        }
        return (maxCol-minCol+1)*(maxRow-minRow+1);
}
}