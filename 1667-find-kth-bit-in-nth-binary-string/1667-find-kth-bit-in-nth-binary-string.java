class Solution {
    public char findKthBit(int n, int k) {
        StringBuilder sb= new StringBuilder();
        sb.append('0');
        for(int i=1; i<n; i++){
            StringBuilder ns= new StringBuilder();
            ns.append(new String(sb));
            ns.append('1');
            StringBuilder ap= new StringBuilder();
            for(int j=sb.length()-1; j>=0; j--){
                if(sb.charAt(j)=='1') ap.append('0');
                else ap.append('1');
            }
            ns.append(new String(ap));
            sb= ns;
        }
        System.out.println(sb);
        return sb.charAt(k-1);
    }
}