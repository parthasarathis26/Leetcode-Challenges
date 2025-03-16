class Solution {
    public long repairCars(int[] ranks, int cars) {
        long left = 1, right = (long) 1e14;
        while (left < right) {
            long mid = (right + left) / 2;
            if (canRepairInTime(ranks, cars, mid)) {
                right = mid; 
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
    private boolean canRepairInTime(int[] ranks, int cars, long time) {
        long totalCars = 0;

        for (int rank : ranks) {
            long maxCars = (long) Math.sqrt(time / rank); 
            totalCars += maxCars;
            if (totalCars >= cars) {
                return true; 
            }
        }
        return false; 
    }
}
