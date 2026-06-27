class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        HashSet<Integer> set = new HashSet<>();
        int longest=0;
        for (int num : nums) {
            set.add(num);
        }
          for (int num : set) {
            int len=1;
            int i=num;
           if(!(set.contains(i-1)))
           {

            while(set.contains(i+1))
            {
                len++;
                i=i+1;
            }
            if(len>longest)
            {
                longest =len;
            }
           }
          
    }
     return longest;  
}
}