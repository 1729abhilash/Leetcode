
    class Minimumfallingpathsumleet931  {


        public int minFallingPathSum(int[][] matrix) {

            int row=matrix.length;
            int ans=Integer.MAX_VALUE;
            boolean flag=false;
            for(int i=row-2;i>=0;i--){
                flag=true;
                for(int j=0;j<row;j++){
                    if(j==0)
                        matrix[i][j]+=Math.min(matrix[i+1][j],matrix[i+1][j+1]);
                    else if(j==row-1)
                        matrix[i][j]+=Math.min(matrix[i+1][j],matrix[i+1][j-1]);
                    else
                        matrix[i][j]+=Math.min(matrix[i+1][j+1],Math.min(matrix[i+1][j],matrix[i+1][j-1]));
                    if(i==0){
                        ans=Math.min(ans,matrix[i][j]);
                    }

                }
            }
            return flag?ans:matrix[0][0];

        }
    }

