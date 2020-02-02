
import java.util.*;
public class Main {
    //每组输入数据共两行。
    //第一行为字符串A
    //第二行为字符串B
    //字符串长度均小于100且只包含小写字母
    //判断数组中是否为后序遍历序列
    //输出一个数字，表示把字符串B插入字符串A之后构成一个回文串的方法数
    /*public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();
            int count = 0;
            for(int i = 0;i<=str1.length();i++) {
                StringBuffer sb = new StringBuffer(str1);
                sb.insert(i,str2);
                if(isHuiWen(sb.toString())) {
                    count++;
                }
            }
            System.out.println(count);
        }
        public static boolean isHuiWen(String str) {
            int i =0;
            int j = str.length()-1;
            while(i<j) {
                if(str.charAt(i)!=str.charAt(j)){
                    return false;
                }
                i++;
                j--;
            }
            return true;
        }
    }*/
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence == null) {
            return false;
        }
        return fun(sequence,0,sequence.length-1);
    }
    public boolean fun(int [] sequence,int start,int root) {
        if(start>=root) {
            return true;
        }
        int i;
        for( i = start;i<=root;i++) {
            if(sequence[i] > sequence[root]) {
                break;
            }
        }
        for(int j = i;j < root;j++) {
            if(sequence[j] < sequence[root]) {
                return false;
            }
        }
        return fun(sequence,0,i-1)&&fun(sequence,i,root-1);
    }
    //-------------------------------------------------
    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    //二叉树 层序遍历
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root){
        ArrayList<Integer> ret = new ArrayList<>();
        if (root==null) {
            return ret;
        }
        Queue<TreeNode> queue = new LinkedList<>();//定义队列
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            ret.add(node.val);
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
        return ret;
    }


    //给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集
    public static List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            int size = list.size();
            for (int j = 0; j < size; j++) {
                List<Integer> tmp = new ArrayList<>(list.get(j));//每次取已经存在的数据 进行后面追加
                tmp.add(nums[i]);
                list.add(tmp);
            }
        }
        return list;
    }

    /**
     * 描述:给定一组字符，使用原地算法将其压缩。
     * 压缩后的长度必须始终小于或等于原数组长度。
     * 数组的每个元素应该是长度为1 的字符（不是 int 整数类型）。
     * 在完成原地修改输入数组后，返回数组的新长度。
     */
    public static int compress(char[] chars) {     // 数组大小范围： 1 <= chars.length <= 1000
        int left = 0;
        int size = 0;
        for (int right = 0; right <= chars.length; right++) {
            //如果全部为相同的数 right == chars.length
            // 如果chars[right] != chars[left]  才会进行加入数字
            if (right == chars.length || chars[right] != chars[left]) {
                chars[size++] = chars[left];
                if (right - left > 1) {
                    for (char c : String.valueOf(right - left).toCharArray()) {
                        chars[size++] = c;
                    }
                }
                left = right;
            }
        }
        return size;
    }

    //给定一个整数数组，你需要寻找一个连续的子数组，
// 如果对这个子数组进行升序排序，那么整个数组都会变为升序排序。
//你找到的子数组应是最短的，请输出它的长度
    /*
    同时从前往后和从后往前遍历，分别得到排序数组的右边界和左边界；
寻找右边界：从前往后遍历的过程中，用max记录遍历过的最大值，如果max大于当前的nums[i]，
说明nums[i]的位置不正确，应该属于需要排序的数组，因此将右边界更新为i，然后更新max；
这样最终可以找到需要排序的数组的右边界，右边界之后的元素都大于max；
寻找左边界：从后往前遍历的过程中，用min记录遍历过的最小值，如果min小于当前的nums[j]，
说明nums[j]的位置不正确，应该属于需要排序的数组，因此将左边界更新为j，然后更新min；
这样最终可以找到需要排序的数组的左边界，左边界之前的元素都小于min；
（从前往后遍历和从后往前遍历两个过程可以分两次循环完成，也可以放一起完成，这样的话就有：j=len-i-1）

     */
    public static int findUnsortedSubarray(int[] nums) {
        int len = nums.length;
        int max = nums[0];
        int min = nums[len - 1];
        int l = 0, r = -1;
        for (int i = 0; i < len; i++) {
            if (max > nums[i]) {
                r = i;
            } else {
                max = nums[i];
            }
            if (min < nums[len - 1 - i]) {
                l = len - 1 - i;
            } else {
                min = nums[len - 1 - i];
            }
        }
        return r - l + 1;
    }


}