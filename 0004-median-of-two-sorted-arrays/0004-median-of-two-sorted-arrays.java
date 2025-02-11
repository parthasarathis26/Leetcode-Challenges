class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];
        int k = 0;
        for (int i = 0; i < nums1.length; i++) {
            merged[k++] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            merged[k++] = nums2[i];
        }
        Arrays.sort(merged);
        int mid = merged.length / 2;
        if (merged.length % 2 == 0) {
            return (merged[mid - 1] + merged[mid]) / 2.0;
        } else {
            return merged[mid];
        }
    }
}
