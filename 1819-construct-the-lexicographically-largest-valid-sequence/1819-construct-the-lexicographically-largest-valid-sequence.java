class Solution {
    public int[] constructDistancedSequence(int n) {
        int[] res=new int[2*n-1];
        boolean[] used=new boolean[n+1];
        print(res,0,used);
        return res;
    }
    public static boolean print(int[] res,int idx,boolean[] used){
        while(idx<res.length && res[idx]!=0){
            idx++;
        }
        if(idx==res.length){
            return true;
        }
        for(int i=used.length-1;i>=1;i--){
            if(used[i]==false && i==1 && res[idx]==0){
                used[i]=true;
                res[idx]=i;
                if(print(res,idx+1,used)){
                    return true;
                }
                used[i]=false;
                res[idx]=0;
            } 
            else if(used[i]==false && idx+i<res.length && res[idx+i]==0){
                used[i]=true;
                res[idx]=i;
                res[idx+i]=i;
                if(print(res,idx+1,used)){
                    return true;
                }
                used[i]=false;
                res[idx]=0;
                res[idx+i]=0;
            }
        }
        return false;
    }
}