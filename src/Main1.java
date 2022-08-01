import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main1{
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(6,6,8,9,14,15,15,15,20));
        Set<Integer> uniqueList = new HashSet<>(list);
        System.out.println(uniqueList);







    }
}
