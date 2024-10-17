class Solution {
    public int maximumSwap(int num) {
        String s = String.valueOf(num);
        int N = s.length();
        char[] nums = s.toCharArray();

        for (int i = 0; i < N; i++) {
            int curNum = nums[i] - '0';
            int maxNum = 0;
            int maxIndex = 0;
            for (int j = i + 1; j < N; j++) {
                int temp = nums[j] - '0';
                if (temp >= maxNum) {
                    maxNum = temp;
                    maxIndex = j;
                }
            }
            if (maxNum > curNum) {
                char temp = nums[i];
                nums[i] = nums[maxIndex];
                nums[maxIndex] = temp;
                return Integer.valueOf(new String(nums));
            }
        }
        return num;
    }
}