class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int z=s.length()-1;
        int count=0;
        while(z>=0 && s.charAt(z)!=' ')
        {
            count++;
            z--;
        }
        return count;

    }
}