class Solution {
    class pair{
        int f,s;
        pair(int a,int b){
            f=a;
            s=b;
        }
    }
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        
        List<pair> iv=new ArrayList();
        for(int i=0;i<nums.length;++i){
            iv.add(new pair(i,nums[i]));
        }
        Collections.sort(iv,(a,b)->a.s-b.s);    // sorting by value

        List<List<pair>> result=new ArrayList();
        result.add(new ArrayList(List.of(iv.get(0))));

        for(int i=1;i<nums.length;++i){
            if(iv.get(i).s - iv.get(i-1).s <= limit){
                result.get(result.size()-1).add(iv.get(i));     // adding the pair iv.get(i) into the last list of result
            }
            else{
                result.add(new ArrayList(List.of(iv.get(i))));  //adding the pair iv.get(i) into a list, then into result list
            }
        }

        for(List<pair> group:result){
            List<pair> sortedInd=new ArrayList(group);
            Collections.sort(sortedInd, (a,b)->a.f-b.f);
            for(int i=0;i<group.size();++i){
                nums[sortedInd.get(i).f] = group.get(i).s;  
            }
        }

        return nums;
    }
}