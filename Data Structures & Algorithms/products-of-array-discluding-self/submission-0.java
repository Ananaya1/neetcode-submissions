class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] soln = new int[nums.length];
        soln[0]=1;
for( int index=1; index < nums.length; index++)
{
    soln[index]=soln[index-1]*nums[index-1];
}
int postfix = 1;
for(int index = nums.length-1; index>=0; index --)
{
    soln[index] *=postfix;
    postfix *= nums[index];
}
       
    return soln;
}
}