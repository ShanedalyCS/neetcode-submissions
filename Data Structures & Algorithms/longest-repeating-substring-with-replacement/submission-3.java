class Solution {
    public int characterReplacement(String s, int k) {
        int[] frequency = new int[26];

        int left = 0;
        int maxFrequency = 0;
        int longest = 0;

        for (int right = 0; right < s.length(); right++) {
            int index = s.charAt(right) - 'A';
            frequency[index]++;

            maxFrequency = Math.max(maxFrequency, frequency[index]);

            int windowLength = right - left + 1;

            if (windowLength - maxFrequency > k) {
                frequency[s.charAt(left) - 'A']--;
                left++;
            }

            longest = Math.max(longest, right - left + 1);
        }

        return longest;
    }
}