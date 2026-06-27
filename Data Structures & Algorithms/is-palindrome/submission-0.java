class Solution {
    public boolean isPalindrome(String s) {
        String pallin ="";
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        for(int i = s.length() - 1; i >= 0; i--)        {
            pallin = pallin +s.charAt(i);
        }
        return(s.equals(pallin));
        
    }
}
