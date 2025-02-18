class Solution {
    public boolean isPartition(int j, String i2, int i , int cursum) {
        int n = i2.length();
        if(j == n) {
            return(cursum == i);
        }

        for(int index = j; index < n; index++){
            int val = Integer.parseInt(i2.substring(j, index + 1));
            if(isPartition(index + 1, i2, i, cursum + val)){
                return true;
            }
        }
        return false;
    }

    public int punishmentNumber(int n) {
        int res = 0;
        for(int i = 1; i <= n; i++) {
            String i2 = Integer.toString(i*i);
            if(isPartition(0, i2, i , 0)) {
                res += (i*i); 
            }
        }
        return res;        
    }
}