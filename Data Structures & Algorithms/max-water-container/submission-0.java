class Solution {
    public int maxArea(int[] height) {
        int k=0;
        int j= height.length - 1;
        int maxArea= Math.min(height[k],height[j])* (j-k);
        while(j>k && j<height.length)
        {
             
             int A= Math.min(height[k],height[j])* (j-k);
             if(A>maxArea)
             {
                maxArea = A;
             }
            if(height[k]<height[j])
               {
                k++;
               }
            else
               {
                j--;
               }
        }
        return maxArea;
    }
}