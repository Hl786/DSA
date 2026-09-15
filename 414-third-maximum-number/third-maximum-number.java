class Solution {
    public int thirdMax(int[] nums) {
        // Use long to safely handle Integer.MIN_VALUE as a possible value
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for (int num : nums) {
            // Skip duplicates
            if (num == first || num == second || num == third) {
                continue;
            }

            if (num > first) {
                // New maximum found
                third = second;
                second = first;
                first = num;
            } else if (num > second) {
                // New second maximum found
                third = second;
                second = num;
            } else if (num > third) {
                // New third maximum found
                third = num;
            }
        }

        // If we never found a third distinct maximum, return the overall maximum
        return (third == Long.MIN_VALUE) ? (int) first : (int) third;
    }
}