class Solution {
    public void reverseString(char[] s) {
        if(s==null || s.length<=1) return;
        int right=s.length-1;
        for(int i=0;i<right;i++){
            char temp= s[i];
            s[i]=s[right];
            s[right]=temp;
            right--;
        }
        
    }
}