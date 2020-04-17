public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            HashMap<Integer,Integer> map = new HashMap<>();
            while (n-- > 0) {
                int tmp = sc.nextInt();
                if(map.containsKey(tmp)) {
                   map.put(tmp,map.get(tmp)+1);
                }else  {
                    map.put(tmp,1);
                }
            }
            int tmp = sc.nextInt();
            if (map.containsKey(tmp))
               System.out.println(map.get(tmp));
            else
                System.out.println(0);
        }
    }
}