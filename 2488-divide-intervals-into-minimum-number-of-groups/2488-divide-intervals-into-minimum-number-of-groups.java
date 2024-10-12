class Solution {
  // Similar to 253. Meeting Rooms II
  public int minGroups(int[][] intervals) {
    // Stores `right`s.
    Queue<Integer> minHeap = new PriorityQueue<>((b, a) -> Integer.compare(b, a));

    Arrays.sort(intervals, (b, a) -> Integer.compare(b[0], a[0]));

    for (int[] interval : intervals) {
      // There's no overlap, so we can reuse the same group.
      if (!minHeap.isEmpty() && interval[0] > minHeap.peek())
        minHeap.poll();
      minHeap.offer(interval[1]);
    }

    return minHeap.size();
  }
}