class Solution {

    /*
    this function update will update count of set bit in 32 bit array
    on adding or removing element while doing sliding window.
    */
    public int[] update(int[] arr,int num,int x){

        for(int i=0;i<arr.length;++i){
            if(((num>>i)&1)==1) arr[i]+=x;
        }
        return arr;
    } 

    /*
    to get the deciaml value from 32 bit array to compare to k
    */
    public int getDecimal(int[] arr){
        int decimal=0;
        for(int i=0;i<arr.length;++i){
            if(arr[i]>0){
                decimal|=(1<<i);
            }
        }
        return decimal;
    }

    public int minimumSubarrayLength(int[] nums, int k) {
        int min=Integer.MAX_VALUE;
        int i=0,j=0,or=0;
        int[] arr=new int[32];
        /*
        taking 32 bit array to mentain set bit counts for each i
        */

        while(j<nums.length){
          arr= update(arr,nums[j],1);
            while(getDecimal(arr)>=k && i<=j){
                min=Math.min(min,(j-i)+1);
                update(arr,nums[i],-1);
                ++i;
            }
            ++j;
        }
        return min==Integer.MAX_VALUE?-1:min;
        
    }
}