class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);
        int longest = 1;
        int counter = 1;

        for (int i = 0; i + 1 < nums.length; i++) {
            int a = nums[i], b = nums[i + 1];

            if (b == a) {
                // duplicate: ignore, don't reset, don't increment
                continue;
            } else if (b == a + 1) {
                // consecutive: extend streak
                counter++;
            } else {
                // break: close current streak and reset
                longest = Math.max(longest, counter);
                counter = 1;
            }
        }
        return Math.max(longest, counter);
    }
}






// class Solution {
//     public int longestConsecutive(int[] nums) {
      
//         if (nums.length < 1) return 0;
//         Arrays.sort(nums);
//         int longest = 0; 
//         int counter = 1;

        

//         for(int i = 0; i<nums.length; i++){
//             // System.out.println(nums[i]);
             

//             if(i+1 < nums.length){
                


//                 if(counter > longest) longest = counter; 
//                 int numOne = nums[i];
//                 int numTwo = nums[i+1];
//                 if((numOne + 1) == numTwo){
//                     counter++;
//                     if(counter > longest) longest = counter; 
//                 } 
//                 else{
//                     if(counter > longest){
//                         longest = counter;
//                         counter = 1;
//                     }  
                    
//                 }
//                 System.out.println("COUNTER : " + counter);
//                 System.out.println("Longest : " + longest);
//                 System.out.println("numOne + 1 = " + (numOne + 1) + " ==? numTwo =  " +numTwo);

//             }
//              if(counter > longest) longest = counter; 
            
//         }
//         return longest;
//     }
// }
