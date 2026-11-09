class Solution {
    public boolean isAnagram(String s, String t) {


        char[] sarr = s.toCharArray();
        Arrays.sort(sarr);

        char[] tarr = t.toCharArray();
        Arrays.sort(tarr);

        String sSorted = new String(sarr);
        String tSorted = new String(tarr);

        if(sSorted.equals(tSorted)) return true;


        return false;

        // for(int i = 0; i < s.length(); i++){
        //     for(int j = 0; j< t.length(); i++){

        //     }
        // }


    }
}
