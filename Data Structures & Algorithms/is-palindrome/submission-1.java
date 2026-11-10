class Solution {
    public boolean isPalindrome(String s) {
       
       
        String normal = "";
        String reversed = "";

        for(int i = 0; i < s.length(); i++)
        {
            if(!(Character.isLetterOrDigit(s.charAt(i)))) continue;
            else{
                normal += s.charAt(i);
            }
            
        }


        for(int i = normal.length()-1; i >= 0; i--)
        {
            reversed += normal.charAt(i);
            
        }
        System.out.println(normal + " " + reversed);
            reversed = reversed.toLowerCase();
            normal = normal.toLowerCase();
        for(int i = 0; i < normal.length(); i++)
        {

            
            if(reversed.charAt(i) == normal.charAt(i)) continue;
            else return false; 
        }
        return true;
    }
}
