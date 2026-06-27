class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0)
            return 0;

        HashSet<Character> values = new HashSet<>();
        int i = 0;
        int j = 0;
        int m = 0;

        while (j < s.length()) {

            char c = s.charAt(j);

 
            while (values.contains(c)) {
                values.remove(s.charAt(i));
                i++;
            }

            values.add(c);
            j++;

            m = Math.max(m, j - i);
        }

        return m;
    }
}
