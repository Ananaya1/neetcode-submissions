class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if(s.isEmpty())
        {
            return true;
        }
        char start;
        char end = s.charAt(s.length()-1);
        int i=0;
        int j = s.length()-1;
        while(i<j)
        {
            start = s.charAt(i);
            end = s.charAt(j);
            if(start != end)
              return false;
            i++;
            j--;
        }
        return true;
    }
}
