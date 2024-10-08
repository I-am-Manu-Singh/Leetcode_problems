class Solution{

    public int minSwaps(String s) {
        int imbalance =0;
        int swaps = 0;

        for (char bracket : s.toCharArray()) {
            if(bracket == '[') {
                imbalance++;
            }

            else if (imbalance > 0) {
                imbalance--;
            }
        }

        swaps = (imbalance + 1) >> 1;
        return swaps;
    }
}