class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (
            Double.compare(1.0D*(b[0]+1)/(b[1]+1) - 1.0D*b[0]/b[1], 1.0D*(a[0]+1)/(a[1]+1) - 1.0D*a[0]/a[1])
        ));

        for(int[] c : classes) {
            pq.offer(c);
        }

        for (int i = 0; i < extraStudents; i++) {
            int[] arr = pq.poll();
            pq.offer(new int[]{arr[0] + 1, arr[1] + 1});
        }

        double sum = 0;
        Iterator<int[]> ite = pq.iterator();
        while (ite.hasNext()) {
            int[] arr = ite.next();
            sum += 1.0D*arr[0]/arr[1];
        }

        return sum / classes.length;
    }
}