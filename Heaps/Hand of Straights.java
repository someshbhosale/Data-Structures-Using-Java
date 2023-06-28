// Using TreeMap
class Solution {
    public boolean isNStraightHand(int[] hand, int W) {
        if (hand.length % W != 0) return false;
        
        TreeMap<Integer, Integer> map = new TreeMap<>();    
        for (int h : hand) map.put(h, map.getOrDefault(h, 0) + 1);
    
        
        while (map.size() > 0) {
            int val = map.firstKey();
            for (int i = val; i < val + W; i++) {
                if (!map.containsKey(i)) return false;
                
                map.put(i, map.get(i) - 1);
                if (map.get(i) == 0) map.remove(i);
            }
        }
        
        return true;
    }
}
//Using Priority Queue(Heap)
class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length%groupSize!=0)
            return false; 
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i:hand)
        {
            pq.add(i);
        }

        while(!pq.isEmpty())
        {
            int head=pq.poll();
            for(int i=1; i<groupSize; i++)
            {
                if(!pq.remove(head+i))
                    return false;
            }
        }
        return true;     
        
    }
}