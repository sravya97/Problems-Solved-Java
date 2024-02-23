class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()][];
        for(int i=0;i<text1.length();i++){
            int[] col = new int[text2.length()];
            Arrays.fill(col, -1);
            dp[i] = col;
        }
        
        return countSeq(text1, text2, 0, 0, dp);
    }
    
    public int countSeq(String text1, String text2, int i, int j, int[][] dp){
        if(i == text1.length() || j == text2.length()){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int count = 0;
        if(text1.charAt(i) == text2.charAt(j)){
            count = 1 + countSeq(text1, text2, i+1, j+1, dp);
        } else {
            count = Math.max(countSeq(text1, text2, i+1, j, dp), 
                             countSeq(text1, text2, i, j+1, dp));
        }
        dp[i][j] = count;
        return dp[i][j];
    }
}