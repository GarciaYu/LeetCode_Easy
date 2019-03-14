package _014;

public class BinarySearch_01 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 5, 8, 11, 15};
        System.out.println(binarySearch(nums, 12));
    }

    /*
    Key : low > high
     */
    public static int binarySearch(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int middle = 0;

        if (target < nums[low] || target > nums[high] || low > high) {
            return -1;
        }

        while (low <= high) {
            middle = (low + high) / 2;
            if (nums[middle] > target) {
                high = middle - 1;
            } else if (nums[middle] < target) {
                low = middle + 1;
            } else {
                return middle;
            }
        }

        return -1;
    }
}
