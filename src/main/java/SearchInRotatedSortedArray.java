public class SearchInRotatedSortedArray {
    private static int findPivot(int[] arr, int low, int high) {
        if(high < low)
            return -1;
        if(high == low)
            return low;
        int mid = (low + high) /2;
        if(mid < high && arr[mid] > arr[mid + 1]) {
            return mid;
        }
        if(mid >low && arr[mid] < arr[mid - 1]) {
            return mid - 1;
        }
        if(arr[low] >= arr[mid]) {
            return findPivot(arr, low, mid - 1);
        }
        return findPivot(arr, mid + 1, high);
    }

    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums, 0, nums.length - 1);
        if(pivot == -1) {
            return binarySearch(nums, 0, nums.length - 1, target);
        }
        if(nums[pivot] == target) {
            return pivot;
        }
        if(nums[0] <= target) {
            return binarySearch(nums, 0, pivot - 1, target);
        }
        return binarySearch(nums, pivot + 1, nums.length - 1, target);
    }

    private static int binarySearch(int arr[], int low, int high, int key)
    {
        if (high < low)
            return -1;
        int mid = (low + high) / 2;
        if (key == arr[mid])
            return mid;
        if (key > arr[mid])
            return binarySearch(arr, (mid + 1), high, key);
        return binarySearch(arr, low, (mid - 1), key);

    }
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int target = 9;
        System.out.println(search(arr, target));
    }
}
