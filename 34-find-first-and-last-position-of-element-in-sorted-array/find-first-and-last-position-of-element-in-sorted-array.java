class Solution {

    public int[] searchRange(int[] nums, int target) {

        int first = findfirst(nums, target);
        int last = findsecond(nums, target);

        if (first == -1 || last == -1) {
            return new int[]{-1, -1};
        }

        return new int[]{first, last};
    }


    private int findfirst(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;
        int anw = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (target == nums[mid]) {

                anw = mid;
                high = mid - 1;   // search LEFT
            }

            else if (target < nums[mid]) {

                high = mid - 1;
            }

            else {

                low = mid + 1;
            }
        }

        return anw;
    }


    private int findsecond(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;
        int anw = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (target == nums[mid]) {

                anw = mid;
                low = mid + 1;    // search RIGHT
            }

            else if (target < nums[mid]) {

                high = mid - 1;
            }

            else {

                low = mid + 1;
            }
        }

        return anw;
    }
}