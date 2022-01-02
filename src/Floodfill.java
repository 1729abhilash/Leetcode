public class Floodfill {

    public static void main(String [] args){
        int [][] image={{1,1,1},
                {1,1,0},
                {1,0,1}
             };
        int sr=1;
        int sc=1;
        int newColor=2;
        dfs(image,sr,sc,newColor,image[sr][sc]);
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[0].length;j++){
                System.out.print(image[i][j]+" ");

            }
            System.out.println();

        }


    }


    private static void dfs(int [][]image,int sr,int sc,int newColor,int val){

        if(sr<0||sr>=image.length||sc<0||sc>=image[0].length||image[sr][sc]!=val)
            return ;

            image[sr][sc]=val;

        dfs(image,sr-1,sc,newColor,val);
        dfs(image,sr+1,sc,newColor,val);
        dfs(image,sr,sc-1,newColor,val);
        dfs(image,sr,sc+1,newColor,val);

    }
}
