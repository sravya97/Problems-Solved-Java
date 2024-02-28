class Solution {
    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;
        boolean visited[][] = new boolean[rows][cols];
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]=='1' && visited[i][j]==false){
                    count++;
                    DFS(grid, visited, rows, cols, i, j);
                }
            }
        }
        return count;
    }
    
    public void DFS(char[][]grid, boolean[][] visited, int m, int n, int i, int j){
        if(i<0 || j < 0 || i>=m || j >=n || grid[i][j] == '0' || visited[i][j]==true){
            return;
        }
        visited[i][j] = true;
        DFS(grid, visited, m, n, i-1, j);
        DFS(grid, visited, m, n, i+1, j);
        DFS(grid, visited, m, n, i, j-1);
        DFS(grid, visited, m, n, i, j+1);
    }
}