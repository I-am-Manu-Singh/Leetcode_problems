class Solution {
    public void moveZeroes(int[] nums) {
     int n=nums.length;
     int index=0;
     int temp;
     for(int i=0;i<n;i++){
        if(nums[i]!=0){
        temp=nums[i];
        nums[i]=nums[index];
        nums[index]=temp;
     index++;
        }
     }
    }
}