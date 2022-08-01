import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main7 {
    public static void main(String[] args) {
        List<Character> list1 = new ArrayList<>(List.of('a', 'b', 'c', 'd'));
        List<Character> list2 = new ArrayList<>(List.of('c', 'd', 'a', 'b'));

        List<Character> list3 = new ArrayList<>(List.of('d', 'e', 'f'));
        List<Character> list4 = new ArrayList<>(List.of('d', 'f', 'e'));
        checkShift(list1, list2);
        checkShift(list3, list4);
    }

    public static void checkShift(List<Character> list1, List<Character> list2) {

            for (int i = 0; i < list1.size(); i++) {
                if (!list1.equals(list2)) {
                    Collections.rotate(list2, 1);
                }
                if (list1.equals(list2)) {
                    System.out.println("Bingo, lists are cyclical.");
                    return;
                }
            }
        System.out.println("Different");
        }
    }

