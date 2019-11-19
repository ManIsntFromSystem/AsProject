import java.util.*;

public class JavaCollectionsLinkedHash{
    public static void main(String[] args) {

        Queue<Integer> q1 = new PriorityQueue<Integer>(5, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o2 > o1 && (o2 % 2) == 0)
                return o1;
                else return 1;
            }
        });
        q1.offer(5);
        q1.offer(4);
        q1.offer(3);
        q1.offer(2);
        q1.offer(1);

        while (!q1.isEmpty()){
            System.out.println(q1.poll());
        }
    }
       /* HashMap<Integer, String> m1 = new SimpleRuCash<>(2);

        //Map.of(1,1,4,5);
        m1.put(12, "1212");
        m1.put(112, "1175652");
        m1.put(1122, "1532");
        m1.put(313, "1156758882");
        Set<Map.Entry<Integer, String>> Re = m1.entrySet();
        Re.forEach(x -> System.out.println(x.getValue()));
        }*/
    }
class SimpleRuCash<K, V> extends LinkedHashMap<K, V> {
    private final int capacity;

    public SimpleRuCash(int capacity) {
        super(capacity + 1, 1.1f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return this.size() > capacity;
    }
}