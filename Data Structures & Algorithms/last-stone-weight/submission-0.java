class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i =0; i < stones.length; i++)
        {
            maxHeap.add(stones[i]);
        }
        while (maxHeap.size() > 1)
        {
            int a = maxHeap.poll();
            int b = maxHeap.poll();
            if((a-b) != 0)
             maxHeap.add(Math.abs(a-b));
        }
          return maxHeap.isEmpty() ? 0 : maxHeap.poll();
    }
}