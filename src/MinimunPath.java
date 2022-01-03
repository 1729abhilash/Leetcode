public class MinimunPath {

    public static void main(String[] args) {
        System.out.println(minPathSum(new int[][]{{1,3,1},{1,5,1},{4,2,1}}));



    }




    public static int minPathSum(int[][] grid) {




        int m=grid.length;
        int n=grid[0].length;
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                int x=Integer.MAX_VALUE;
                int y=Integer.MAX_VALUE;
                if(i==m-1&&j==n-1)
                    continue;
                if((i+1)<m)
                    x=grid[i+1][j];

                if((j+1)<n)
                    y=grid[i][j+1];


                grid[i][j]=grid[i][j]+Math.min(x,y);
                System.out.print("grid"+i+j+" "+grid[i][j]+"     ");

            }
            System.out.println();
        }
        return grid[0][0];


    }
}
