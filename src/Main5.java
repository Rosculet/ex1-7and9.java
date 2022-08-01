import java.util.HashMap;
import java.util.Map;

public class Main5 {
    public static void main(String[] args) {
        HashMap<Character, Integer> symbolMap = new HashMap<>(Map.of('a',2,'b',1,'k',2,'c',3));
        formatToString(symbolMap);
    }

    public static void formatToString(Map<Character,Integer> symbolMap){

        StringBuffer str = new StringBuffer();
        for (Map.Entry<Character, Integer> entry : symbolMap.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                str.append(entry.getKey());
            }
        }
        System.out.println(str);
    }

}
