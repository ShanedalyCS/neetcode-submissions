class Solution {
    public int longestConsecutive(int[] nums) {
        // sort the array 
        // advance right until it's not valid
        // advance left until it is again
        // keep track of right-left+1;
        if(nums.length == 0) return 0;
        Arrays.sort(nums);

        int left = 0; 
        boolean valid = true;
        int highestSequence = 1; 
        int counter = 1; 

        for(int right = 0; right < nums.length; right++)
        {
            
            int rightNum = nums[right];
            int leftNum = nums[left];
            if(!valid)
            {
                left = right;
                valid = true; 
                counter = 1; 

            }

            if(right + 1 < nums.length)
            {
                if(rightNum + 1 == nums[right + 1])
                {
                    counter++;

                    if(counter > highestSequence)
                    {
                        highestSequence = counter;
                    }
                }
                else if(rightNum == nums[right + 1])
                {

                }
                else{
                    valid = false; 
                    counter = 1; 
                }
            }
        }
        return highestSequence;
    }
}
