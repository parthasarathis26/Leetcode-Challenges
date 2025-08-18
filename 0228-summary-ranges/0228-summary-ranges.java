class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ls=new ArrayList<>();
        int x=0;
        for(int i=0;i<nums.length;i++){
            String s="";
            s+=String.valueOf(nums[i]);
            int k=nums[i],k2=nums[i],j=0;
            for(j=i;j<nums.length-1;j++){
                if(nums[j]+1==nums[j+1]){
                    continue;
                }
                else{

                    break;
                }
            }
            k2=nums[j];
            i=j;
            if(k!=k2){
                s+=("->"+String.valueOf(k2));
            }
            ls.add(s);
        }
        return ls;
    }
}