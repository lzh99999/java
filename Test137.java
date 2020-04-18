import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int math = sc.nextInt();
            HashMap<String, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                String key = sc.next();
                int value = sc.nextInt();
                map.put(key, value);
            }
            PriorityQueue<Map.Entry<String, Integer>> pq = null;
            if (math == 1) {
                pq = new PriorityQueue<>(new Comparator<Map.Entry<String, Integer>>() {
                    @Override
                    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                        return Integer.compare(o1.getValue() - o2.getValue(), 0);
                    }
                });
            } else if (math == 0) {
                pq = new PriorityQueue<>(new Comparator<Map.Entry<String, Integer>>() {
                    @Override
                    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                        return Integer.compare(o2.getValue() - o1.getValue(), 0);
                    }
                });
            } else return;

            for (Map.Entry<String, Integer> e : map.entrySet()) {
                pq.offer(e);
            }
            while (!pq.isEmpty()) {
                Map.Entry<String, Integer> poll = pq.poll();
                System.out.println(poll.getKey() + " " + poll.getValue());
            }
        }
    }
}