class Solution {
    public long coloredCells(int n) {
        long count = 1;
        long mark = 4;
        while( n > 1) {
            count += mark;
            mark += 4;
            n--;
        }
        return count;
    }
}