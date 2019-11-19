import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] sum3 = new int[nums1.length + nums2.length];

        System.arraycopy(nums1, 0, sum3, 0, nums1.length);
        System.arraycopy(nums2, 0, sum3, nums1.length, nums2.length);
        Arrays.sort(sum3);
        double v = BinarySearch(sum3);
        return v;
    }
    
    public static double BinarySearch(int[] nums){
        if(nums.length == 0){
            return 0.0;
        }else{
            int begin = nums[0];
            int end = nums[nums.length - 1];

            if(nums.length % 2 == 0){
                // 数组长度为偶数的情况
                int midLess = nums.length / 2 - 1;
                int midMore = nums.length / 2;
                return ((double)nums[midLess] + (double)nums[midMore]) / 2;
            }else{
                // 数组长度为奇数到情况
                return nums[nums.length / 2];
            }
        }
    }
    
}