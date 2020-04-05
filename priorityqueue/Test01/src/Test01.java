import java.util.*;

/**
 * 描述:
 */
public class Test01 {
    public int lastStoneWeight(int[] stones) {
        if(stones == null || stones.length == 0) {
            return 0;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1,o2) -> o2 - o1);
        for (int i : stones) {
            pq.offer(i);
        }
        while (pq.size() > 1) {
            int left = pq.poll();
            int right = pq.poll();
            int tmp = Math.abs(left - right);
            pq.offer(tmp);
        }
        return pq.poll();
    }
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> ret = new ArrayList<>();
        if(nums1 == null || nums2 == null || k <= 0) {
            return ret;
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return (o1[0]+o1[1])-(o2[0]+o2[1]);
            }
        });

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                pq.add(new int[]{nums1[i],nums2[j]});
            }
        }
        for (int i = 0; i < k; i++) {
            ArrayList<Integer> tmp = new ArrayList<>();
            int[] arr = pq.poll();
            if (arr != null) {
                tmp.add(arr[0]);
                tmp.add(arr[1]);
                ret.add(tmp);
            }
        }
        return ret;
    }
    public static void main(String[] args) {

    }
}
