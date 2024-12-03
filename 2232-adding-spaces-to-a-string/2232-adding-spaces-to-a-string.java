class Solution {
    public String addSpaces(String s, int[] spaces) {

            StringBuilder sb = new StringBuilder(s);
            int spaceCount = 0;
            for(int spaceIndex : spaces) {
                sb.insert(spaceIndex + spaceCount, " ");
                spaceCount++;
            }
        return sb.toString();
    }
}