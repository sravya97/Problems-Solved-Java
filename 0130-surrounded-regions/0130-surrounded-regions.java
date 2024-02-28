class Solution {
    public void solve(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;
        boolean visited[][] = new boolean[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(i==0 || j==0 || i==rows-1 || j==cols-1){
                   // System.out.println(board[i][j]);
                    if(board[i][j]=='O' && visited[i][j]==false){
                        //System.out.println(visited[i][j]);
                        DFS(board, visited, rows, cols, i, j);
                    }
                }
            }
        }
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                //System.out.println(visited[i][j]);
                if(visited[i][j]==false && board[i][j]=='O'){
                    board[i][j]='X';
                }
            }
        }
    }
    
    public void DFS(char[][] board, boolean[][] visited, int rows, int cols, int i, int j){
        if(i<0 || j<0 || i>=rows || j>=cols || visited[i][j]==true || board[i][j]=='X'){
            return;
        }
        visited[i][j] = true;
        //System.out.println(visited[i][j]);
        DFS(board, visited, rows, cols, i-1, j);
        DFS(board, visited, rows, cols, i+1, j);
        DFS(board, visited, rows, cols, i, j-1);
        DFS(board, visited, rows, cols, i, j+1);
        
    }
}