//https://leetcode.com/problems/top-k-frequent-elements/
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums) map.put(n,map.getOrDefault(n,0)+1);
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->b.val-a.val);
        int[] ans=new int[k];
        for(int keys:map.keySet()){
            pq.offer(new Pair(keys,map.get(keys)));
        }
        for(int i=0;i<k;i++){
            ans[i]=pq.poll().key;
        }
        return ans;
    }
}

class Pair{
    int key;
    int val;
    Pair(int key,int val){
        this.key=key;
        this.val=val;
    }
}
