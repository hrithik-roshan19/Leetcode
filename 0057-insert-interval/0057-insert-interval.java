class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> res = new ArrayList<>();

        int start = newInterval[0];
        int end = newInterval[1];

        for (int i = 0; i < intervals.length; i++) {

            int s = intervals[i][0];
            int e = intervals[i][1];

            if (e < start) {
                res.add(intervals[i]);
            }

            else if (s > end) {
                res.add(new int[]{start, end});

                for (int j = i; j < intervals.length; j++) {
                    res.add(intervals[j]);
                }

                return res.toArray(new int[res.size()][]);
            }

            else {
                start = Math.min(start, s);
                end = Math.max(end, e);
            }
        }

        res.add(new int[]{start, end});

        return res.toArray(new int[res.size()][]);
    }
}