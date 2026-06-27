class Solution {
  public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();

        if (n1 > n2) return false;

        for (int i = 0; i <= n2 - n1; i++) {
            String window = s2.substring(i, i + n1);
            if (permutation(s1, window)) {
                return true;
            }
        }

        return false;
    }

    public boolean permutation(String s1, String s2) {
        int arr[] = new int[26];

        if (s1.length() != s2.length())
            return false;

        for (int i = 0; i < s1.length(); i++)
            arr[s1.charAt(i) - 'a']++;

        for (int i = 0; i < s2.length(); i++)
            arr[s2.charAt(i) - 'a']--;

        for (int count : arr)
            if (count != 0)
                return false;

        return true;
    }
}

