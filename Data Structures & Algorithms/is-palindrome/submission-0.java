class Solution {
    public boolean isPalindrome(String s) {
        String a = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();

        int left = 0 ;
        int right = a.length()-1;

        while (left<right){
            if(a.charAt(left) != a.charAt(right)){
                return false;
            }
            left++ ;
            right-- ;
    
        }
        return true ;





    }
}
