class Solution {
    public String minWindow(String s, String t) {

        HashMap<Character, Integer> winningMap = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);

            if (winningMap.containsKey(c)) {
                winningMap.put(c, winningMap.get(c) + 1);
            } else {
                winningMap.put(c, 1);
            }
        }

        int left = 0;
        String subString = "";
        int smallestSubstring = Integer.MAX_VALUE;

        for (int right = 0; right < s.length(); right++) {

            char rChar = s.charAt(right);

            if (winningMap.containsKey(rChar)) {
                if (window.containsKey(rChar)) {
                    window.put(rChar, window.get(rChar) + 1);
                } else {
                    window.put(rChar, 1);
                }
            }

            while (isValid(window, winningMap)) {

                int currentLength = right - left + 1;

                if (currentLength < smallestSubstring) {
                    smallestSubstring = currentLength;
                    subString = s.substring(left, right + 1);
                }

                char lChar = s.charAt(left);

                if (window.containsKey(lChar)) {
                    if (window.get(lChar) > 1) {
                        window.put(lChar, window.get(lChar) - 1);
                    } else {
                        window.remove(lChar);
                    }
                }

                left++;
            }
        }

        return subString;
    }

    public boolean isValid(
        HashMap<Character, Integer> window,
        HashMap<Character, Integer> winningMap
    ) {
        for (char c : winningMap.keySet()) {
            if (window.getOrDefault(c, 0) < winningMap.get(c)) {
                return false;
            }
        }

        return true;
    }
}
