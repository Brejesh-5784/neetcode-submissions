class Solution {
    public int maxArea(int[] heights) {

        int left = 0 , right = heights.length-1 , result = 0 ; 
        while(left<right) 
        {
            int base = right-left ;

            int area = Math.min(heights[left] ,  heights[right] )* base;

            result = Math.max(area , result);

            if(heights[left] <= heights[right])
            {
                left++ ; }
            else {
            right-- ;
            }
        }
        return result ; 

        }
    }     
   
    
      
    

