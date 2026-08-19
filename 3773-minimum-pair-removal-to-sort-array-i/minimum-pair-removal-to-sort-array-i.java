class Solution {
    public int minimumPairRemoval(int[] nums) {

        int count = 0;

        while (!isSorted(nums)) {

            int minSum = Integer.MAX_VALUE;
            int index = 0;

            // Find minimum adjacent pair
            for (int i = 0; i < nums.length - 1; i++) {
                int sum = nums[i] + nums[i + 1];

                if (sum < minSum) {
                    minSum = sum;
                    index = i;
                }
            }

            // Merge the pair
            int[] newNums = new int[nums.length - 1];

            int j = 0;

            for (int i = 0; i < nums.length; i++) {

                if (i == index) {
                    newNums[j++] = nums[i] + nums[i + 1];
                    i++; // skip next element
                } else {
                    newNums[j++] = nums[i];
                }
            }

            nums = newNums;
            count++;
        }

        return count;
    }

    private boolean isSorted(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }

        return true;
    }
}