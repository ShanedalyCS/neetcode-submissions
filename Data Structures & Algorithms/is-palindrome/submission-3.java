class Solution {
    public boolean isPalindrome(String s) {
            s = s.toLowerCase();
            int leftPointer = 0;
            int rightPointer = s.length()-1;
        
        for(int i = 0; i < s.length(); i++)
        {
            if(Character.isLetterOrDigit(s.charAt(leftPointer)))
            {
                if(Character.isLetterOrDigit(s.charAt(rightPointer)))
                {
                    System.out.println(s.charAt(leftPointer)+ " " + s.charAt(rightPointer));

                    if(s.charAt(leftPointer) == s.charAt(rightPointer))
                    {
                        leftPointer++;
                        rightPointer--;
                    }
                    else return false; 
                }
                else {
                    rightPointer--;
                }
            }
            else {
                leftPointer++;
            }
        }
        return true;
    }
}
