class Solution {
    
    public int removeDuplicates(int[] nums) {
        int uniqueCount = 0;
      
        for (int currentNum : nums) {
   
            if (uniqueCount == 0 || currentNum != nums[uniqueCount - 1]) {
            
                nums[uniqueCount++] = currentNum;
            }
        }
      
        return uniqueCount;
    }
}