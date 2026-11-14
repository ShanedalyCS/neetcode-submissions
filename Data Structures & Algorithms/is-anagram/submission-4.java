class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()) return false;
        
        char [] sChar = s.toCharArray();
        char [] tChar = t.toCharArray();

        Arrays.sort(sChar);
        Arrays.sort(tChar);

        String compareS = "";
        String compareT = "";

        for(int i = 0; i < s.length(); i++)
        {
            compareS += sChar[i];
            compareT += tChar[i];
        }


        if(compareS.equals(compareT)) return true;
        return false;
    }
}
