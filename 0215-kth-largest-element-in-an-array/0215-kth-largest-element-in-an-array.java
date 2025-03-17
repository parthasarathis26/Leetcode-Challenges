class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
        for(int a:nums){
            q.add(a);
        }
        while(k!=1){
            q.poll();
            k--;
        }
        return q.peek();
    }
}