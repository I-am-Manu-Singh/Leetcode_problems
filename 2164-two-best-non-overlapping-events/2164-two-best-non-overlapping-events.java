class Solution {
	public int maxTwoEvents(int[][] events) {
		int n = events.length;
		int[][] start = new int[n][];
		int[][] end = new int[n][];
		for (int i = 0; i < n; i++) {
			start[i] = new int[]{events[i][0], events[i][2]};
			end[i] = new int[]{events[i][1], events[i][2]};
		}

		Comparator<int[]> cp = new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}
		};

		Arrays.sort(start, cp);
		Arrays.sort(end, cp);

		int ans = 0;
		int j = 0;
		int max = 0;
		for (int i = 0; i < n; i++) {
			while (j < n && end[j][0] < start[i][0]) {
				if (max < end[j][1]) {
					max = end[j][1];
				}
				j++;
			}

			int s = start[i][1] + max;
			if (ans < s) {
				ans = s;
			}
		}

		return ans;
	}
}