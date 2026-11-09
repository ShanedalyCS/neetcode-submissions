class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);
        
        String sSorted = new String(sArray);
        String tSorted = new String(tArray);

        if(sSorted.equals(tSorted)) return true;
        else return false;
    }
}
