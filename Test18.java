 //给定一个整数类型的数组 nums，请编写一个能够返回数组“中心索引”的方法。
    //我们是这样定义数组中心索引的：数组中心索引的左侧所有元素相加的和等于右侧所有元素相加的和
    public int pivotIndex(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int sum = 0;
        int lfs = 0;
        for (int x:nums) {
            sum += x;
        }
        for (int i = 0; i < nums.length ; i++) {
            if(lfs == sum - lfs - nums[i]) {
                return i;
            }
            lfs += nums[i];
        }
        return -1;
    }