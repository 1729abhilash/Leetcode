import java.util.ArrayList;
import java.util.List;

public class Coll {

    public static void main(String [] args) {
        int [][]arr=
                {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
     System.out.println(searchMatrix(arr,11));
    }


    public static boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length-1;
        int n=matrix[0].length-1;
        int row=-1;
        int col=0;
        int low=0;
        int high=m;
        while(low<=high){
            int mid=low+(high-low)/2;

            if(matrix[mid][n]>=target&&target>=matrix[mid][col]){
                row=mid;
                break;

            }

            else if(matrix[mid][col]>target){
                row =mid;
                high=mid-1;


            }
            else if(matrix[mid][col]<target){
                row=mid;
                low=mid+1;


            }
        }
//
//System.out.println(row);
        if(row!=-1){


            low=0;
            high=n;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(matrix[row][mid]==target){
                    return true;

                }
                else if(matrix[row][mid]>target)
                    high=mid-1;
                else
                    low=mid+1;
            }





        }



        return false;



    }

    }

