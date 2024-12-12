class Solution {
    public long pickGifts(int[] gifts, int k) {
        long res=0;
        Arrays.sort(gifts);
        // [25,64,9,4,100]  3 5 8 9  
        PriorityQueue<Integer> p=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:gifts)p.add(i);
        while(k!=0){
                int v=(int)Math.sqrt(p.poll());
                p.add(v);
                k--;
        }
        for(int i:p)res+=i;
        return res;
    }
}