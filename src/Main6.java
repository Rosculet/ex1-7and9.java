import java.util.*;

public class Main6 {
    public static void main(String[] args) {

        Map<Character, Set<String>> map = new HashMap<>();
        map.put('a', new HashSet<>(List.of("bsdasd","asdadad","bsdasds")));
        map.put('b', new HashSet<>(List.of("bsdasd","asdadad","aasdasds")));
        map.put('c', new HashSet<>(List.of("csdasd","csdadad","asdasds")));
        readjust(map);
        for (Map.Entry<Character, Set<String>> iterator : map.entrySet()) {
            System.out.println(iterator);
        }
    }

    /*
    Метод вытаскиывает все значения String из всех Set-ов нашей Маp и записывает их в отдельный Set "intermediate". После этого заново перераспределяем все элементы
    String в правильные Set-ы.
     */

    public static Map<Character, Set<String>> readjust (Map <Character,Set<String>> map){
        Set<String> intermediate = new HashSet<>();

        for (Map.Entry<Character, Set<String>> iterator : map.entrySet()) {
            for (String setIterator : iterator.getValue()) {
                intermediate.add(setIterator);
            }
            iterator.getValue().clear();
        }
        for (String iterator : intermediate) {
            map.get(iterator.charAt(0)).add(iterator);
            }
        return map;
        }
    }
