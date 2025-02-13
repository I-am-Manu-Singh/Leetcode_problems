class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();

        for(int num: nums) {
            pq.add((long) num); //to convert to long

        }

        int count = 0;
        while(!pq.isEmpty() && pq.peek() < k) {
            long smallest = pq.poll(); 
            if(pq.isEmpty())
            break;


            long second_smallest = pq.poll(); 
            pq.add(smallest *2 + second_smallest);
            count++;
        }

        return count;
    }
}