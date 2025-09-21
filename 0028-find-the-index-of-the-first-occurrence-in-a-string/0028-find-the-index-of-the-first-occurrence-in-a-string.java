class Solution {
    public int strStr(String haystack, String needle) {
        if(needle == null || haystack == null) return -1;
        if(needle.length()==0) return 0;
        return haystack.indexOf(needle); 
        
    }
}