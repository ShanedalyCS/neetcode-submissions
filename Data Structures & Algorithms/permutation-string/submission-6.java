
class Solution {
    public boolean checkInclusion(String s1, String s2) {

        // if (s1.length() > s2.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();

        // Count how many of each character we need
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        int matched = 0;

        for (int right = 0; right < s2.length(); right++) {

            char rightChar = s2.charAt(right);

            // Add the right character to our window
            if (map.containsKey(rightChar)) {
                if (map.get(rightChar) > 0) {
                    matched++;
                }

                map.put(rightChar, map.get(rightChar) - 1);
            }

            // If the window is too large, remove the left character
            if (right - left + 1 > s1.length()) {

                char leftChar = s2.charAt(left);

                if (map.containsKey(leftChar)) {
                    if (map.get(leftChar) >= 0) {
                        matched--;
                    }

                    map.put(leftChar, map.get(leftChar) + 1);
                }

                left++;
            }

            // All required characters have been matched
            if (matched == s1.length()) {
                return true;
            }
        }

        return false;
    }
}
