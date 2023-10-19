class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int length1 = str1.length();
        int length2 = str2.length();
        String result = "";
        if(length1 < length2){
            result = str1;
        } else {
            result = str2;
        }
        while(result.length() > 0){
            if(isDivisor(result, str1) && isDivisor(result, str2)){
                break;
            }
            else{
                result = result.substring(0, result.length()-1);
                
            }
        }
        return result;
    }

    public boolean isDivisor(String base, String actual){
        String result = base;
        while(result.length() <= actual.length()){
            
            if(result.equals(actual)){
                return true;
            } else {
                result = result + base;
            }
        }
        return  false;
    }
}