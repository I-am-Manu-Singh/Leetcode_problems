class Solution {
    public String removeOccurrences(String s, String part) {
        if (part == null || s == null) {
            return s;
        }
        while(true) {
            int sLength = s.length();
            int partLength = part.length();

            Integer partIndex = null;
            for (int i = 0; i <= sLength - partLength ; i++) {
                if(s.substring(i, i + partLength).equals(part)) {
                    partIndex = i;
                    break;
                    }
                }
            
            if(partIndex != null) {
                String str = "";
                if(partIndex > 0) {
                    str = s.substring(0, partIndex);
                }
                str += s.substring(partIndex + partLength, sLength);
                s = str;
                partIndex = null;
            } else {
                break;
            }
        }
        return s;
    }
}