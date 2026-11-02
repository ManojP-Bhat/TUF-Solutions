class Solution {
    public int aggressiveCows(int[] nums, int k) {
        Arrays.sort(nums);
        int low = 1;
        int high = nums[nums.length - 1] - nums[0];

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canPlace(nums, k, mid)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }
    public static boolean canPlace(int[] stalls, int k, int dist) {
        int cows = 1;
        int lastPlaced = stalls[0];
        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPlaced >= dist) {
                cows++;
                lastPlaced = stalls[i];

                if (cows == k)
                    return true;
            }
        }
        return false;
    }
}
