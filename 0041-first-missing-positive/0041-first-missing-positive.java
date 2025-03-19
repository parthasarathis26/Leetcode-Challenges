class Solution {
    public int firstMissingPositive(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            if (num > 0) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        int mis=1;
        while(true){
            if(!map.containsKey(mis)){
                return mis;
            }
            mis++;
        }

    }
}