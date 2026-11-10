class Solution {
    public int maxArea(int[] heights) {
        
        int left = 0; 
        int right = heights.length-1;
        int finalMax = 0;
        for(int i = 0; i < heights.length; i++)
        {
            int heightLeft = heights[left];
            int heightRight = heights[right];
                
            int diff = right - left;
            int height = Math.min(heightLeft, heightRight);
            int maxArea = height*diff;

            if(heights[left] > heights[right])
            {
                right--;
            }
            else if (heights[left] < heights[right])
            {
                left++;
            }
            else{
                left++;
            }


            if(maxArea > finalMax) finalMax = maxArea;

            
            
        }
        return finalMax;
    }
}
