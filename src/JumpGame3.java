
//leetcode 1306
//usiing bfs

class Solution {
    public boolean canReach(int[] arr, int start) {

        boolean visited[]=new boolean[arr.length];


        Queue<Integer> q=new LinkedList<>();
        q.offer(start);


        while(!q.isEmpty()){
            int x=q.poll();


            if(arr[x]==0)
                return true;

            int forwardedIndex=x+arr[x];
            int backwardedIndex=x-arr[x];


            if(forwardedIndex>=0&&forwardedIndex<arr.length&&!visited[x]){
                q.offer(forwardedIndex);

            }
            if(backwardedIndex>=0&&backwardedIndex<arr.length&&!visited[x]){
                q.offer(backwardedIndex);

            }


            visited[x]=true;
        }
        return false;

    }
}