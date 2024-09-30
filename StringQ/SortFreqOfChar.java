package StringQ;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
public class SortFreqOfChar {
    static String frequencySort(String s) {
        Map<Character, Integer> hashMap = new HashMap<>();
        for (char c : s.toCharArray())
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        PriorityQueue<Character> priorityQueue = new PriorityQueue<>((a, b) -> hashMap.get(a) - hashMap.get(b));
        priorityQueue.addAll(hashMap.keySet());
        StringBuilder stringBuilder = new StringBuilder();
        while (!priorityQueue.isEmpty()) {
            char ch = priorityQueue.poll();
            stringBuilder.append(String.valueOf(ch).repeat(Math.max(0, hashMap.get(ch))));
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
      System.out.println(frequencySort("tree"));
    }
}
