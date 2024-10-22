class Solution {
    public int singleNumber(int[] nums)
    {
     Map< Integer,Integer> map=new HashMap< Integer,Integer>(); 
        for(int i=0;i< nums.length;i++)
        {
            if(map.containsKey(nums[i]))
                map.replace(nums[i],map.get(nums[i]),map.get(nums[i])+2);
            else
                map.put(nums[i],1);
        }
    
       for(int i=0;i< nums.length;i++)
       {
           if(map.get(nums[i])==1)
               return nums[i];
       }
        return 0;
    }
}