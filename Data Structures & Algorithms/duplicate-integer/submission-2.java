class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<Integer>();

        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])) return true;
            else set.add(nums[i]);
        }


        // for(int i =0; i < nums.length; i++){
        //     for(int j = 1; j< nums.length; j++){
        //         if(i != j && nums[i] == nums[j] )return true;
        //     }
        // }
         return false;
        
    }
}