class Solution {
    public boolean canChange(String start, String target) {
        int first = 0, second = 0, n = start.length();


        while(first < n || second < n) {
            while(first < n && start.charAt(first) == '_')
            first++;

        while(second < n && target.charAt(second) == '_')
            second++;   

            if(first == n || second == n)
            break;

            if(start.charAt(first) != target.charAt(second))
            return false;
            if(start.charAt(first) == 'L' & first < second)  
            return false;
            if(start.charAt(first) == 'R' & first > second)
            return false;   
                    
            first++;
            second++;
                    
        }
        return first == n && second == n;

    }
}