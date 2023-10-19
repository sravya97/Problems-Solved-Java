class Solution {
    public String mergeAlternately(String word1, String word2) {
       int l1 = word1.length();
       int l2 = word2.length();
       StringBuilder result = new StringBuilder();
       int i=0;
       int j=0;
       while(i < l1 || j < l2){
           if(i < l1){
               result.append(word1.charAt(i++));
           }
           if(j < l2){
               result.append(word2.charAt(j++));
           }
       }
       return result.toString();
    }
}