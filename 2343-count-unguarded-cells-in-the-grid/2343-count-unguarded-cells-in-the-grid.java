class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        
        int ans =0;
        int[][] g = new int[m][n];
        for(int[] i : guards)
        {
            g[i[0]][i[1]]=1;
        }
        for(int[] i: walls)
        {
            g[i[0]][i[1]]=2;
        }

        for(int[] i : guards)
        {
            helper(g,i[0],i[1],m,n);
        }

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++) if(g[i][j]==0) ans++;
        }
        return ans;

    }
    public void helper(int[][] g,int r,int c,int m,int n)
    {
        for(int i=r+1;i<m;i++)
        {
            if(g[i][c]==1 || g[i][c]==2) break;
            g[i][c]=3;
        }
        for(int i=r-1;i>=0;i--)
        {
            if(g[i][c]==1 || g[i][c]==2) break;
            g[i][c]=3;
        }
        for(int i=c+1;i<n;i++)
        {
            if(g[r][i]==1 || g[r][i]==2) break;
            g[r][i]=3;
        }
        for(int i=c-1;i>=0;i--)
        {
            if(g[r][i]==1 || g[r][i]==2) break;
            g[r][i]=3;
        }
    }
}