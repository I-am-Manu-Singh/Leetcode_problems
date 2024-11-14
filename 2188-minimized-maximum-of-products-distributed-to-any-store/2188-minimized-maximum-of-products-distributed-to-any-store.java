class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int max=0;
        for(Integer it : quantities){
            max=Math.max(max,it);
        }
        int l=1;
        int r=max;
        int ans=0;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(possible(n,quantities,mid)){
                ans=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }

    public boolean possible(int n, int[] quantities, int value){
        for(int i=0;i<quantities.length;i++){
        float app = (float) quantities[i] / value;
            int k=(int)Math.ceil(app);
            n=n-k;
            if(n<0) return false;
        }
        return true;
    }
}