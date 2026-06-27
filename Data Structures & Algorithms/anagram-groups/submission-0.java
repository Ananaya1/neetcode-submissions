class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> groups = new HashMap<>();
    boolean[] used = new boolean[strs.length]; 

    for (int i = 0; i < strs.length; i++) {
        if (used[i]) continue;
        String key = strs[i]; 
        groups.putIfAbsent(key, new ArrayList<>());
        groups.get(key).add(strs[i]);
        used[i] = true;

        for (int j = i + 1; j < strs.length; j++) {
            if (!used[j] && isAnagram(strs[i], strs[j])) {
                groups.get(key).add(strs[j]);
                used[j] = true;
            }
        }
    }

    return new ArrayList<>(groups.values());
}
    public boolean isAnagram(String s, String t)
    {
        if(s.length()!=t.length())
        {
            return false;
        }
        int [] count=new int[26];
        for(int i=0; i<t.length(); i++)
        {
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
         for(int i=0; i<26; i++)
         {
            if(count[i]!=0)
            {
                return false;
            }
         }
         return true;
    }
    

}
