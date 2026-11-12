class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int left = 0; 
        HashMap<Character, Integer> winningMap = new HashMap<>();        
        HashMap<Character, Integer> window = new HashMap<>();       

        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);

            if (winningMap.containsKey(c)) {
                winningMap.put(c, winningMap.get(c) + 1);
            }       
            else {
                winningMap.put(c, 1);
            }
        }


        for (int right = 0; right < s2.length(); right++) {

            // 1. Add s2.charAt(right) to window
            char cRight = s2.charAt(right);
            char cLeft = s2.charAt(left);
            if(window.containsKey(cRight))
            {
                window.put(cRight, window.get(cRight) + 1);
            }
            else{
                window.put(cRight, 1);
            }
            // 2. If window is too large:
            //    Remove one count of s2.charAt(left)
            //    Increment left
            if(right - left > s1.length() - 1){
                if(window.get(cLeft) > 1)
                {
                    window.put(cLeft, window.get(cLeft) -1);
                }
                else{
                    window.remove(cLeft);
                }

                left++;
            }

            // 3. If window.equals(winningMap):
            //    return true


            if(window.equals(winningMap)) return true;
        }
        return false;
    }
}
