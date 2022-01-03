public class MinimunPath {

    public static void main(String[] args) {
        System.out.println(minPathSum(new int[][]{{1,3,1},{1,5,1},{4,2,1}}));



    }




    public int minPathSum(int[][] grid) {




        int m=grid.length;
        int n=grid[0].length;
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(i==m-1&&j==n-1)
                    continue;
                else if(i==m-1&&j!=n-1)
                    grid[i][j]+=grid[i][j+1];
                else if(j==n-1&&i!=m-1)
                    grid[i][j]+=grid[i+1][j];
                else
                    grid[i][j]+=Math.min(grid[i][j+1],grid[i+1][j]);

            }

        }
        return grid[0][0];


    }



//    public static int min(int[][]grid, int row, int col){
//
//        if(row == 0 && col == 0) return grid[row][col]; // this is the exit of the recursion
//        if(row == 0) return grid[row][col] + min(grid, row, col - 1); /** when we reach the first row, we could only move horizontally.*/
//        if(col == 0) return grid[row][col] + min(grid, row - 1, col); /** when we reach the first column, we could only move vertically.*/
//        return grid[row][col] + Math.min(min(grid, row - 1, col), min(grid, row, col - 1)); /** we want the min sum path so we pick the cell with the less value */
//
//    }







}
