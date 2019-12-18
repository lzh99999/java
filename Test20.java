  //第三大的数
    public int thirdMax(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        for (int x:nums) {
            set.add(x);
        }
        nums = new int[set.size()];
        int i = 0;
        for (int x:set) {
            nums[i++] = x;
        }
        Arrays.sort(nums);
        if (nums.length < 2) {
            return nums[nums.length-1];
        }else {
            return nums[nums.length-3];
        }
    }