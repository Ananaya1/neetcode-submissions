class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j = numbers.length - 1 ;
        int [] soln = new int[2];
        int sum = numbers[i]+numbers[j];
        while(i<j)
        {
            sum = numbers[i]+numbers[j];
            if(sum == target)
            {
               soln[0]=i+1;
               soln[1]=j+1;
               return soln;
            }
            else if (sum < target)
            {
                i++;
            }
            else j--;
        }
        return soln;

    }
}
