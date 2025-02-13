import java.util.*;

class Solution {
    // Function to calculate the sum of digits of a number
    private int getDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public int maximumSum(int[] nums) {
        int result = -1;
        Map<Integer, Integer> map = new HashMap<>(); // Stores max number for each digit sum

        for (int num : nums) {
            int digitSum = getDigitSum(num);

            // If this digit sum exists, update the result with the max sum of the pair
            if (map.containsKey(digitSum)) {
                result = Math.max(result, num + map.get(digitSum));
            }

            // Update the stored maximum number for this digit sum
            map.put(digitSum, Math.max(map.getOrDefault(digitSum, 0), num));
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {18, 43, 36, 13, 7};
        System.out.println(solution.maximumSum(nums1)); // Output: 54

        int[] nums2 = {10, 12, 19, 14};
        System.out.println(solution.maximumSum(nums2)); // Output: -1
    }
}