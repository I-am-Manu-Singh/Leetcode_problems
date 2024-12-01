class Solution {
    public boolean checkIfExist(int[] arr) {
        
        HashSet<Integer> seen_number_set = new HashSet<>();
        for(int ele : arr) {
            if(seen_number_set.contains(2*ele) || (ele% 2 ==0 && seen_number_set.contains(ele/2))) {
                return true;
            }

            seen_number_set.add(ele);
                
        }

        return false;

    }
}