class Solution {
    public int findClosestNumber(int[] nums) {
        int k = 0, ans = 0, ch = 0;
        int ans1 = nums[0];

        for (int i = 0; i < nums.length; i++) {
            k = nums[i];
            ch = Math.abs(k);

            if (ch < Math.abs(ans1)) {
                ans1 = k;
            } else if (ch == Math.abs(ans1) && k > ans1) {
                ans1 = k;
            }
        }

        return ans1;
    }
}
