import java.util.ArrayList;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {
        Boolean head = true;
        Boolean tail = false;
        List<Boolean> result = new ArrayList<>(List.of(head,tail,tail,tail,tail,tail,head,head,head,tail));
        winStreak(result);
    }
    public static int winStreak (List<Boolean> list) {
        int intermediate = 1;
        int streacCount = 0;
        String b = null;

        for (int i = 0; i < list.size()-1; i++) {
            if(list.get(i) == list.get(i + 1)) {
                intermediate++;
                continue;
            }
            if (intermediate > streacCount) {
                streacCount = intermediate;
                intermediate = 1;
                b = String.valueOf(list.get(i));
            }
        }
        System.out.println("The longest win streak is: " + streacCount + System.lineSeparator() + "With an indicator: " + b);
        return streacCount;
    }
}
