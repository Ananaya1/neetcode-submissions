

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        
        LinkedHashMap<Integer, Integer> sortedMap = new LinkedHashMap<>();
        map.entrySet()
           .stream()
           .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
           .forEachOrdered(e -> sortedMap.put(e.getKey(), e.getValue()));

       
        int[] arr = new int[k];
        Iterator<Map.Entry<Integer, Integer>> it = sortedMap.entrySet().iterator();

        for (int i = 0; i < k && it.hasNext(); i++) {
            Map.Entry<Integer, Integer> entry = it.next();
            arr[i] = entry.getKey(); 
        }

        return arr;
    }
}
