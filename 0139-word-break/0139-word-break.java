class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length()+1];
        dp[s.length()] = true;
        for(int i=s.length()-1; i>=0;i--){
            for(int j=i+1;j<=s.length();j++){
                String prefix = s.substring(i,j);
                if(dp[j] && set.contains(prefix)){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[0];
    }
}