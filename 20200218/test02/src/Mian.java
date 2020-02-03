/**
 * 描述:克鲁斯卡尔算法   用边来算
 */
public class Mian {
    public static void main(String[] args) {
        Granf granf = new Granf(15);
        granf.createEdges();
        granf.kluskrl();
    }
}

class Granf {
    private Edge[] edges;//存储边长的数组
    private int size;//数组的大小

    public Granf(int size) {
        this.size = size;
        edges = new Edge[size];
    }

    //创建边的数组
    public void createEdges() {
        edges[0] = new Edge(4, 7, 7);
        edges[1] = new Edge(2, 8, 8);
        edges[2] = new Edge(0, 1, 10);
        edges[3] = new Edge(0, 5, 11);
        edges[4] = new Edge(1, 8, 12);
        edges[5] = new Edge(3, 7, 16);
        edges[6] = new Edge(1, 6, 16);
        edges[7] = new Edge(5, 6, 17);
        edges[8] = new Edge(1, 2, 18);
        edges[9] = new Edge(6, 7, 19);
        edges[10] = new Edge(3, 4, 20);
        edges[11] = new Edge(3, 8, 21);
        edges[12] = new Edge(2, 3, 22);
        edges[13] = new Edge(3, 6, 24);
        edges[14] = new Edge(4, 5, 26);
    }

    //克鲁斯卡尔算法
    public void kluskrl() {
        int m, n, sum = 0;
        int[] parent = new int[size];//存放以下标为起点，值为终点
        for (int i = 0; i < size; i++) {
            parent[i] = 0;
        }
        for (int i = 0; i < size; i++) {
            m = find(parent, edges[i].begin);
            n = find(parent, edges[i].end);
            //如果从开始和结束到达的终点一样说明 成环了
            if (m != n) {
                sum+=edges[i].value;
                parent[m] = n;//把m-》n这条边放进来
                System.out.println("起始：" + edges[i].begin + "结束：" + edges[i].end);
            }else {
                System.out.println("有环");
            }
        }
        System.out.println(sum);
    }
//从一个点到最后一个点
    private int find(int[] parent, int i) {
        while (parent[i] > 0) {
            i = parent[i];
        }
        return i;
    }

    class Edge {
        private int begin;
        private int end;
        private int value;

        public Edge(int begin, int end, int value) {
            this.begin = begin;
            this.end = end;
            this.value = value;
        }

        public int getBegin() {
            return begin;
        }

        public void setBegin(int begin) {
            this.begin = begin;
        }

        public int getEnd() {
            return end;
        }

        public void setEnd(int end) {
            this.end = end;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
}