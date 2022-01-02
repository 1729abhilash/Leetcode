import java.util.*;

public class test {

    public static void main(String[] args) {

        System.out.println(largestDivisibleSubset(new int[]{1,2,3,4}));


    }

    public static List<Integer> largestDivisibleSubset(int[] nums) {

        List<Integer> ls=new LinkedList<>();
        ls.add(nums[0]);
        List<Integer> res=new LinkedList<>();
        generate(nums,1,ls,res);
        return ls;
    }

    private static void generate(int []nums,int ind,List<Integer> ls,List<Integer> res){
        if(ls.size()>res.size()){
            System.out.println(ls);
            res=new ArrayList<>(ls);
        }

        for(int i=ind;i<nums.length;i++){

            if(nums[i]%nums[i-1]==0||nums[i-1]%nums[i]==0){
                ls.add(nums[i]);
                generate(nums,i+1,ls,res);
                ls.remove(ls.size()-1);
            }

        }

    }

}