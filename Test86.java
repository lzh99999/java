给定两个以升序排列的整形数组 nums1 和 nums2, 以及一个整数 k。

定义一对值 (u,v)，其中第一个元素来自 nums1，第二个元素来自 nums2。

找到和最小的 k 对数字 (u1,v1), (u2,v2) ... (uk,vk)。

class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        List<List<Integer>> list = new ArrayList<>();
        if(n1 == 0 || n2 == 0 || k <= 0) {
            return list;
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1,o2)->(nums1[o1[0]]+nums2[o1[1]]-(nums1[o2[0]]+nums2[o2[1]])));
        for(int i = 0;i< n1;i++) {
            pq.offer(new int[]{i,0});
        }
        while(k > 0 && pq.size() > 0) {
            int[] arr = pq.poll();
            if(arr[1]+1 < n2) pq.offer(new int[]{arr[0],arr[1]+1});
            ArrayList<Integer> tmp = new ArrayList<>();
            tmp.add(nums1[arr[0]]);
            tmp.add(nums2[arr[1]]);
            list.add(tmp);
            k--;
        }
        return list;
    }
}