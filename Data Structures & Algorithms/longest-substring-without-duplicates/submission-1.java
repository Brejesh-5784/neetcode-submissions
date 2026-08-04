class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0 , right = 0 ;
        int maxLength = 0 ;
        HashSet <Character> seen = new HashSet<>();
        int n = s.length() ; 

        for(right = 0 ; right< n ; right ++){
            while(seen.contains(s.charAt(right))){
                seen.remove(s.charAt(left));
                left++ ;
            }
            seen.add(s.charAt(right));
            maxLength = Math.max(maxLength , right-left+1);
        }
        return maxLength ; 
    
    
    }
}
