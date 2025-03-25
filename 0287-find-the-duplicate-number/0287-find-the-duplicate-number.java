class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> hp=new HashMap<>();
        for(int num:nums){
            hp.put(num,hp.getOrDefault(num,0)+1);
        }
        for(int num:nums){
            if(hp.get(num)>=2){
                return num;
            }
        }
        return -1;
    }
}