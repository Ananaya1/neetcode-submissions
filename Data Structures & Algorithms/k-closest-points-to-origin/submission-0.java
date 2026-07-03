class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((x, y) -> 
        - (x[0] * x[0] + x[1] * x[1]) + (y[0] * y[0] + y[1] * y[1]));

        for(int[] p : points) {
            pq.offer(p);
            if(pq.size() > k) pq.poll();
        }

        return pq.toArray(new int[k][2]);
    }
}