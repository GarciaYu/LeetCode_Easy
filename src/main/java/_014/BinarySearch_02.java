package _014;

public class BinarySearch_02 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 5, 8, 11, 15};
        System.out.println(binarySearch(nums, 11, 0, nums.length - 1));
    }

    /*
    Key : low > high
     */
    public static int binarySearch(int[] nums, int target, int low, int high) {
        if (target < nums[low] || target > nums[high] || low > high) {
            return -1;
        }
        int middle = (low + high) / 2;

        if (nums[middle] > target) {
            return binarySearch(nums, target, low, middle - 1);
        } else if (nums[middle] < target) {
            return binarySearch(nums, target, middle + 1, high);
        } else {
            return middle;
        }
    }
}
