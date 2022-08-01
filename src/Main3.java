import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList(List.of(6, 6, 1, 4, 9, 12, 11, 9, 1, 9));
        throwFrequency(list);


    }
    public static void throwFrequency(List<Integer> list) {
        HashMap<Integer, Integer> frequency = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            frequency.put(list.get(i), Collections.frequency(list, list.get(i)));
        }
        System.out.println(frequency);
    }
}
