package arrays_hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * LeetCode Problem: Top K Frequent Elements
 * Description: Given a non-empty array of integers, return the k most frequent elements.
 */
public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freqMap = new HashMap<>();
        for(int num: nums){
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> freqMap.get(a) - freqMap.get(b));

        for(int num : freqMap.keySet()){
            heap.offer(num);
            if(heap.size() > k){
                heap.poll();
            }
        }

        int[] result = new int[k];

        for(int i = 0; i < k; i++){
            result[i] = heap.poll();
        }

        return result;
    }
}
