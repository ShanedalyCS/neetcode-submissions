class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> window = new HashSet<>();

        int left = 0;
        int longest = 0;

        for (int right = 0; right < s.length(); right++) {
            char current = s.charAt(right);

            // Remove characters until current is no longer duplicated
            while (window.contains(current)) {
                window.remove(s.charAt(left));
                left++;
            }

            window.add(current);

            longest = Math.max(longest, right - left + 1);
        }

        return longest;
    }
}