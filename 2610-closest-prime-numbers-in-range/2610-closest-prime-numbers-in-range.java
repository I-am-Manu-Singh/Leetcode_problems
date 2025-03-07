class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean primeno[] = new boolean[right + 1];
        Arrays.fill(primeno, true);
        primeno[0] = false;
        primeno[1] = false;
        for(int p = 2; p*p <= right; p++) {
            if(primeno[p]) {
                for(int i = p*p; i <= right; i+=p)
                primeno[i] = false;
            }
        }
        int res[] = new int[]{-1,-1};
        int mindiff = Integer.MAX_VALUE;
        int prev = -1;
        for(int i = left; i <= right; i++) {
            if(primeno[i]){
                if(prev == -1) {
                    prev = i;
                }
                else{
                    if(i - prev < mindiff) {
                        res[0] = prev;
                        res[1] = i;
                        mindiff = i - prev;
                    }
                    prev = i;
                }
            }
        }
        return res;
    }
}